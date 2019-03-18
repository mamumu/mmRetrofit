package com.mumu.mmretrofit;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mumu.retrofit.MmLoadingAndToast;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public class BaseActivity extends AppCompatActivity implements MmLoadingAndToast {
    private MmLoadingAndToast mmLoadingAndToast;

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
