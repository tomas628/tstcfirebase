package com.example.firebaselist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{

    private ArrayList<Tstc> arrayList;
    private Context context;


    public CustomAdapter(ArrayList<Tstc> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getPhoto())
                .into(holder.iv_photo);
        holder.tv_id.setText(String.valueOf(arrayList.get(position).getId()));
        holder.tv_t.setText(arrayList.get(position).getT());
        holder.tv_thdr.setText(String.valueOf(arrayList.get(position).getThdr()));
        holder.tv_tno.setText(String.valueOf(arrayList.get(position).getTno()));
        holder.tv_tlocation.setText(arrayList.get(position).getTlocation());
        holder.tv_s.setText(arrayList.get(position).getS());
        holder.tv_shdr.setText(String.valueOf(arrayList.get(position).getShdr()));
        holder.tv_sno.setText(String.valueOf(arrayList.get(position).getSno()));
        holder.tv_slocation.setText(arrayList.get(position).getSlocation());
        holder.tv_line.setText(arrayList.get(position).getLine());
    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_photo;
        TextView tv_id;
        TextView tv_t;
        TextView tv_thdr;
        TextView tv_tno;
        TextView tv_tlocation;
        TextView tv_s;
        TextView tv_shdr;
        TextView tv_sno;
        TextView tv_slocation;
        TextView tv_line;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_photo = itemView.findViewById(R.id.iv_photo);
            this.tv_id = itemView.findViewById(R.id.tv_id);
            this.tv_t = itemView.findViewById(R.id.tv_t);
            this.tv_thdr = itemView.findViewById(R.id.tv_thdr);
            this.tv_tno = itemView.findViewById(R.id.tv_tno);
            this.tv_tlocation = itemView.findViewById(R.id.tv_tlocation);
            this.tv_s = itemView.findViewById(R.id.tv_s);
            this.tv_shdr = itemView.findViewById(R.id.tv_shdr);
            this.tv_sno = itemView.findViewById(R.id.tv_sno);
            this.tv_slocation = itemView.findViewById(R.id.tv_slocation);
            this.tv_line = itemView.findViewById(R.id.tv_line);
        }
    }
}
