package com.example.homeapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeapp.adapter.AsiaFoodAdapter;
import com.example.homeapp.adapter.PopularFoodAdapter;
import com.example.homeapp.model.AsiaFood;
import com.example.homeapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now here we will add some dummy data to out model class
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("civil line 1 ","$57",R.drawable.homesecond));
        popularFoodList.add(new PopularFood("civil line  2","$57",R.drawable.homethird));
        popularFoodList.add(new PopularFood("civil line  3","$57",R.drawable.homeforth));
        popularFoodList.add(new PopularFood("civil line  3","$57",R.drawable.homethird));
        popularFoodList.add(new PopularFood("civil line  3","$57",R.drawable.homeforth));
        popularFoodList.add(new PopularFood("civil line  3","$57",R.drawable.homesecond));


        setPopularRecycler(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("makroniya 1","25",R.drawable.homeforth,"4.5","santosh"));
        asiaFoodList.add(new AsiaFood("makroniya 2","29",R.drawable.homeforth,"4.0","antosh"));
        asiaFoodList.add(new AsiaFood("makroniya 3","28",R.drawable.homeforth,"3.5","tosh"));
        asiaFoodList.add(new AsiaFood("makroniya 4","29",R.drawable.homeforth,"2.5","stosh"));
        asiaFoodList.add(new AsiaFood("makroniya 5","25",R.drawable.homeforth,"4.5","sans"));
        setAsiaRecycler(asiaFoodList);

    }
    private void setPopularRecycler(List<PopularFood>popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
    private void setAsiaRecycler(List<AsiaFood>asiaFoodList){
        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this,asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);
    }

    // Hi all,
    // Today we are going to build a food app.
    // so the first things frist lets add font and image assets
    // so lets see the design
    // now we will setup recyclerview
    // first we make a model class then adapter class.
    // now we will create a recyclerview row item layout file
    // so our adapter class is ready
    // now we will bind data with recyclerview
    // so we have successfully setup popular recyclerview
    // now same setup we need to do for asia food
    // will make model class then adapter and setup recyclerview
    // so lets do it fast.
    // so asia food setup done.
    // Now we will setup Bottom app bar
    // bottom app bar setup done if you want you can increase menu item in menu file
    // now we will setup details activity and on click listener in recyclerview row item
    // so this tutorial has been completed if you have any
    // question and query please do comment
    // Like share and subscribe
    // Thankyou for watching
    // see you in the next tutorial
}
