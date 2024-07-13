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


public class CouncilFHosMainSecy extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> FHosMainList = new ArrayList<>();
        CouncilUserClass groundSecy=new CouncilUserClass("Purnima Priyadarshini","Ground Floor Hostel Secretary","9512016315","nsanepara386@rku.ac.in", R.drawable.ritik);
        CouncilUserClass firstSecy=new CouncilUserClass("Tarun Goyal","First Floor Hostel Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass secondSecy=new CouncilUserClass("Sameer Anis Dohadwalla","Second Floor Hostel Secretary","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        FHosMainList.add(groundSecy);
        FHosMainList.add(firstSecy);
        FHosMainList.add(secondSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, FHosMainList);
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

        androidx.appcompat.app.ActionBar FHosMainActionBar = getSupportActionBar();
        assert FHosMainActionBar != null;
        FHosMainActionBar.setHomeButtonEnabled(true);
        FHosMainActionBar.setDisplayHomeAsUpEnabled(true);
        FHosMainActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        FHosMainActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
