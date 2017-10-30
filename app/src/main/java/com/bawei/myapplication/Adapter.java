package com.bawei.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 猥琐的熊猫 on 2017/10/16.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Bean.ResultBean.ListBean>list;
    private Context context;
    public Adapter(List<Bean.ResultBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new VHItem(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
     VHItem vhItem= (VHItem) holder;
        vhItem.textView.setText(list.get(position).getTitle());
        ImageLoader.getInstance().displayImage(list.get(position).getFirstImg(),vhItem.imageView);
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //得到条目的位置
               int position1 = holder.getLayoutPosition();
               //将点击的事件回调
               onitemclickListenter.onitemclick(holder.itemView,position1);
           }
       });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position1 = holder.getLayoutPosition();
                onitemclickListenter.onitemlongclick(holder.itemView,position1);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class VHItem extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public VHItem(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            textView= (TextView) itemView.findViewById(R.id.textView);

        }
    }
    //点击条目的接口
    public interface OnitemclickListenter{
        void onitemclick(View view,int position);
        void onitemlongclick(View view,int position);
    }
    private OnitemclickListenter onitemclickListenter;
    public void setOnitemclick(OnitemclickListenter onitemclickListenter){
        this.onitemclickListenter=onitemclickListenter;

    }
}
