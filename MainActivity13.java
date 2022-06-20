package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity13 extends AppCompatActivity {
 TextView t1,t2;
 ImageView im;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main13);
 Bundle extras=getIntent().getExtras();
 byte[] byteArray=extras.getByteArray("image");
 String name=extras.getString("name");
 String desc=extras.getString("desc");
 Bitmap bmp =
BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);
 im=findViewById(R.id.imageView4);
 t1=findViewById(R.id.textView3);
 t2=findViewById(R.id.textView17);
 im.setImageBitmap(bmp);
 t1.setText(name);
 t2.setText(desc);
 }
}
