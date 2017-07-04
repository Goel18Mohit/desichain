package com.example.nitin.desichain;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by ashis on 6/20/2017.
 */

public class AddNewAddress extends AppCompatActivity {

    TextInputEditText name,pincode,address,landmark,city,mobile;
    String state;
    private Toolbar mToolbar;
    Button save;
    ArrayList<String> statelist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_new_address);


        mToolbar=(Toolbar)findViewById(R.id.myToolBar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);


        final int position=getIntent().getIntExtra("REQUESTCODE",000);
   //     String mCustName = getIntent().getStringExtra("mCustName");
     //   String mCustAdd = getIntent().getStringExtra("mCustAdd");
        name= (TextInputEditText) findViewById(R.id.edit_name);
        pincode= (TextInputEditText) findViewById(R.id.edit_pincode);
        address= (TextInputEditText) findViewById(R.id.edit_address);
        landmark= (TextInputEditText) findViewById(R.id.edit_landmark);
        city=(TextInputEditText) findViewById(R.id.edit_city);
        mobile= (TextInputEditText) findViewById(R.id.edit_mobile);
        save= (Button) findViewById(R.id.btnSaveAddress);
        final Spinner mSpinner = (Spinner)findViewById(R.id.spinner_select_state);
        mSpinner.setPrompt("Select State");
/*
        if (!mCustName.isEmpty()){
            name.setText(mCustName);
        }
        if (!mCustAdd.isEmpty()){
            address.setText(mCustAdd);
        }
*/
        statelist =new ArrayList<>();
        statelist.add("DELHI");
        statelist.add("haryana");
        statelist.add("punjab");
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Bundle bundle=new Bundle();
                bundle.putString("CUSTOMERNAME",name.getText().toString());
                bundle.putString("CUSTOMERPINCODE",pincode.getText().toString());
                bundle.putString("CUSTOMERADDRESS",address.getText().toString());
                bundle.putString("CUSTOMERLANDMARK",landmark.getText().toString());
                bundle.putString("CUSTOMERCITY",city.getText().toString());
                bundle.putString("CUSTOMERMOBILE",mobile.getText().toString());
                Intent intent=new Intent();
                intent.putExtra("NEW ADDRESS",bundle);
                if(position==000) {
                    setResult(000, intent);
                }
                else
                {
                    setResult(001,intent);
                };
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(AddNewAddress.this,MyAddress.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
