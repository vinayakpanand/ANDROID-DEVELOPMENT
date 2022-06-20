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
public class MainActivity9 extends AppCompatActivity {
 ListView simpleList;
 Integer
k[]={R.drawable.thirumalida,R.drawable.kallooparatmpl,R.drawable.klpchurch,
R.drawable.parippukad,R.drawable.hangingbridge,R.drawable.nagappara};
 String PN[]={"Thirumalida Mahadeva Temple","Kalloopara
Temple","Kalloopara St.Mary's Church","Parippukad Temple","Vaipur Hanging
Bridge","Nagappara"};
 String
Pos[]={"Mallappally","Kalloopara","Kalloopara","Shanthipuram","Vaipur","Vai
pur"};
 String Descr[]={"Thirumalida Swayambhoo Mahadeva Temple is one of the
most famous temples in the southern part of Kerala, dedicated to Lord
Shiva.The Temple stands of the scenic eastern bank of the Manimala River at
Mallappally in Pathanamthitta District of Kerala India.",
 "Kallooppara Padayani is annual festival being performed at
Kallooppara Sree Bhagavathy Temple in Pathanamthitta. Celebrated on Revathy
and Aswathy asterism in the Malayalam month of Kumbham (February-March),
the major attraction at Kallooppara is the velakali performance held prior
to the Padayani procession. ",
 "St. Mary's Orthodox Syrian Church, situated at the heart of a
small village called Kallooppara (on the banks of the river Manimala
River), Pathanamthitta District, Kerala, India is a prized possession of
Malankara Sabha. The church has a legacy of around seven centuries, keeping
its tradition and culture intact without compromising on its religious
values. The church is an elegant representation of the beautiful shingled
roof tops in the early Travancore style. The church is a perfect example of
the ancient temple architecture and is a mystery the way it has overcome
all the challenges of time. The sanctuary that is abstract in all aspects
is a mystifying beauty of the ancient architecture, which has a keen and
splendid blend of beauty and science in it.",
 "This is a tamil Style temple dedicated to Durga Devi",
 "Thookupalam is an attraction in this area which connects the
two sides of river manimala.",
 "It is a mountain located at Vaipur.people usually go there for
spending their free time with nature. An option of trekking is also
there."};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main9);
 getSupportActionBar().setTitle("Mallappally Taluk");
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 Item listItem=new Item(MainActivity9.this,PN,Pos,k,Descr);
 simpleList=findViewById(R.id.simpleListView);
 simpleList.setAdapter(listItem);
 simpleList.setOnItemClickListener(new
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> adapterView, View view,
int i, long l) {
 Intent intent = new
Intent(MainActivity9.this,MainActivity13.class);
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
