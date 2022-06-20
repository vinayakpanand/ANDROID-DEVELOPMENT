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
public class MainActivity10 extends AppCompatActivity {
 ListView simpleList;
 Integer
k[]={R.drawable.perunthenaruvi,R.drawable.charalkunn,R.drawable.aruvikuzhi,
R.drawable.muzhiyar,R.drawable.ranniele};
 String PN[]={"Perunthenaruvi Falls","Charalkunnu","Aruvikkuzhy
falls","Dams","Ranni Forest"};
 String Pos[]={"Vechoochira","Charalkunnu","Thadiyoor","Gavi","Ranni"};
 String Descr[]={"Perunthenaruvi Waterfalls are waterfalls 36 km (22 mi)
from Pathanamthitta in Pathanamthitta District, Central Travancore region,
Kerala State, India. It is a popular tourist destination situated in
Vechoochira Panchayat of Ranni taluk. The one shore of this waterfall is
Kudamurutty and Vechoochira is the other. The main route to this waterfall
starts from Ranni - Athikkayam - Kudamurutty - Perunthenaruvi. It is a fine
place to spend time with family in a very serene atmosphere.",
 "Charalkunnu is an upcoming hotbed of tourist activity located near
Ranni in Pathanamthitta. This hill station has a host of trekking trails
and a variety of picturesque picnic spots to soak in the view. People can
easily find comfortable lodging at the camp house. The area around the
place is tailor-made for peaceful and relaxing walks in the arms of
nature.",
 "It is a beautiful waterfalls located at Thadiyoor. It is
active only during rainy season.",
 "You would also pass by the dams of Moozhiyar, Kakki, Anathode,
Gavi and Kochu Pamba along the route. These five dams are the part of
Sabarigiri Hydro Electric project.",
 "The Ranni Forest Division in Kerala, India, was constituted on
7 July 1958, comprising the Ranni, Vadasserikkara, and Goodrical ranges,
with its headquarters at Ranni. It covers the parts of Konni reserve forest
and the reserves of Ranni, Goodrical, Rajampara, Karimkulam, Kumaramperoor,
Valiyakavu, and Schettakkal. It covers an area of 1,059 square kilometres
(409 sq mi)."};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main10);
 getSupportActionBar().setTitle("Ranni Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 Item listItem=new Item(MainActivity10.this,PN,Pos,k,Descr);
 simpleList=findViewById(R.id.simpleListView);
 simpleList.setAdapter(listItem);
 simpleList.setOnItemClickListener(new
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view,
int i, long l) {
 Intent intent = new
Intent(MainActivity10.this,MainActivity13.class);
 Bundle bundle=new Bundle();
 Bitmap bmp=
BitmapFactory.decodeResource(getResources(),k[+i]);
 ByteArrayOutputStream stream =new ByteArrayOutputStream();
 bmp.compress(Bitmap.CompressFormat.JPEG,30,stream);
 byte[] byteArray = stream.toByteArray();
 bundle.putByteArray("image",byteArray);
 bundle.putString("name",PN[+i]);
 bundle.putString("desc",Descr[+i]);
 intent.putExtras(bundle);
 startActivity(intent);
 }
 });
 }
}
