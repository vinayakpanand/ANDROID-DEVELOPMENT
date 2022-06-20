package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity3 extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main3);
 getSupportActionBar().setTitle("Tourist spots in Each Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 }
 public void Tvla(View view){
 Intent intent =new Intent(this,MainActivity8.class);
 startActivity(intent);
 }
 public void mlpy(View view){
 Intent intent =new Intent(this,MainActivity9.class);
 startActivity(intent);
 }
 public void ranni(View view){
 Intent intent =new Intent(this,MainActivity10.class);
 startActivity(intent);
 }
 public void kozh(View view){
 Intent intent =new Intent(this,MainActivity11.class);
 startActivity(intent);
 }
 public void adoor(View view){
 Intent intent =new Intent(this,MainActivity12.class);
 startActivity(intent);
 }
}
