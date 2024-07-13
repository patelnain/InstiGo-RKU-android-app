package com.rku.nain.instigo.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.rku.nain.instigo.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilSportsSecy extends AppCompatActivity
        {

            @Override

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> sportsList = new ArrayList<>();
        CouncilUserClass footballSecy=new CouncilUserClass("Adhokshaja V Madhwaraj","Institute Football Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass cricketSecy=new CouncilUserClass("Abhay Sahu","Institute Cricket Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass volleyballSecy=new CouncilUserClass("Ashrith Kumar Peddy","Institute Volleyball Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass hockeySecy=new CouncilUserClass("Basavaraj H Dindur","Institute Hockey Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass badmintonSecy=new CouncilUserClass("Rohan Shrothrium","Institute Badminton Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass athleticsSecy=new CouncilUserClass("Avneet Sehgal","Institute Athletics Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass basketballSecy=new CouncilUserClass("Anudeep Tubati ","Institute Basketball Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass ttSecy=new CouncilUserClass("Deepak H R","Institute Table Tennis Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass boardGamesSecy=new CouncilUserClass("Shubham Suresh Deshpande","Institute Board Games Secretary","9512016315"," nsanepara386@rku.ac.in ",R.drawable.ritik);

        sportsList.add(footballSecy);
        sportsList.add(cricketSecy);
        sportsList.add(volleyballSecy);
        sportsList.add(hockeySecy);
        sportsList.add(badmintonSecy);
        sportsList.add(athleticsSecy);
        sportsList.add(basketballSecy);
        sportsList.add(ttSecy);
        sportsList.add(boardGamesSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, sportsList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar sportsActionBar = getSupportActionBar();
        assert sportsActionBar != null;
        sportsActionBar.setHomeButtonEnabled(true);
        sportsActionBar.setDisplayHomeAsUpEnabled(true);
        sportsActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        sportsActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
