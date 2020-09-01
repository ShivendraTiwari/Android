package com.example.jsonthroughvolley;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    List<Model> arrayList;

    public MyAdapter(Context context, List<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

        //Request option for GlIDE
//        RequestOptions option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape)
//                .error(R.drawable.loading_shape);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(Html.fromHtml(arrayList.get(position).getName()));
        holder.Description.setText(Html.fromHtml(arrayList.get(position).getDescription()));
        holder.old_price.setText(Html.fromHtml(arrayList.get(position).getOld_price()));
//        holder.image1.setImageURI(Html.fromHtml(arrayList.get(p).getFeatured_photo()));
        holder.new_price.setText(Html.fromHtml(arrayList.get(position).getNew_price()));
        holder.qty.setText(Html.fromHtml(arrayList.get(position).getQty()));

        Glide.with(context).load("https://fourcutts.aaratechnologies.in/assets/uploads/"+arrayList.get(position).getFeatured_photo())
                .into(holder.image1);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image1;
        TextView textView;
        TextView Description;
        TextView qty;
        TextView old_price;
        TextView new_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            Description = itemView.findViewById(R.id.descrip);
            qty = itemView.findViewById(R.id.quantity);
            old_price = itemView.findViewById(R.id.oldprice);
            new_price = itemView.findViewById(R.id.newprice);

        }
    }
}
