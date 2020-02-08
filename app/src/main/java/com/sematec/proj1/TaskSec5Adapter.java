package com.sematec.proj1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskSec5Adapter extends RecyclerView.Adapter<TaskSec5Adapter.TestViewHolder> {

    ArrayList<String> itemMenu;
    TaskSec5Adapter (ArrayList<String> list){
        itemMenu = list;
    }
    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.task_sec5_recycler_item,parent,false);
        TestViewHolder holder = new TestViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        String itemmenu = itemMenu.get(position);
        holder.txtItem.setText(itemmenu);

    }

    @Override
    public int getItemCount() {
        return itemMenu.size();
    }

    public class TestViewHolder extends RecyclerView.ViewHolder{
        TextView txtItem;
        View viewItem;
        public TestViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtItem = itemView.findViewById(R.id.txtItem);
            viewItem = itemView.findViewById(R.id.viewItem);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int itemPosition = getAdapterPosition();
                    switch (itemPosition){
                        case 0:
                            Intent intent = new Intent(itemView.getContext(),TaskImplicitIntentActivity.class);
                            itemView.getContext().startActivity(intent);
                            break;
                        case 1:
                           intent = new Intent(itemView.getContext(),TaskProfileSec4Activity.class);
                            itemView.getContext().startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
}

