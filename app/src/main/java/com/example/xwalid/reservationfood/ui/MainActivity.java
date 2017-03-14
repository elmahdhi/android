package com.example.xwalid.reservationfood.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xwalid.reservationfood.R;
import com.example.xwalid.reservationfood.adapter.ProductAdapter;
import com.example.xwalid.reservationfood.adapter.ViewPagerAdapter;
import com.example.xwalid.reservationfood.fragments.Account;
import com.example.xwalid.reservationfood.fragments.Demands;
import com.example.xwalid.reservationfood.fragments.Dimunition;
import com.example.xwalid.reservationfood.fragments.Home;
import com.example.xwalid.reservationfood.fragments.Midle;
import com.example.xwalid.reservationfood.model.Request;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecyclerView recyclerViewAdapter;
    private List<Request> requestList = new ArrayList<>();

    RelativeLayout tabOne,tabTwo,tabThree,tabFour;
    ImageView imageViewOne,imageViewTwo,imageViewThree,imageViewFour,tabMidle;
    TextView textViewOne,textViewTwo,textViewThree,textViewFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();



    }


    private void setupTabIcons() {
        tabOne = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        textViewOne = (TextView) tabOne.findViewById(R.id.text);
        textViewOne.setText("الرئيسية");
        imageViewOne = (ImageView) tabOne.findViewById(R.id.image);
        imageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.home));
        tabLayout.getTabAt(4).setCustomView(tabOne);

        tabTwo = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        textViewTwo = (TextView) tabTwo.findViewById(R.id.text);
        textViewTwo.setText("الطلبات");
        imageViewTwo = (ImageView) tabTwo.findViewById(R.id.image);
        imageViewTwo.setImageDrawable(getResources().getDrawable(R.drawable.oldrequests));
        tabLayout.getTabAt(3).setCustomView(tabTwo);

        tabMidle = (ImageView) LayoutInflater.from(this).inflate(R.layout.custom_tab_middle, null);
        tabLayout.getTabAt(2).setCustomView(tabMidle);

        tabThree = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        textViewThree = (TextView) tabThree.findViewById(R.id.text);
        textViewThree.setText("التخفيضات");
        imageViewThree = (ImageView) tabThree.findViewById(R.id.image);
        imageViewThree.setImageDrawable(getResources().getDrawable(R.drawable.promotion));
        tabLayout.getTabAt(1).setCustomView(tabThree);

        tabFour = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        textViewFour = (TextView) tabFour.findViewById(R.id.text);
        textViewFour.setText("حسابي");
        imageViewFour = (ImageView) tabFour.findViewById(R.id.image);
        imageViewFour.setImageDrawable(getResources().getDrawable(R.drawable.profil));
        tabLayout.getTabAt(0).setCustomView(tabFour);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Home(), "ONE");
        adapter.addFrag(new Demands(), "TWO");
        adapter.addFrag(new Midle(), "Midle");
        adapter.addFrag(new Dimunition(), "THREE");
        adapter.addFrag(new Account(), "FOUR");

        viewPager.setAdapter(adapter);
    }

    public void tabLayoutAction(){
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
    }


}
