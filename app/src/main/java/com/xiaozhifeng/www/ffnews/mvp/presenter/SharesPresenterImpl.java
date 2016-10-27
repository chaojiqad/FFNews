package com.xiaozhifeng.www.ffnews.mvp.presenter;

import com.xiaozhifeng.www.ffnews.bean.Shares;
import com.xiaozhifeng.www.ffnews.mvp.model.OnLoadListener;
import com.xiaozhifeng.www.ffnews.mvp.model.SharesModel;
import com.xiaozhifeng.www.ffnews.mvp.model.SharesModelImpl;
import com.xiaozhifeng.www.ffnews.mvp.view.SharesView;

import java.util.List;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class SharesPresenterImpl implements SharesPresenter, OnLoadListener {

    private SharesView sharesView;

    private SharesModel sharesModel;

    public SharesPresenterImpl(SharesView sharesView) {
        this.sharesView = sharesView;
        sharesModel = new SharesModelImpl();
    }

    @Override
    public void getSharesList() {
        sharesModel.loadData(this);
    }

    @Override
    public <T> void onSucces(T t) {
        sharesView.showData((List<Shares>) t);
    }

    @Override
    public void onFial(String msg) {

    }
}
