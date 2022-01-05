package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 frag01=new Fragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout1,frag01).commit();


        Fragment2 frag02=new Fragment2();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout2,frag02,"TAG_2").commit();


    }


    @Override
    public void setDisplay(String s) {
        Fragment fragment=getSupportFragmentManager().findFragmentByTag("TAG_2");
        Fragment2 fragment02=(Fragment2) fragment;

        assert fragment02 != null;
        fragment02.setDisplay(s);
    }

}