package com.xiaozhifeng.www.ffnews.web;

import com.xiaozhifeng.www.ffnews.bean.HttpRequest;

import rx.functions.Func1;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class HttpResultFunc<T> implements Func1<HttpRequest<T>, T> {


    @Override
    public T call(HttpRequest<T> tHttpRequest) {


        if (tHttpRequest.getRetCode() == "200") {
            tHttpRequest.getData();
        }


        return null;

    }
}
