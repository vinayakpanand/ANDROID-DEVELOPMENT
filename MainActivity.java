package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {
 private Intent serviceIntent;
 VideoView videoView;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 videoView=findViewById(R.id.videoview);
 Uri
uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pta);
 videoView.setVideoURI(uri);
 videoView.start();
 videoView.setOnPreparedListener(new
MediaPlayer.OnPreparedListener() {
 @Override
 public void onPrepared(MediaPlayer mp) {
 mp.setLooping(true);
 }
 });
 }
 public void Pageone(View view){
 Intent intent =new Intent(this,MainActivity2.class);
 startActivity(intent);
 }
 @Override
 protected void onPostResume() {
 videoView.resume();
 super.onPostResume();
 }
 @Override
 protected void onRestart() {
 videoView.start();
 super.onRestart();
 }
 @Override
 protected void onPause() {
 videoView.suspend();
 super.onPause();
 }
 @Override
 protected void onDestroy() {
 videoView.stopPlayback();
 super.onDestroy();
 }
}
