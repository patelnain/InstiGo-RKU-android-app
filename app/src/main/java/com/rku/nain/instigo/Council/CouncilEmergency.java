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


public class CouncilEmergency extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> emergencyList = new ArrayList<>();
        CouncilUserClass plumber=new CouncilUserClass("Shivaji","Plumbing Maintenance","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass electrician=new CouncilUserClass("Shrishail","Electrical Maintenance","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass housekeeping1=new CouncilUserClass("Ravi","HouseKeeping","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass housekeeping2=new CouncilUserClass("Manju","HouseKeeping","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass securitySupervisor1=new CouncilUserClass("Ashok Kulkarni","Security Supervisor","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass securitySupervisor2=new CouncilUserClass("L. Nadaf","Security Supervisor","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass securitySupervisor3=new CouncilUserClass("Ramachandra","Security Supervisor","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass securitySup=new CouncilUserClass("Mallikarjun N B","Security Superintendent","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass medicalEmergency=new CouncilUserClass("RKU Ambulance","Medical emergency","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass lib=new CouncilUserClass("Omprakash Bhendigeri","Librarian","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass consDept1=new CouncilUserClass("Govind Prabhu","Construction department","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass consDept2=new CouncilUserClass("Sharanbasappa Angadi","Construction department","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass mainGate=new CouncilUserClass("RKU Main Gate","Security","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass backGate=new CouncilUserClass("RKU Back Gate","Security ","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass sportsInst1=new CouncilUserClass("Ravi Ghalimath","Sports Instructor","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        CouncilUserClass sportsInst2=new CouncilUserClass("Dyamappa Ganachari","Sports Instructor","9512016315","nsanepara386@rku.ac.in",R.drawable.ritik);
        emergencyList.add(plumber);
        emergencyList.add(electrician);
        emergencyList.add(housekeeping1);
        emergencyList.add(housekeeping2);
        emergencyList.add(securitySupervisor1);
        emergencyList.add(securitySupervisor2);
        emergencyList.add(securitySupervisor3);
        emergencyList.add(securitySup);
        emergencyList.add(medicalEmergency);
        emergencyList.add(lib);
        emergencyList.add(consDept1);
        emergencyList.add(consDept2);
        emergencyList.add(mainGate);
        emergencyList.add(backGate);
        emergencyList.add(sportsInst1);
        emergencyList.add(sportsInst2);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, emergencyList);
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

        androidx.appcompat.app.ActionBar emergencyActionBar = getSupportActionBar();
        assert emergencyActionBar != null;
        emergencyActionBar.setHomeButtonEnabled(true);
        emergencyActionBar.setDisplayHomeAsUpEnabled(true);
        emergencyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        emergencyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
