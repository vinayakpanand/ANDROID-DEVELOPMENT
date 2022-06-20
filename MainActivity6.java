package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity6 extends AppCompatActivity {
 Button btn;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main6);
 getSupportActionBar().setTitle("Sabarimala");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 btn=(Button) findViewById(R.id.button2);
 btn.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent intent = new Intent(Intent.ACTION_VIEW,
Uri.parse("https://sabarimala.kerala.gov.in/about-sabarimala"));
 startActivity(intent);
 }
 });
 }
}
