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
public class MainActivity8 extends AppCompatActivity {
 ListView simpleList;
 Integer k[]={R.drawable.sreevallabha,
R.drawable.parumala2,R.drawable.niranampalli,R.drawable.koodarapally,R.draw
able.kaviyoortemple,R.drawable.rockcut,R.drawable.poovappuzha,R.drawable.bh
ootakuzhy,R.drawable.panayannarkavu,R.drawable.paliyekkara,R.drawable.puthu
2,R.drawable.prds};
 String PN[]={"Sree Vallabha Temple","Parumala Church","Niranam
Church","St.John's Cathedral","Kaviyoor Temple","Rock Cut Temple","Check
Dam","Bhoothakuzhy","Panayannarkavu","Paliakkara Church","Puthukulangara
Temple","PRDS Mandapam"};
 String
Pos[]={"Thiruvalla","Mannar","Niranam","Thiruvalla","Kaviyoor","Kaviyoor","
Eraviperoor","Othera","Mannar","Thiruvalla","Othera","Eraviperoor"};
 String Descr[]={"Sreevallabha Temple is a highly orthodox Hindu temple
dedicated to Lord Sreevallabhan. It is one of the oldest and biggest
Temples of Kerala, and has been a major destination for devotees all over
India for centuries. Located in Thiruvalla city, this ocean of orthodoxy is
well known for its architectural grandeur and unique customs that can be
found in no other temples. There are stone-wooden carvings and mural
paintings inside the temple. Being one among 108 Divya Desams, Sreevallabha
temple has been glorified by Alvars and many other ancient works. ",
 "St. Peter's and St. Paul's Malankara Orthodox Church also
known as Parumala Pally is a famous church in Kerala, India. This church is
located in Parumala in Thiruvalla Taluk In Pathanamthitta district and is a
pilgrimage center and mausoleum of the Malankara Orthodox Syrian Church.",
 "Niranam Pally, popularly known as Niranam Valiya Pally or St.
Mary's Orthodox Syrian Church, Niranam, is a church under the Niranam
Diocese of the Malankara Orthodox Syrian Church. It is historically proven
that this church was founded by Thomas the Apostle one of the twelve
Apostles of Jesus Christ, in AD 54.",
 "Designed by iconic architect Laurie Baker, the cathedral has a
temple-like exterior but a conventional church interior. Aspects of
traditional Kerala architecture, temple architecture and Eastern (Syrian)
Christian tradition were integrated into the design. The exterior design
incorporates elements from the architecture of the old cathedral that it
replaced.",
 "Kaviyoor Mahadevar Temple is one of the important Siva temples
in Kerala, located in Kaviyoor, Tiruvalla Pathanamthitta District, Kerala,
India. It is commonly called Thrikkaviyoor Mahadeva Temple. The main deity
is Lord Mahadeva (Shiva) with Parvathi.The temple is well known for the
Hanuman temple situated inside the temple complex. Kaviyoor Temple is one
of the important Special Grade temples under the Travancore Devaswom
Board.",
 "An ancient rock cut temple is located there, carved on a huge
rock and the carved rooms and sculptures aore well preserved. The Kaviyoor
Thrikkakkudi Cave Temple, also known as the Rock Cut Cave Temple, is of
historical importance and is preserved as a monument by the Archaeological
Department. The temple was taken over by the Travancore Devaswom Board on
20 December 1967",
 "One of the new check dam which is built for agricultural and
water supply purposes",
 "Bhoothakkuzhy is located in Kuttoor Gramapanchayat.It was a
quarrying area and now somany people are coming for enjoying the place",
 "Sri Bhadrakali Temple at Valiya Panayannarkavu is the most
famous among such temples in Kerala. References to this temple are found in
Aithihyamala and Unnineelisandesham, the classics of Malayalam Literature.
The pleasant natural surroundings of Parumala and the grace of the Mother
Goddess in her ferocious Avatar as Bhadrakali, bestowing Her blessings on
the devotees are famous even in other States.",
 "One of the oldest Syrian Orthodox Churches in the area, very
beautifully maintained, very peaceful. The much acclaimed oil paintings on
the altar walls , the tall traditional lantern right in the middle of the
church hall , the chuttuvilakku outside , everything about the church is
beautiful.",
 "Othera Puthukulangara Devi Temple is an ancient Hindu temple
situated in the Othera village of Thiruvalla Taluk in Pathanamthitta
district, Kerala, India, that is dedicated to the goddess, Durga Devi. The
temple is owned by A Trust and an elected committee administrates the
temple. The nearest town is Chengannur and Chengannur Railway Station is 5
km from this temple.",
 "Prathyaksha Raksha Daiva Sabha (PRDS) is a religious protest
movement founded in 1909 by Poykayil Sreekumara Gurudevan in Kerala,
India.The PRDS has its head office located at Eraviperoor, Pathanamthitta.
The PRDS rejected both Christianity and Hinduism, and preached that God
would send an incarnation to liberate the slaves."};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main9);
 getSupportActionBar().setTitle("Thiruvalla Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 Item listItem=new Item(MainActivity8.this,PN,Pos,k,Descr);
 simpleList=findViewById(R.id.simpleListView);
 simpleList.setAdapter(listItem);
 simpleList.setOnItemClickListener(new
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view,
int i, long l) {
 Intent intent = new
Intent(MainActivity8.this,MainActivity13.class);
 Bundle bundle=new Bundle();
 Bitmap bmp=
BitmapFactory.decodeResource(getResources(),k[+i]);
 ByteArrayOutputStream stream =new ByteArrayOutputStream();
 bmp.compress(Bitmap.CompressFormat.JPEG,10,stream);
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
