package com.sematec.proj1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder>{

    ArrayList<PersonClass> myList;
    TestAdapter(ArrayList<PersonClass> list) {myList = list;}
    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recycler_item,parent,false);
        TestViewHolder holder = new TestViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
       PersonClass person = myList.get(position);
       holder.txtName.setText(person.getName() + person.getFamily());
       holder.txtMobile.setText(person.getMobile());
       holder.imgProfile.setImageResource(person.getPic());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public  class TestViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtMobile;
        ImageView imgProfile;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtMobile = itemView.findViewById(R.id.txtMobile);
            imgProfile = itemView.findViewById(R.id.imgProfile);


        }
    }

}
