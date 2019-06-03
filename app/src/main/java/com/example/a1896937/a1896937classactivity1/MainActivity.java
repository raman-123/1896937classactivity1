package com.example.a1896937.a1896937classactivity1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit_Fname,edit_Lname,edit_email,edit_pass ;
    Button button;
    String TAG="click submit";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_Fname=findViewById(R.id.fname);
        edit_Lname=findViewById(R.id.Lname);
        edit_email=findViewById(R.id.email);
        edit_pass=findViewById(R.id.pass);

        button=findViewById(R.id.submit);

        final Toast mytoast=Toast.makeText(getApplicationContext(),edit_Fname.getText().toString(),Toast.LENGTH_SHORT);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edit_Fname.getText().toString();
                String lname=edit_Lname.getText().toString();
                String email=edit_email.getText().toString();
                String password=edit_pass.getText().toString();



                Log.v(TAG,name);
                Log.v(TAG,lname);
                Log.v(TAG,email);
                Log.v(TAG,edit_pass.getText().toString());


                // Toast.makeText(getApplicationContext(),edt_name.getText().toString(),Toast.LENGTH_LONG).show();
                mytoast.setText("Surya Teja! Thank You");
                mytoast.setDuration(Toast.LENGTH_LONG);

                mytoast.show();
                Snackbar.make(v, "Registration is Done", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }

        });


    }

}
