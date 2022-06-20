package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity4 extends AppCompatActivity {
 Button B1,B2;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main4);
 getSupportActionBar().setTitle("Developer Information");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 B1 = findViewById(R.id.button3);
 B1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_arjun = "9633273662";
Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:"+number_arjun));
 startActivity(callIntent);
 }
 });
 B2 = findViewById(R.id.button4);
 B2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_vinayak = "8848786576";
Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:"+number_vinayak));
startActivity(callIntent);
 }
 });
 }
}
