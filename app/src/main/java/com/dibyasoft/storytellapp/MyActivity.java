package com.dibyasoft.storytellapp;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;

import java.io.InputStream;


public class MyActivity extends ActionBarActivity {
    public final static String EXTRA_STORY = "com.dibyasoft.storytellapp.STORY";
    public static final String LOG_TAG = "MyActivity";
//    private View view;


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_premier);
//        GridView gv = (GridView) findViewById(R.id.grid_view);
//        gv.setAdapter(imageAdapter);

     /*   LinearLayout layout = (LinearLayout) findViewById(R.id.activity_my);

        for (int i = 0; i<3; i++){
            Button button = new Button(this);
            button.setText("Click");
            layout.addView(button);
        }*/
//        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout_premier);
//        float vanishPoint = layout.getCameraDistance();

     }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG_TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG_TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.ORIENTATION_PORTRAIT==1){
            Log.d(LOG_TAG, "Changed to Portrait");
        }else{
            Log.d(LOG_TAG, "Changed to Landscape");
        }
    }

    //On user clicks Send Story
    public void sendStory(View view){
        Intent intent = new Intent(this, DisplayStoryActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_story);
        String story = editText.getText().toString();
        intent.putExtra(EXTRA_STORY, story);
        startActivity(intent);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_my, menu);
//        return true;
//    }

    //Add actions to the Action Bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
//        Inflate menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);

     //   return super.onCreateOptionsMenu(menu);
        return true;
    }
//    @Override
//    public void onConfigurationChanged(Configuration configuration){
//
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

       @Override
    public boolean onOptionsItemSelected(MenuItem item){
           //Handle presses on action bar items
           switch(item.getItemId()){
               case R.id.action_search:
                   openSearch();
                   return true;
               case R.id.action_settings:
                   openSettings();
                   return true;
               case R.id.action_Categories:
                   actionCategoryClickHandler(item);
                   return true;
               default:
                   return super.onOptionsItemSelected(item);
           }

       }
//    private void categoryOnClickHandler(MenuItem item){
//        final String categories = "Children's Short Stories";
//        int res = getResources().getIdentifier(categories,"strings",getPackageName());
//        ListView lv = (ListView)findViewById(R.id.action_Categories);
//        lv.setContentDescription(categories);
//    }
    public void openSearch(){
        startActivity(new Intent (SearchManager.INTENT_ACTION_GLOBAL_SEARCH));
    }

    public void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }

//    @TargetApi(21)
    public void actionCategoryClickHandler(MenuItem item) {

        Intent intent = new Intent(this, CategoriesGrid.class);
        startActivity(intent);
//        MyActivity I = new MyActivity();
//        I.setContentView(R.layout.main);
//        String imageName = "biz.jpg";
//        setContentView(R.layout.main);
//        GridView gv = (GridView) findViewById(R.id.grid_view);
//        gv.setAdapter(new ImageAdapter(this, categoriesList, categoriesImages));
//        CategoriesGrid gridDisplay = new CategoriesGrid();
//        try {
////            InputStream stream = getAssets().open(imageName);
////            Drawable drawable = Drawable.createFromStream(stream,null);
////            gridDisplay = new CategoriesGrid();
//            gridDisplay.onCreate(Bundle.EMPTY);
//        } catch (Exception e) {
//            Log.e(LOG_TAG, e.getMessage());
//        }


//        CategoriesGrid gridDisplay = new CategoriesGrid();
//        startActivity(new Intent(String.valueOf(gridDisplay)));
//        gridDisplay.onCreate(Bundle.EMPTY, PersistableBundle.EMPTY);
        return;

    }
}
