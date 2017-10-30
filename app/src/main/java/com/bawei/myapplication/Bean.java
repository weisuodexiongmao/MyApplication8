package com.bawei.myapplication;

import java.util.List;

/**
 * Created by 猥琐的熊猫 on 2017/10/16.
 */

public class Bean {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20171016092851","title":"白谦慎：\u201c娟娟发屋\u201d与当代普通人的意趣书写","source":"书法聚焦","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-51081177.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092851"},{"id":"wechat_20171016093175","title":"知识帖 | 男人与玉是这样的关系","source":"今相玉","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34412715.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016093175"},{"id":"wechat_20171016092352","title":"秋风起，秋雨落，一首《思念》致牵挂的朋友！","source":"爱听音乐","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-24050169.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092352"},{"id":"wechat_20171016092857","title":"读者故事 | 消费前问问自己，你真的需要这些东西吗？","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833422.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092857"},{"id":"wechat_20171016092841","title":"你是我不聊天也不想删掉的人。","source":"南风录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833377.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092841"},{"id":"wechat_20171016092885","title":"人为什么会\u201c掩耳盗铃\u201d？（黑白先生）","source":"黑白先生","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092885"},{"id":"wechat_20171016093008","title":"北大61岁美女教授的演讲刷屏了，说的非常大气，值得每个人看看","source":"笔稿","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54834251.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016093008"},{"id":"wechat_20171016092983","title":"精选卡夫卡的16句名言，人生的答案尽数说尽","source":"笔稿","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54834070.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092983"},{"id":"wechat_20171016092847","title":"【开奖啦！】\u201c驾车零违法\u2018油\u2019奖带回家\u201d活动第一批获奖名单公布！","source":"山东高速交警","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23133808.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092847"},{"id":"wechat_20171016092838","title":"播报 | 苹果垃圾快充，一加收集用户隐私，诺记狂卖1千万","source":"科技每日推送","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833372.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092838"},{"id":"wechat_20171016092801","title":"点滴 | 吃饭见人品","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-25750095.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092801"},{"id":"wechat_20171016092822","title":"完了！中国或将禁产禁售iPhone？","source":"科技每日推送","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833288.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092822"},{"id":"wechat_20171016092826","title":"【微警示】安全行车，请不要玩\u201c外挂\u201d","source":"山东高速交警","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23133808.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092826"},{"id":"wechat_20171016092821","title":"这是一封给时尚精们的chic请柬","source":"发现上海","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833229.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092821"},{"id":"wechat_20171016092767","title":"夜听 | 所有的伟大，都源于一个勇敢的开始","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54832952.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092767"},{"id":"wechat_20171016092830","title":"又是一年红叶季，西安这些地方的红叶将刷爆朋友圈","source":"凤城五路","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45722503.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092830"},{"id":"wechat_20171016092882","title":"【固安新闻】固安公共自行车新增70站点，快来看看有没有你家！","source":"固安在线网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-43798552.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092882"},{"id":"wechat_20171016092888","title":"MOG 抗体与脱髓鞘病，究竟有什么关系？","source":"丁香园","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-48428203.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092888"},{"id":"wechat_20171016092871","title":"一年四个月的反思：我这还叫创业吗？","source":"旺说","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833438.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092871"},{"id":"wechat_20171016092861","title":"原来剥栗子只要3秒钟，这么多年来都做错了！","source":"新疆949交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13381185.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092861"}],"totalPage":8296,"ps":20,"pno":1}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * list : [{"id":"wechat_20171016092851","title":"白谦慎：\u201c娟娟发屋\u201d与当代普通人的意趣书写","source":"书法聚焦","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-51081177.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092851"},{"id":"wechat_20171016093175","title":"知识帖 | 男人与玉是这样的关系","source":"今相玉","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34412715.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016093175"},{"id":"wechat_20171016092352","title":"秋风起，秋雨落，一首《思念》致牵挂的朋友！","source":"爱听音乐","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-24050169.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092352"},{"id":"wechat_20171016092857","title":"读者故事 | 消费前问问自己，你真的需要这些东西吗？","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833422.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092857"},{"id":"wechat_20171016092841","title":"你是我不聊天也不想删掉的人。","source":"南风录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833377.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092841"},{"id":"wechat_20171016092885","title":"人为什么会\u201c掩耳盗铃\u201d？（黑白先生）","source":"黑白先生","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092885"},{"id":"wechat_20171016093008","title":"北大61岁美女教授的演讲刷屏了，说的非常大气，值得每个人看看","source":"笔稿","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54834251.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016093008"},{"id":"wechat_20171016092983","title":"精选卡夫卡的16句名言，人生的答案尽数说尽","source":"笔稿","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54834070.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092983"},{"id":"wechat_20171016092847","title":"【开奖啦！】\u201c驾车零违法\u2018油\u2019奖带回家\u201d活动第一批获奖名单公布！","source":"山东高速交警","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23133808.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092847"},{"id":"wechat_20171016092838","title":"播报 | 苹果垃圾快充，一加收集用户隐私，诺记狂卖1千万","source":"科技每日推送","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833372.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092838"},{"id":"wechat_20171016092801","title":"点滴 | 吃饭见人品","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-25750095.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092801"},{"id":"wechat_20171016092822","title":"完了！中国或将禁产禁售iPhone？","source":"科技每日推送","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833288.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092822"},{"id":"wechat_20171016092826","title":"【微警示】安全行车，请不要玩\u201c外挂\u201d","source":"山东高速交警","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23133808.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092826"},{"id":"wechat_20171016092821","title":"这是一封给时尚精们的chic请柬","source":"发现上海","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833229.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092821"},{"id":"wechat_20171016092767","title":"夜听 | 所有的伟大，都源于一个勇敢的开始","source":"读者","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54832952.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092767"},{"id":"wechat_20171016092830","title":"又是一年红叶季，西安这些地方的红叶将刷爆朋友圈","source":"凤城五路","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45722503.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092830"},{"id":"wechat_20171016092882","title":"【固安新闻】固安公共自行车新增70站点，快来看看有没有你家！","source":"固安在线网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-43798552.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092882"},{"id":"wechat_20171016092888","title":"MOG 抗体与脱髓鞘病，究竟有什么关系？","source":"丁香园","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-48428203.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092888"},{"id":"wechat_20171016092871","title":"一年四个月的反思：我这还叫创业吗？","source":"旺说","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54833438.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092871"},{"id":"wechat_20171016092861","title":"原来剥栗子只要3秒钟，这么多年来都做错了！","source":"新疆949交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13381185.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092861"}]
         * totalPage : 8296
         * ps : 20
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20171016092851
             * title : 白谦慎：“娟娟发屋”与当代普通人的意趣书写
             * source : 书法聚焦
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-51081177.jpg/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171016092851
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

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

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
