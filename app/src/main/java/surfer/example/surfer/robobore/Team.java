package surfer.example.surfer.robobore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Team extends AppCompatActivity {
    ImageView m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m30;
    ImageView m31, m32, m33, m34, m35, m36, m37, m38, m39, m40, m41, m42, m43, m44, m45, m46, m47, m48, m49, m50, m51, m52, m53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        m1= findViewById(R.id.image1);
        m2=findViewById(R.id.image2);
        m3=findViewById(R.id.image3);
        m4=findViewById(R.id.image4);
        m5=findViewById(R.id.image5);
        m6=findViewById(R.id.image6);
        m7=findViewById(R.id.image7);
        m8=findViewById(R.id.image8);
        m9=findViewById(R.id.image9);
        m10=findViewById(R.id.image10);
        m11=findViewById(R.id.image11);
        m12=findViewById(R.id.image12);
        m13=findViewById(R.id.image13);
        m14=findViewById(R.id.image14);
        m15=findViewById(R.id.image15);
        m16=findViewById(R.id.image16);
        m17=findViewById(R.id.image17);
        m18=findViewById(R.id.image18);
        m19=findViewById(R.id.image19);
        m20=findViewById(R.id.image21);
        m21=findViewById(R.id.image22);
        m22=findViewById(R.id.image23);
        m24=findViewById(R.id.image24);
        m25=findViewById(R.id.image25);
        m26=findViewById(R.id.image26);
        m27=findViewById(R.id.image27);
        m28=findViewById(R.id.image28);
        m29=findViewById(R.id.image29);
        m30=findViewById(R.id.image30);
        m31=findViewById(R.id.image31);
        m32=findViewById(R.id.image32);
        m33=findViewById(R.id.image33);
        m34=findViewById(R.id.image34);
        m35=findViewById(R.id.image35);
        m36=findViewById(R.id.image36);
        m37=findViewById(R.id.image37);
        m38=findViewById(R.id.image38);
        m39=findViewById(R.id.image39);
        m40=findViewById(R.id.image40);
        m41=findViewById(R.id.image41);
        m42=findViewById(R.id.image42);
        m43=findViewById(R.id.image43);
        m44=findViewById(R.id.image44);
        m45=findViewById(R.id.image45);
        m46=findViewById(R.id.image46);
        m47=findViewById(R.id.image47);
        m48=findViewById(R.id.image48);
        m49=findViewById(R.id.image49);
        m50=findViewById(R.id.image50);
        m51=findViewById(R.id.image51);
        m52=findViewById(R.id.image52);
        m53=findViewById(R.id.image53);

  /*      String url="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/arghy.jpg?alt=media&token=1ca40532-3156-4d9e-81f4-68078bf287b5";
        String url1="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/rahul.jpg?alt=media&token=16e1f446-8a9c-41ea-96e2-c9f4e257067b";
        String url2="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/jeeva.jpg?alt=media&token=e049d9b4-aca3-4834-981d-708f3470916a";
        String url3="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/dhanush.jpg?alt=media&token=db372c3d-2d45-4c11-ab54-c1a267130ec8";
        String url4="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/ankit.jpg?alt=media&token=ba1fd1fe-2e4d-4f6d-8962-ad7a03bc0c8c";
        String url5="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/keshav_b.jpg?alt=media&token=c0f940c0-8772-4095-8ae6-1c35338a0944";
        String url6="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/pankaj.jpg?alt=media&token=04475c8b-c30e-4440-848a-329619d07265";
        String url7="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/abhinav.jpg?alt=media&token=2bbef2e5-6ada-49ba-8302-dbe6824ec272";
        String url8="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/anuj.jpg?alt=media&token=bbe8df57-6895-4e4c-9f32-6f71c1dd0998";
        String url9="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/amit.jpg?alt=media&token=7a671e80-7fca-4cf9-afdf-945eabbbfde9";
        String url10="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/natesh.png?alt=media&token=6c2c3d5d-03eb-42df-af38-a0f4179d20f0";
        String url11="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/gs.jpg?alt=media&token=87cf2a25-694e-46a2-ad1a-eb08c148bc42";
        String url12="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/kundan.jpg?alt=media&token=42f915c0-ff12-4b6c-aaf8-4020dadc8419";
        String url13="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/bhavani.jpg?alt=media&token=ab203274-6b45-459f-ac3e-6993d2822b61";
        String url14="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/aquib.jpg?alt=media&token=d73e7ec8-2ddb-472d-99da-94c78113cd8a";
        String url15="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/rohan.jpg?alt=media&token=2d48d7b0-f01a-4fce-aea5-c77d79693bba";
        String url16="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/sweta.jpg?alt=media&token=24a50652-b6ad-4960-8711-fb9ada717660";
        String url17="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/krishnkant.jpg?alt=media&token=616a18c9-6d06-4ed0-9579-2c4e888e6b43";
        String url18="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/hrijusha.jpg?alt=media&token=b4af74e8-df28-4770-8b18-d3ecce5d4387";
        String url19="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/sonakshi.jpg?alt=media&token=dc30a2fd-9b7d-4776-878c-e0e7cd286a14";
        String url20="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/anurag.jpg?alt=media&token=3a88c6ed-c006-4e36-9004-fffcb2ed6298";
        String url21="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/anand.jpg?alt=media&token=88b04211-fdba-4ebf-8ab5-d4d13e40d425";
        String url22="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/anushant.jpg?alt=media&token=1b67188c-87b9-4297-8e51-0ac88a092e08";
        String url23="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/amaan.jpg?alt=media&token=c436dd23-2a2f-4b8e-a90b-d680f40eed48";
        String url24="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/aditi.jpeg?alt=media&token=f7981073-8494-43b3-882a-fd9349dd658e";
        String url25="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/asra.jpg?alt=media&token=1774eadd-2a71-4108-98f9-3a27a65bad29";
        String url26="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/chetan.jpg?alt=media&token=5180b120-4520-4c25-9876-70f1272ec2f3";
        String url27="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/astha.jpg?alt=media&token=80c20684-1c82-4df9-8bf6-fa0575fe0a8d";
        String url28="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/nikita.png?alt=media&token=f1d703c6-53c0-4a8f-bccd-653ef204ed35";
        String url29="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/raghav.jpg?alt=media&token=81febfd9-8807-4ea1-af88-53d57da3dba1";
        String url30="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/saksham.jpg?alt=media&token=326e79db-e3ab-4167-8cd8-abed34c8263f";
        String url31="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/sandeep.jpg?alt=media&token=3d9b485d-5065-4d4b-a314-779ddfa0678d";
        String url32="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/xyz.jpg?alt=media&token=69b357de-6091-40a4-bd6d-2dfc41327763";
        String url33="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/manojana.png?alt=media&token=a0790eb2-6493-42eb-a9cf-82daac142224";
        String url34="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/shivu.jpeg?alt=media&token=65b8bfa4-ef6e-4188-b296-1cb5f8efccc4";
        String url35="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/kaisar.jpg?alt=media&token=5c5acb9f-1d0e-467b-a97f-52aef5013062";
        String url36="";
        String url37="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/chetan_j.jpg?alt=media&token=e5852347-b5d5-4fa7-b242-53052d89c35b";
        String url38="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/shagun.jpg?alt=media&token=7dea8acf-5aca-4b3a-b7b7-238bea1c8041";
        String url39="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/tanmay.jpg?alt=media&token=4db8b784-3350-4795-b881-1e2ebd830dbe";
        String url40="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/shristi.jpg?alt=media&token=8dfb1d1b-2a3d-4a5a-a568-210a811f3844";
        String url41="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/ansa.JPG?alt=media&token=07bde1c9-fead-4a79-bb50-1f6e609cb792";
        String url42="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/rohit.jpg?alt=media&token=61b6f0ad-324f-4af2-8167-c96d21558ff3";
        String url43="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/chaya.jpg?alt=media&token=e3e8e129-476d-4ebe-aa27-ea0e1801988b";
        String url44="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/rohan_r.jpg?alt=media&token=6bb0e877-c6a8-4d29-bc11-271303e46f56";
        String url45="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/aman.jpg?alt=media&token=66474f2d-179b-4e33-bfc6-ea2485ab6575";
        String url46="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/sashvat.jpg?alt=media&token=78f73bc5-8314-4396-97cd-b1e00c3e7c57";
        String url47="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/mehraj.jpg?alt=media&token=03dfb965-b6cd-4bfc-95e8-ad94eb1fcc79";
        String url48="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/anshuman.jpg?alt=media&token=0c748865-d177-4126-9093-84ca5effd6d5";
        String url49="https://firebasestorage.googleapis.com/v0/b/robocore-bf107.appspot.com/o/bhakti.jpeg?alt=media&token=ce2534c6-5569-49c0-b01f-65b97020ac76";
        String url50="";
        String url51="";
        String url52="";
*/
      /*  Glide.with(getApplicationContext()).load(url).into(m1);
        Glide.with(getApplicationContext()).load(url1).into(m2);
        Glide.with(getApplicationContext()).load(url2).into(m3);
        Glide.with(getApplicationContext()).load(url3).into(m4);
        Glide.with(getApplicationContext()).load(url4).into(m5);
        Glide.with(getApplicationContext()).load(url5).into(m7);
        Glide.with(getApplicationContext()).load(url6).into(m8);
        Glide.with(getApplicationContext()).load(url7).into(m9);
        Glide.with(getApplicationContext()).load(url8).into(m10);
        Glide.with(getApplicationContext()).load(url9).into(m11);
        Glide.with(getApplicationContext()).load(url10).into(m12);
        Glide.with(getApplicationContext()).load(url11).into(m13);
        Glide.with(getApplicationContext()).load(url12).into(m14);
        Glide.with(getApplicationContext()).load(url13).into(m15);
        Glide.with(getApplicationContext()).load(url14).into(m16);
        Glide.with(getApplicationContext()).load(url15).into(m17);
        Glide.with(getApplicationContext()).load(url16).into(m18);
        Glide.with(getApplicationContext()).load(url17).into(m19);
        Glide.with(getApplicationContext()).load(url18).into(m20);
        Glide.with(getApplicationContext()).load(url19).into(m21);
        Glide.with(getApplicationContext()).load(url20).into(m22);
        Glide.with(getApplicationContext()).load(url21).into(m23);
        Glide.with(getApplicationContext()).load(url22).into(m24);
        Glide.with(getApplicationContext()).load(url22).into(m25);
        Glide.with(getApplicationContext()).load(url23).into(m26);
        Glide.with(getApplicationContext()).load(url24).into(m27);
        Glide.with(getApplicationContext()).load(url25).into(m28);
        Glide.with(getApplicationContext()).load(url26).into(m29);
        Glide.with(getApplicationContext()).load(url27).into(m30);
        Glide.with(getApplicationContext()).load(url28).into(m31);
        Glide.with(getApplicationContext()).load(url29).into(m32);
        Glide.with(getApplicationContext()).load(url30).into(m33);
        Glide.with(getApplicationContext()).load(url31).into(m34);
        Glide.with(getApplicationContext()).load(url32).into(m35);
        Glide.with(getApplicationContext()).load(url33).into(m36);
        Glide.with(getApplicationContext()).load(url34).into(m37);
        Glide.with(getApplicationContext()).load(url35).into(m38);
        Glide.with(getApplicationContext()).load(url36).into(m39);
        Glide.with(getApplicationContext()).load(url37).into(m40);
        Glide.with(getApplicationContext()).load(url39).into(m41);
        Glide.with(getApplicationContext()).load(url40).into(m42);
        Glide.with(getApplicationContext()).load(url41).into(m43);
        Glide.with(getApplicationContext()).load(url42).into(m44);
        Glide.with(getApplicationContext()).load(url43).into(m45);
        Glide.with(getApplicationContext()).load(url44).into(m46);
        Glide.with(getApplicationContext()).load(url45).into(m47);
        Glide.with(getApplicationContext()).load(url46).into(m48);
        Glide.with(getApplicationContext()).load(url47).into(m49);
        Glide.with(getApplicationContext()).load(url48).into(m50);
        Glide.with(getApplicationContext()).load(url49).into(m51);
        Glide.with(getApplicationContext()).load(url50).into(m53);
        Glide.with(getApplicationContext()).load(url51).into(m53);
*/
















    }
}



























