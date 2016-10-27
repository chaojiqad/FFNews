package com.xiaozhifeng.www.ffnews.web;

import com.xiaozhifeng.www.ffnews.bean.HttpRequest;
import com.xiaozhifeng.www.ffnews.bean.Shares;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public interface APIService {

    @GET("gupiao/index.php/Api/Apidirect/getConsultation/")
    //Observable<HttpRequest<List<Shares>>> getConsultation(@Query("page") int page);
    Observable<HttpRequest<List<Shares>>> getConsultation();
}
