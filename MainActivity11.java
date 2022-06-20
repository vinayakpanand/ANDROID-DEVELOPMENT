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
public class MainActivity11 extends AppCompatActivity {
 ListView simpleList;
 Integer
k[]={R.drawable.aranmula,R.drawable.malayalappuzha,R.drawable.kadammanitta,
R.drawable.omalloor,R.drawable.maramon,R.drawable.chuttipara,R.drawable.che
rukolpuzha,R.drawable.manjanikkara,R.drawable.konniele,R.drawable.adavi,R.d
rawable.mannera,R.drawable.muloor};
 String PN[]={"Thiru Aranmula Temple","Malayalappuzha Devi
temple","Kadammanitta Devi Temple","Omalloor Rakthakanda Swamy
Temple","Maramon Convention","Chuttippara","Cherukolpuzha
Convention","Manjanikkara Dayara","Konni Elephant Park","Adavi Eco
Tourism","Manneera Falls","Muloor Smarakam"};
 String
Pos[]={"Aranmula","Malayalappuzha","Kadammanitta","Omalloor","Kozhencherry"
,"Pathanamthitta","Ayiroor","Manjanikkara","Konni","Adavi","Adavi","Muloor"
};
 String Descr[]={"The Aranmula Parthasarathy Temple is one of the
\"Divya Desams\", the 108 temples of Vishnu revered by the 12 poet saints,
or Alwars located near Aranmula, a village in Pathanamthitta District,
Kerala, South India. Constructed in the Kerala style of architecture, the
temple is glorified in the Divya Prabandha, the early medieval Tamil canon
of the Azhwar saints from the 6th–9th centuries AD. It is one of the 108
Divyadesam dedicated to Krishna, an avatar of Vishnu, who is worshipped as
Parthasarathy (Partha's charioteer). The nearest railway station to the
temple is located in Chengannur, while the nearest airport is Trivandrum
International Airport.",
 "Malayalappuzha Devi Temple is a Bhadrakali temple situated at
Malayalappuzha in Pathanamthitta in Kerala, India. It is believed that the
temple was built more than 1000 years ago.",
 "The Kadammanitta Devi Temple is famous for the ten-day long
Patayani performances held in connection with the annual festival in
April/May. Kadammanitta is famous for the Patayani performance at the Devi
temple here, which is a burst of colour, energy and passionate devotion.
The festival is celebrated every year from the first day of Malayalam month
medam to the 10th day, called the pathamudayam.",
 "The only temple dedicated to the Mahabharata warrior
Abhimanyu.",
 "The biggest christian Gathering in Asia. It is a week program
during February Month.",
 "It is a mountain located in the town area. From there you can
see the sunset in Pathanamthitta town.",
 "A Seasonal Hindu Convention in the month of February is held
in Cherukolpuzha every year and also it is one of the existing Kathakali
Gramam in Kerala",
 "Manjanikkara Dayara is a monastery of the Syriac Orthodox
Church. It is situated at the top of the hillock in Manjanikkara, near
Omallur, Pathanamthitta District, in South Kerala, India. The monastery was
established by Mor Yulios Elias Qoro, Patriarchal delegate to the Malankara
Church. The Manjanikkara Dayro is the seat of the Patriarchal Delegate to
Malankara and the metropolitan of the Simhasana churches (churches
administered directly by the Patriarchate).",
 "Konni is among the most prominent elephant training centres in
Kerala. Located in Pathanamthitta district, it attracts visitors in large
numbers throughout the year. One of the major attractions here are the
giant wooden cages used to house the elephants. Locally known as Aanakoodu,
they can house up to 3 to 4 elephants at a time.",
 "With a 5-km stretch broadened by the Kallar River, Adavi
welcomes you to experience nature at its best. The package is available in
two slots – one is short ride and the other long ride. The place is best
during monsoon as the river is full and you can experience the fresh air,
and soak yourself in the scenery of pristine greenery, and clear waters of
the Kallar River. ",
 "A little further ahead from the eco-tourism center is Manneera
waterfalls, a cascade-like fall, which is safe to play around. If you are
the adventurous type, climb up half a kilometer through the path of the
falls and voila, more water than you saw at Mannira and it is deep enough
to take a dip. But be cautious, as the rocks on the way up are slippery.",
 "Muloor Smarakam or Muloor Memorial, siutated about 12 km from
Pathanamthitta town is the memorial to Muloor S.Padmanabha Panicker(1869-
1931) a renowned social reformer and poet, is located at Elavumthitta. His
home at Elavumthitta is preserved as his monument by the Department of
Culture of the State Government."
 };
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main11);
 getSupportActionBar().setTitle("Kozhencherry and Konni Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 Item listItem=new Item(MainActivity11.this,PN,Pos,k,Descr);
 simpleList=findViewById(R.id.simpleListView);
 simpleList.setAdapter(listItem);
 simpleList.setOnItemClickListener(new
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view,
int i, long l) {
 Intent intent = new
Intent(MainActivity11.this,MainActivity13.class);
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
