package com.example.marketapp;

import android.telephony.ims.ImsMmTelManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyCustomAdatper extends RecyclerView.Adapter<MyCustomAdatper.ViewHolder>{

    private List<Item> itemList;

    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener myListener){
        this.clickListener = myListener;
    }

    public MyCustomAdatper(List<Item> itemList){
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // responsible for creating new view holders for your items

        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout,
                        parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Binds the data from your dataset to the views within the view holder

        //getting Item (model class references)
        Item item = itemList.get(position);

        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImg());

    }

    @Override
    public int getItemCount() {
        // returns the total number of items in the dataset
        return itemList.size();
    }

    public class ViewHolder extends
            RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView title;
        TextView description;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title_text);
            description = itemView.findViewById(R.id.description_text);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null){
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }
}
