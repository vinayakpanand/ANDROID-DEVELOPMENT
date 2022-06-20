package com.example.pathanamthittadistrict;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
public class Item extends ArrayAdapter<String> implements ListAdapter {
 private final Activity context;
 private final Integer[] imageId;
 private final String[] name;
 private final String[] pos;
 private final String[] desc;
 public Item(Activity context, String[] name, String[] pos, Integer[]
imageId, String[] desc){
 super(context, R.layout.list_view_items,name);
 this.context=context;
 this.name=name;
 this.imageId=imageId;
 this.pos=pos;
 this.desc = desc;
 }
 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
 LayoutInflater inflater=context.getLayoutInflater();
 View rowView=inflater.inflate(R.layout.list_view_items,null,true);
 TextView txtName=(TextView)rowView.findViewById(R.id.textView);
 ImageView imageView= rowView.findViewById(R.id.imageView);
 TextView txtRole=rowView.findViewById(R.id.textView1);
 txtName.setText(name[position]);
 txtRole.setText(pos[position]);
 imageView.setImageResource(imageId[position]);
 return rowView;
 }
}
