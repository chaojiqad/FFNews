package com.xiaozhifeng.www.ffnews.mvp.model;

import com.xiaozhifeng.www.ffnews.bean.Shares;
import com.xiaozhifeng.www.ffnews.web.HttpUtils;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class SharesModelImpl implements SharesModel {




    @Override
    public void loadData(final OnLoadListener onLoadListener) {
        HttpUtils.getInstance().getConsultation(new Subscriber<List<Shares>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<Shares> list) {
                onLoadListener.onSucces(list);
            }
        }, 0);
    }
}
