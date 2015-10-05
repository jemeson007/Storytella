package com.dibyasoft.storytellapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by j on 25/08/15.
 */
public class ImageAdapter extends BaseAdapter {
    String [] result;
    int [] imageId;
    Context context;
    private static LayoutInflater inflater;
    private Context mContext;


    public ImageAdapter(Context c) {
        mContext = c;
    }

//    public ImageAdapter(CategoriesGrid myActivity, String [] thumbList, int [] mThumbIds ){
//        result = thumbList;
//        context = myActivity;
//        imageId = mThumbIds;
////        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

   //creation of ImageView
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
//        Holder holder = new Holder();
//        View rowView;
        ImageView imageView;
//        TextView textView;

//        rowView = inflater.inflate(R.layout.activity_categories_grid, parent, false);
//        holder.tv = (TextView)rowView.findViewById(R.id.grid_view_label);
//        holder.iv = (ImageView) rowView.findViewById(R.id.imageView1);
//
//        holder.tv.setText(result[position]);
//        holder.iv.setImageResource(imageId[position]);
//
//        rowView.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Toast.makeText(context, result[position] + " Category Selected",Toast.LENGTH_LONG).show();
//            }
//
//        });
//        holder.gv = (GridView)rowView.findViewById(R.id.grid_view);
        if (convertView == null) {

            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(220, 220));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(4, 4, 4, 4);
        } else {
            imageView = (ImageView) convertView;
        }
//        textView = textView.findViewById(R.id.grid_view_label);
//        textView.setText(result[position]);
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // references to our images
    private Integer[] mThumbIds = {R.drawable.biz, R.drawable.tech,
            R.drawable.sports, R.drawable.lifestyle, R.drawable.eros, R.drawable.creative,
            R.drawable.truth, R.drawable.kids, R.drawable.entertainment, R.drawable.politics,
            R.drawable.arts, R.drawable.history


    };


}
