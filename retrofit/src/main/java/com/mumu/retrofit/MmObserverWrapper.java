package com.mumu.retrofit;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import io.reactivex.observers.DisposableObserver;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public abstract class MmObserverWrapper<T extends MmResponse> extends DisposableObserver<T> {
//    private MmLoadingAndToast mmLoadingAndToast;
//
//    public MmObserverWrapper(MmLoadingAndToast mmLoadingAndToast) {
//        this.mmLoadingAndToast = mmLoadingAndToast;
//    }

    @Override
    protected void onStart() {
        super.onStart();
//        mmLoadingAndToast.showLoading();
    }

    @Override
    public void onNext(T t) {
        if (t.isSuccess()) {
            Gson gson = new Gson();
            success(t);
            Logger.i("开始打印服务器返回信息--->"
                    + "\n" +
                    "接口请求成功返回码--->"
                    + "\n" +
                    t.getStatusCode()
                    + "\n" +
                    "接口请求成功返回信息--->"
                    + "\n" +
                    t.getMessage()
                    + "\n" +
                    "接口请求成功返回数据--->"
                    + "\n" +
                    gson.toJson(t)
            );
        } else {
//            mmLoadingAndToast.showToast(t.getMessage());
            onFailure(t.getStatusCode(), t.getMessage());
        }
//        mmLoadingAndToast.dismissLoading();
    }

    @Override
    public void onError(Throwable e) {
//        mmLoadingAndToast.dismissLoading();
        onFailure(200, e.getMessage());
    }

    @Override
    public void onComplete() {
//        mmLoadingAndToast.dismissLoading();
        complete();
    }

    protected abstract void success(T t);

    private void onFailure(int code, String errorMsg) {
//        mmLoadingAndToast.showToast(errorMsg);
        Logger.d("接口请求错误返回码--->" + "\n" +
                code);
        Logger.d("接口请求错误信息--->" + "\n" +
                errorMsg);
    }

    private void complete() {

    }
}
