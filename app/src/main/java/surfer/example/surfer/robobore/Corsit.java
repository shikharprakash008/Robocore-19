package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import de.hdodenhof.circleimageview.CircleImageView;

public class Corsit extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corsit);
        imageView=(ImageView)findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(Corsit.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}
