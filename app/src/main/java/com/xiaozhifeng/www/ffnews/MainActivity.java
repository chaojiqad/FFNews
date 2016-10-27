package com.xiaozhifeng.www.ffnews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.xiaozhifeng.www.ffnews.bean.Shares;
import com.xiaozhifeng.www.ffnews.mvp.presenter.SharesPresenter;
import com.xiaozhifeng.www.ffnews.mvp.presenter.SharesPresenterImpl;
import com.xiaozhifeng.www.ffnews.mvp.view.SharesView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SharesView {

    private static final String TAG = "MainActivity";

    private SharesPresenter sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initlistener();
    }

    private void initlistener() {

        findViewById(R.id.btn_get_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp.getSharesList();
            }
        });
    }

    private void initData() {
        sp = new SharesPresenterImpl(this);
    }

    @Override
    public void showData(List<Shares> list) {
        String msg = "";

        for (Shares s : list) {
            msg += s.getWebsite();
        }

        ((TextView) findViewById(R.id.tv_msg)).setText(msg);
    }
}
