package com.example.homeapp;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeapp.adapter.AsiaFoodAdapter;
import com.example.homeapp.adapter.PopularFoodAdapter;
import com.example.homeapp.model.AsiaFood;
import com.example.homeapp.model.PopularFood;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.normal.TedPermission;

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
        ImageView user_profile =findViewById(R.id.user_profile);
        user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),UserProfile.class);
                startActivity(intent);
            }
        });

        // now here we will add some dummy data to out model class
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("super HIG 35 ,deen dayal nagar ","Rs 1500",R.drawable.homesecond));
        popularFoodList.add(new PopularFood("MIG 15 ,deen dayal nagar","Rs 1400",R.drawable.homethird));
        popularFoodList.add(new PopularFood("HIG 36,makroniya","Rs 500",R.drawable.homeforth));
        popularFoodList.add(new PopularFood("sai room baheriya","$57",R.drawable.homethird));
        popularFoodList.add(new PopularFood("civil line  3","Rs 1300",R.drawable.homeforth));
        popularFoodList.add(new PopularFood("civil line  3","1700",R.drawable.homesecond));


        setPopularRecycler(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("HIG 36,makroniya","25",R.drawable.homeforth,"4.5","santosh"));
        asiaFoodList.add(new AsiaFood("Nirvahan hostel","29",R.drawable.homeforth,"4.0","antosh"));
        asiaFoodList.add(new AsiaFood("C nagar palace","28",R.drawable.homeforth,"3.5","tosh"));
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

    public void for_location(View view) {

            PermissionListener permissionlistener = new PermissionListener() {
                @Override
                public void onPermissionGranted() {
                    Toast.makeText(getApplicationContext(), "Permission Granted", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onPermissionDenied(List<String> deniedPermissions) {
                    Toast.makeText(getApplicationContext(), "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
                }


            };
            TedPermission.create()
                    .setPermissionListener(permissionlistener)
                    .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                    .setPermissions(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)
                    .check();

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
