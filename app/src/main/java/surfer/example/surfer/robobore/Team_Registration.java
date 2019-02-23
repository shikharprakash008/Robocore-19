package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import surfer.example.surfer.robobore.Model.Register;

public class Team_Registration extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference team;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team__registration);
        editText1= findViewById(R.id.editText4);
        editText2=findViewById(R.id.editText5);
        editText3=findViewById(R.id.editText6);
        editText4=findViewById(R.id.editText7);
        editText5=findViewById(R.id.editText8);
        editText6=findViewById(R.id.editText9);
        editText7=findViewById(R.id.editText10);
        editText8=findViewById(R.id.editText11);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);

        database=FirebaseDatabase.getInstance();
        team=database.getReference("Team Name");

imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i= new Intent(Team_Registration.this,MainActivity.class);
        startActivity(i);
    }
});
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Register register = new Register(editText1.getText().toString(),editText2.getText().toString(),
                        editText3.getText().toString(),editText4.getText().toString(),
                        editText5.getText().toString(),editText6.getText().toString(),
                        editText7.getText().toString(),editText8.getText().toString());
                team.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child(register.getTeamName()).exists())
                            Toast.makeText(Team_Registration.this,"Team Name already Exits",Toast.LENGTH_SHORT).show();
                        else
                        {
                            team.child(register.getTeamName()).setValue(register);
                            Toast.makeText(Team_Registration.this,"Registration Succesfull",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });

    }
}
