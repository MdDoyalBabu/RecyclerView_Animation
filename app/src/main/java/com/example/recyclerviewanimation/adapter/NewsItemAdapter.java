package com.example.recyclerviewanimation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewanimation.R;
import com.example.recyclerviewanimation.model.NewsItem;

import java.util.List;

public class NewsItemAdapter extends RecyclerView.Adapter<NewsItemAdapter.ViewHolder> {

    Context context;
    List<NewsItem> newsItemList;

    public NewsItemAdapter(Context context, List<NewsItem> newsItemList) {
        this.context = context;
        this.newsItemList = newsItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.recycler_view_layout_anim,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(newsItemList.get(position).getName());
        holder.desc.setText(newsItemList.get(position).getDesc());



    }

    @Override
    public int getItemCount() {
        return newsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name,desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            desc=itemView.findViewById(R.id.desc);



        }
    }
}
