package com.itparkbynipun.recyclerviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVViewHolder>{

    private ContactItem[] contactItems;

    private ContactItem[] contacts;

    public RVAdapter(ContactItem[] arr) {
        contacts = arr;
    }


    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        RVViewHolder contactViewHolder=new RVViewHolder(view);
      //  Log.e("oncreateviewholder", "on createv view holder, no position");
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder rvViewHolder, int i) {
        rvViewHolder.nameTxt.setText(contacts[i].getName());
        rvViewHolder.phoneTxt.setText(contacts[i].getPhone());
       // Log.e("onbindviewholder","on bind view holder called for position " + position);
    }

    @Override
    public int getItemCount() {
        //Log.e("item size", "item count is " + hitModel.length);
        return contacts.length;
    }
}
