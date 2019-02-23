package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    ImageView imageView;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=findViewById(R.id.imageView3);
        frombottom=AnimationUtils.loadAnimation(this,R.anim.from_botttom);
        imageView.setAnimation(frombottom);
        Thread t =new Thread(){

            @Override
            public void run() {
                super.run();

                try {
                    sleep(2200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
                    splash.this.finish();
                }
            }
        };t.start();
}}
