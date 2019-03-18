package com.mumu.retrofit;

import com.orhanobut.logger.Logger;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 * 日志打印类
 */
public class MmLogger implements HttpLoggingInterceptor.Logger{
    private StringBuilder mMessage = new StringBuilder();

    @Override
    public void log(String message) {
        // 请求或者响应开始
        if (message.startsWith("--> POST")) {
            mMessage.setLength(0);
        }
        mMessage.append(message.concat("\n"));
        // 响应结束，打印整条日志
        if (message.startsWith("<-- END HTTP")) {
            Logger.d("开始打印Request信息--->" + "\n\n" +
                    mMessage.toString()
                    + "\n" + "Request信息打印结束<---");
        }
    }
}
