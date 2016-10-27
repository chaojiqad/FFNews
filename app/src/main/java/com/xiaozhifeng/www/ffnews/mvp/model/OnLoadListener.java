package com.xiaozhifeng.www.ffnews.mvp.model;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public interface OnLoadListener {

    <T> void onSucces(T t);

    void onFial(String msg);
}
