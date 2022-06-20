package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity7 extends AppCompatActivity {
 ImageButton B1, B2, B3, B4, B5;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main7);
 getSupportActionBar().setTitle("District Administration");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 B1 = (ImageButton) findViewById(R.id.imageButton13);
 B1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_collector = "04682222505";
 Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:" + number_collector));
 startActivity(callIntent);
 }
 });
 B2 = (ImageButton) findViewById(R.id.imageButton14);
 B2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_dpc = "04682222636";
 Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:" + number_dpc));
 startActivity(callIntent);
 }
 });
 B3 = (ImageButton) findViewById(R.id.imageButton15);
 B3.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_ac = "8547714728";
 Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:" + number_ac));
 startActivity(callIntent);
 }
 });
 B4 = (ImageButton) findViewById(R.id.imageButton16);
 B4.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_rdoadoor = "04734224827";
 Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:" + number_rdoadoor));
 startActivity(callIntent);
 }
 });
 B5 = (ImageButton) findViewById(R.id.imageButton17);
 B5.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String number_rdotvla = "04692601202";
 Intent callIntent = new Intent(Intent.ACTION_CALL);
 callIntent.setData(Uri.parse("tel:" + number_rdotvla));
 startActivity(callIntent);
 }
 });
 }
}
