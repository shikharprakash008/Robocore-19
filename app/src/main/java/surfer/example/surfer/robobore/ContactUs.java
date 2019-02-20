package surfer.example.surfer.robobore;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.media.Image;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView imageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        button1 =(Button)findViewById(R.id.buttonmessage);
        button2=(Button)findViewById(R.id.buttonweb);
        button3=(Button)findViewById(R.id.buttoncall);
        imageview=(ImageView)findViewById(R.id.back);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(ContactUs.this,MainActivity.class);
                startActivity(back);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8239068721"));

                if (PackageManager.PERMISSION_GRANTED != ActivityCompat.checkSelfPermission(ContactUs.this,
                        Manifest.permission.CALL_PHONE)) {
                    startActivity(callIntent);
                    return;
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("http://www.corsit.in/"));
                startActivity(browse);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent messageintent=new Intent(Intent.ACTION_VIEW);
                //messageintent.setType("vnd.android-dir/mms-sms");
                messageintent.setData(Uri.parse("sms:"));
                messageintent.putExtra("address","8239068721");
                startActivity(messageintent);
            }
        });

    }
}
