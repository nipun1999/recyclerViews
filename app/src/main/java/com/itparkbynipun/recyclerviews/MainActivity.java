package com.itparkbynipun.recyclerviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int itemSize = 30;
        ContactItem[] arr = new ContactItem[itemSize];
        //itemsize is equal to arr.length

        for(int i=0;i<itemSize;i++) {
            //initialise each item in arr with dummy data
            arr[i] = new ContactItem("name"+i, Integer.toString(i+100));
        }

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.setHasFixedSize(true);
        RVAdapter adapter = new RVAdapter(arr);
        recyclerView.setAdapter(adapter);


    }
}
