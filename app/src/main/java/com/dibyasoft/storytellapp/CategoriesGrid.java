package com.dibyasoft.storytellapp;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.dibyasoft.storytellapp.R;

public class CategoriesGrid extends ActionBarActivity {
    MyActivity myActivity;
//    CategoriesGrid categoriesGrid;

    public static String[] categoriesList= {"Business", " Tech", "Sports", "LifeStyle", "Erotic Passions", "Creative","True Story", "Kids", "Entertainment" };
    public static int [] categoriesImages = {R.drawable.biz, R.drawable.tech, R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6};
//    ImageAdapter imageAdapter = new ImageAdapter(this, categoriesList, categoriesImages);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        GridView gv = (GridView) findViewById(R.id.grid_view);
        gv.setAdapter(new ImageAdapter(this));
//        imageAdapter.getView()


//
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(CategoriesGrid.this, "You selected Category" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_categories_grid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }
        if(id==R.id.action_search){
            openSearch();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openSearch(){
        startActivity(new Intent(SearchManager.INTENT_ACTION_GLOBAL_SEARCH));
    }

    public void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }
}
