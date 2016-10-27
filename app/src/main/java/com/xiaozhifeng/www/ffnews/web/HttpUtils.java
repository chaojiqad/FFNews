package com.xiaozhifeng.www.ffnews.web;

import com.xiaozhifeng.www.ffnews.bean.HttpRequest;
import com.xiaozhifeng.www.ffnews.bean.Shares;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class HttpUtils {

    public static final String BASE_URL = "http://123.56.82.112/";

    private static final int DEFAULT_TIMEOUT = 5;


    private Retrofit retrofit;

    private APIService apiService;

    public HttpUtils() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder().client(builder.build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).baseUrl(BASE_URL).build();

        apiService = retrofit.create(APIService.class);
    }




    private static class Instance {
        private static final HttpUtils httpUtils = new HttpUtils();
    }

    /**
     * 获取httputils的单例
     *
     * @return
     */
    public static HttpUtils getInstance() {
        return Instance.httpUtils;
    }

    /**
     * 获取新闻列表
     */
    public void getConsultation(Subscriber<List<Shares>> subscriber, int page) {

        Observable<List<Shares>> observable = apiService.getConsultation().map(new Func1<HttpRequest<List<Shares>>, List<Shares>>() {
            @Override
            public List<Shares> call(HttpRequest<List<Shares>> listHttpRequest) {
                return listHttpRequest.getData();
            }
        });
        toSubsribe(observable, subscriber);
    }


    public <T> void toSubsribe(Observable<T> o, Subscriber<T> s) {
        o.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(s);
    }


}
