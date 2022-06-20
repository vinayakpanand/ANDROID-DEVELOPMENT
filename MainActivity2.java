package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity2 extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main2);
 getSupportActionBar().setTitle("General");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 }
 public void Pagetwo(View view){
 Intent intent =new Intent(this,MainActivity3.class);
 startActivity(intent);
 }
 public void developer(View view){
 Intent intent =new Intent(this,MainActivity4.class);
 startActivity(intent);
 }
 public void gaviint1(View view) {
 Intent intent = new Intent(this, MainActivity5.class);
 startActivity(intent);
 }
 public void sabariint1(View view) {
 Intent intent = new Intent(this, MainActivity6.class);
 startActivity(intent);
 }
 public void districtadmin(View view) {
 Intent intent = new Intent(this, MainActivity7.class);
 startActivity(intent);
 }
}
