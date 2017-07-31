package com.example.nitin.desichain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.nitin.desichain.Adapters.SearchAdapter;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {


    ArrayList<String> PREVIOUS_SEARCHED;
    ListView listView;
    int count=2;
    TextView txtViewCount;
    ImageView  toolbarcartimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        invalidateOptionsMenu();
        listView= (ListView) findViewById(R.id.previoussearched);
        PREVIOUS_SEARCHED=new ArrayList<>();
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
        PREVIOUS_SEARCHED.add("BOOKS");
SearchAdapter mAdapter = new SearchAdapter(PREVIOUS_SEARCHED,this);
        listView.setAdapter(mAdapter);









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem menuItem=menu.findItem(R.id.my_cart);
        MenuItem item = menu.findItem(R.id.search_item);
        item.setVisible(false);
        MenuItemCompat.setActionView(menuItem,R.layout.cart_icon_for_toolbar);
        RelativeLayout mycarttoolbar= (RelativeLayout) MenuItemCompat.getActionView(menuItem);
        txtViewCount = (TextView) mycarttoolbar.findViewById(R.id.badge_notification_1);
        toolbarcartimage= (ImageView) mycarttoolbar.findViewById(R.id.badge_notification_image);
        count++;
        toolbarcartimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this,MyCart.class));
            }
        });
        txtViewCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this,MyCart.class));
            }
        });

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            Intent intent=new Intent(SearchActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }


        return true;
    }
}


