package com.mumu.retrofit;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author : zlf
 * date   : 2019/3/5
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 * retrofit的开始类
 */
public class MmRetrofit {

    /**
     * 默认的超时时间
     */
    private static final int DEFAULT_MILLISECONDS = 60000;

    private MmRetrofit() {

    }

    /**
     * 单例模式
     */
    private static class MmRetrofitInstance {
        private final static MmRetrofit MM_RETROFIT = new MmRetrofit();
    }

    /**
     * 单例模式
     */
    public static MmRetrofit getInstance() {
        return MmRetrofitInstance.MM_RETROFIT;
    }

    /**
     * 创建retrofit的对象
     * @param baseUrl 基础url
     * @return retrofit的建造者
     */
    private Retrofit createRetrofit(String baseUrl) {
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new MmLogger());
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient().newBuilder()
                .readTimeout(DEFAULT_MILLISECONDS, TimeUnit.SECONDS)
                .connectTimeout(DEFAULT_MILLISECONDS, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_MILLISECONDS, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    /**
     * 对外获取建造者的方法
     * @param cls
     * @param <T>
     * @return
     */
    public <T> T getRetrofitService(Class<T> cls,String baseUrl) {
        return createRetrofit(baseUrl).create(cls);
    }

}
