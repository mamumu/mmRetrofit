package com.mumu.retrofit;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public interface MmLoadingAndToast {

    /**
     *展示一个正在加载的Loading
     */
    void showLoading();

    /**
     * 取消展示Loading
     */
    void dismissLoading();

    /**
     * 弹出一个Toast提示
     * @param msg 提示的内容
     */
    void showToast(String msg);
}
