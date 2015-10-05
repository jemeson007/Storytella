package com.dibyasoft.storytellapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayStoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_story);
        Intent intent = getIntent(); //gets the story from the intent
        String story = intent.getStringExtra(MyActivity.EXTRA_STORY);

        TextView textView = new TextView(this);//Creates the text view
        textView.setTextSize(40);
        textView.setText(story);

        setContentView(textView); //Sets the text view as the activity layout
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_display_story, menu);
//        return true;
//    }
//public void sendStory(View view){
//    Intent intent = new Intent(this, DisplayStoryActivity.class);
//    EditText editText = (EditText) findViewById(R.id.edit_story);
//    String story = editText.getText().toString();
//    intent.putExtra(MyActivity.EXTRA_STORY, story);
//    startActivity(intent);
//}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
