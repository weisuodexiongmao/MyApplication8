package com.bawei.myapplication.Mod;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 猥琐的熊猫 on 2017/10/16.
 */

public class Mod {
public void shuju(final Modlister modlister){
    OkHttpClient okHttpClient=new OkHttpClient();
    final Request request=new Request.Builder().url("http://v.juhe.cn/weixin/query?key=55010ae808217e996bbf414bbdad843c").build();
    Call call=okHttpClient.newCall(request);
    call.enqueue(new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {

        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            String string = response.body().string();
            modlister.result(string);
        }
    });
}
public interface Modlister{
    public void result(String str);
}


}
