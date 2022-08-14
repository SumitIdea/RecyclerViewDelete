package com.example.recyclercarddemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Activity obj;
    int res;
    ArrayList<Model> arrayList=new ArrayList<>();

    public MyAdapter(Activity obj, int res, ArrayList<Model> arrayList) {
        this.obj = obj;
        this.res = res;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(obj).inflate(res,parent,false);
        MyHolder myHolder=new MyHolder(v);
        return  myHolder.link(this);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {

        Model m=arrayList.get(position);
        holder.imageView.setImageResource(m.getImage());
        holder.tv1.setText(m.getName());
        holder.tv2.setText(m.getAddress());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageView,item_delete;
        TextView tv1,tv2;
        private MyAdapter adapter;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            tv1=itemView.findViewById(R.id.nem);
            tv2=itemView.findViewById(R.id.addr);
            item_delete=itemView.findViewById(R.id.item_delete);
            item_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.arrayList.remove(getAdapterPosition());
                    adapter.notifyItemRemoved(getAdapterPosition());
                }
            });



        }

        public MyHolder link(MyAdapter adapter){

            this.adapter= adapter;
            return this;
        }
    }
}
