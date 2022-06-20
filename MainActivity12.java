package com.example.pathanamthittadistrict;
import androidx.appcompat.app.AppCompatActivity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
public class MainActivity12 extends AppCompatActivity {
 ListView simpleList;
 Integer
k[]={R.drawable.adoorpartha,R.drawable.thrichennamangalam,R.drawable.pandal
ampalace,R.drawable.anjumalapara,R.drawable.mannadi,R.drawable.greenvalley,
R.drawable.chilanthi,R.drawable.chandanapally,R.drawable.anandapally};
 String PN[]={"Parthasarathy Temple","Thrichendamangalam
temple","Pandalam Palace","Anjumalappara","Mannadi Temple","Green Valley
park","Chilanthi Ambalam","Chandanappally","Anandapally"};
 String
Pos[]={"Adoor","Peringanad","Pandalam","Anjumalappara","Mannadi","Adoor","K
odumon","Chandanappally","Anandapally"};
 String Descr[]={"An old temple dedicated to lord parthasarathy situated
at the centre of the town.",
 "Peringanad is An old temple dedicated to lord Shiva. The
kaalakett festival is famous here.",
 "Also known as Valiyakoikkal Palace, It is the palace where
lord Ayyappa spend his childhood. Those who are going to Sabarimala also
visits this place.",
 "This is a mountain from which you can see clouds nearby.You
can enjoy the beauty of nature here.",
 "Mannadi is a famous bhadrakali temple. It is also famous for
Veluthambi Dalava.",
 "It is a small amusement park located in Adoor. Children can
enjoy the water themed park set there.",
 "The Palliyara Sree Bhagavathy Temple, renowned to the devotees
as the Chilanthi Ambalam (place of worship dedicated to sanctified or
deified spider) is a sacred temple of worship for those ailing and
suffering from spider poison or toxins. Located about 10 KM away from Adoor
and 11 km from Pathanamthitta, the temple is located in the back drop of
the Sakthibhadra Samskarika Kendram Complex. It is believed to be only one
of its kinds in India which attracts thousands of devotees from far and
near for the purpose of divine healing.",
 "It is a famous church renowned for the festival called
Chembedupp.",
 "It is a christian church famous for the bull festival called
Maramadi."};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main11);
 getSupportActionBar().setTitle("Adoor Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 Item listItem=new Item(MainActivity12.this,PN,Pos,k,Descr);
 simpleList=findViewById(R.id.simpleListView);
 simpleList.setAdapter(listItem);
 simpleList.setOnItemClickListener(new
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view,
int i, long l) {
 Intent intent = new
Intent(MainActivity12.this,MainActivity13.class);
 Bundle bundle=new Bundle();
 Bitmap bmp=
BitmapFactory.decodeResource(getResources(),k[i]);
 ByteArrayOutputStream stream =new ByteArrayOutputStream();
 bmp.compress(Bitmap.CompressFormat.JPEG,30,stream);
 byte[] byteArray = stream.toByteArray();
 bundle.putByteArray("image",byteArray);
 bundle.putString("name",PN[i]);
 bundle.putString("desc",Descr[i]);
 intent.putExtras(bundle);
 startActivity(intent);
 }
 });
 }
}
