package com.itparkbynipun.recyclerviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RVViewHolder extends RecyclerView.ViewHolder{

    public TextView nameTxt;
    public TextView phoneTxt;

    public RVViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt=itemView.findViewById(R.id.name);
        phoneTxt=itemView.findViewById(R.id.phone);
    }


}
