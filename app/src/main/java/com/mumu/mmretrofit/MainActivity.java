package com.mumu.mmretrofit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.mumu.retrofit.MmObserverWrapper;
import com.mumu.retrofit.MmResponse;
import com.mumu.retrofit.MmRetrofit;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public class MainActivity extends BaseActivity {


    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    private void initView() {
        HashMap<String, Object> map = new HashMap<String, Object>(16);
        map.put("phoneNumber", "15705169056");
        map.put("password", "a123456");
        map.put("userType", 1);
        map.put("accountType", 2);
        MmRetrofit.getInstance().getRetrofitService(TestApi.class,TestUrl.BASE_URL)
                .getLogin(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MmObserverWrapper<MmResponse<TestEntity.ResultBean>>() {
                    @Override
                    protected void success(MmResponse<TestEntity.ResultBean> data) {
                        text.setText(data.getResult().getToken());
                    }
                });
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        initView();
    }
}
