package com.bawei.myapplication;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.bawei.myapplication.Pressenter.Pre;
import com.bawei.myapplication.View.acview;

import java.util.List;

public class MainActivity extends AppCompatActivity implements acview, SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recyclerView;
    private Pre pre;
    private List<Bean.ResultBean.ListBean> shuju;
    private Adapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(this);

        pre = new Pre(this);
        pre.shuju();

    }


    @Override
    public void succeed(final List<Bean.ResultBean.ListBean> list) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter = new Adapter(list,MainActivity.this);
                recyclerView.setAdapter(adapter);
                adapter.setOnitemclick(new Adapter.OnitemclickListenter() {
                    @Override
                    public void onitemclick(View view, int position) {
                        Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onitemlongclick(View view, int position) {

                    }
                });
            }
        });
    }

    @Override
    public void onRefresh() {
        Toast.makeText(MainActivity.this,"下拉了",Toast.LENGTH_SHORT).show();
        //隐藏下拉刷新进度条
        swipeRefreshLayout.setRefreshing(false);
    }
}
