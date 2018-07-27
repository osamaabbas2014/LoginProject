package com.example.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the continue view
        TextView cont = (TextView) findViewById(R.id.cont);

        // Set a click listener on that View
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The code in this method will be executed when the numbers View is clicked on.
                Intent continueIntent = new Intent(MainActivity.this,LoginData.class);

                //login data
                //============
                //get the email address
                EditText emailView = (EditText) findViewById(R.id.email);
                String email = emailView.getText().toString();

                //get the password
                EditText passView = (EditText) findViewById(R.id.pass);
                String pass = passView.getText().toString();

                //get the again password
                EditText againView = (EditText) findViewById(R.id.again);
                String again = againView.getText().toString();

                //get the mobile
                EditText mobileView = (EditText) findViewById(R.id.mob);
                String mobile = mobileView.getText().toString();

                //send the data in the intent
                continueIntent.putExtra("email",email);
                continueIntent.putExtra("pass",pass);
                continueIntent.putExtra("again",again);
                continueIntent.putExtra("mobile",mobile);

                startActivity(continueIntent);
            }
        });


    }
}
