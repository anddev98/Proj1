package com.sematec.proj1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sematec.proj1.Movies.Search;

import java.util.List;

public class TaskSec6Adapter extends RecyclerView.Adapter<TaskSec6Adapter.TaskSec6ViewHolder> {
    List<Search> mylist;
    TaskSec6Adapter (List<Search> list) {
        mylist = list;
    }

    @NonNull
    @Override
    public TaskSec6ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recycler_item_task_sec6,parent,false);
        TaskSec6ViewHolder holder = new TaskSec6ViewHolder(v);
        return holder;
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    @Override
    public void onBindViewHolder(@NonNull TaskSec6ViewHolder holder, int position) {
        String title = mylist.get(position).getTitle();
        holder.txtTitle.setText("Tilte: "+title);

    }

    public class TaskSec6ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;

        public TaskSec6ViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Search search = mylist.get(getAdapterPosition());
                    Intent intent = new Intent(itemView.getContext(),TaskSec6DetailesActivity.class);
                    intent.putExtra("id",search.getImdbID());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
