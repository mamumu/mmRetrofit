package com.mumu.mmretrofit;

import com.mumu.retrofit.MmResponse;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public interface TestApi {

    @FormUrlEncoded
    @POST("api/AppPubilc/user_login")
    Observable<MmResponse<TestEntity.ResultBean>> getLogin(@FieldMap HashMap<String, Object> testEntryMap);
}
