package com.xiaozhifeng.www.ffnews.bean;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class Shares {


    /**
     * id : 66
     * title : A股大震荡日，你的心脏还好吗
     * website : 早知道
     * time : 2016-07-13 16:32:44
     * image : {"thumb":""}
     * message : 大震荡日，你的心脏还好吗？好久没有这么刺激了吧？今天A股先暴跌再暴涨，上证振幅2.18%，创业振幅2.94%。今天有事，不能盯盘，不知道算不算幸运，内心少了很多煎熬，也没有在破位的时候割肉跑路。我只能说，主力，算你狠！创业板加上今天，回调7天了，早盘加速跳水连破二大支撑的时候，相信很多技术派夺路而走了。智不强者志不达，这时候策略与信念是多么重要。一直在说，这波行情是主力加仓上证，上证搭台后，创业再唱戏， 我认为7月吃饭行情还在。今天盘中急跌，但上证指数是没有破位的，更没有破掉工作线，也就是台子还在。1、有人说这几天的恐慌回调是南海争端（军工板走强，也是这个因素），也有人说是因为发现再搞创业板真有可能在为退市血本无归（欣泰退市），还有人说技术上也需要回调了，要上天了（次新板）……好吧，都有道理。可是你能解释他今天为什么暴涨吗？2、为什么暴涨，今天很多媒体都会讲，我会临睡前当催眠用，也听听会不会有靠谱的东西。建议学会不去猜走势，不去事后找逻辑，那是大仙和砖家做的事。3、怎么做？去找强势回调板块和个股。重点是一定回调过的。回调过的……。4、上证持仓工作线2971，创业板在2213；不破工作线就持有。
     */

    private String id;
    private String title;
    private String website;
    private String time;
    private String image;
    private String message;

    public Shares() {

    }


    public Shares(String id, String title, String website, String time, String image, String message) {
        this.id = id;
        this.title = title;
        this.website = website;
        this.time = time;
        this.image = image;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
