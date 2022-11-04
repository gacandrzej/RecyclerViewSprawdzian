# RecyclerViewSprawdzian

![image](https://user-images.githubusercontent.com/82050305/199949364-c45c37ec-a5ed-4a85-bf7c-f76d4fcc8205.png)


```java
package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapterImage extends RecyclerView.Adapter<ItemAdapterImage.ViewHolder> {

   String [] dogs;
   int [] dosPictures;
   Context context;

    public ItemAdapterImage(String[] dogs, int[] dosPictures, Context context) {
        this.dogs = dogs;
        this.dosPictures = dosPictures;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.textView.setText(dogs[position]);
            holder.imageView.setImageResource(dosPictures[position]);

    }


    @Override
    public int getItemCount() {
        return dogs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView1);
            imageView = itemView.findViewById(R.id.item_image);
        }
    }
}

```
