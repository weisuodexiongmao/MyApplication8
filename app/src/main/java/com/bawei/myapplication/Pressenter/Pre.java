package com.bawei.myapplication.Pressenter;

import com.bawei.myapplication.Bean;
import com.bawei.myapplication.Mod.Mod;
import com.bawei.myapplication.View.acview;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by 猥琐的熊猫 on 2017/10/16.
 */

public class Pre {
private acview acview1;
private Mod mod;
    public Pre(acview acview1) {
        this.acview1 = acview1;
        this.mod=new Mod();
    }
    public void shuju(){
        mod.shuju(new Mod.Modlister() {
            @Override
            public void result(String str) {
                Gson gson=new Gson();
                Bean bean = gson.fromJson(str, Bean.class);
                List<Bean.ResultBean.ListBean> list = bean.getResult().getList();
                acview1.succeed(list);
            }
        });
    }


}
