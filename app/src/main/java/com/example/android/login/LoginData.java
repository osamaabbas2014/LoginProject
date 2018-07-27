package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginData extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_data);

        //obtain  Intent Object send  from MainActivity
        Intent intent = this.getIntent();

        /* Obtain data from Intent  */
        if(intent!=null){

            //set the sen_email view with the sent data
            TextView emailView = (TextView) findViewById(R.id.sent_email);

            emailView.setText(intent.getExtras().getString("email"));

            //set the sent_pass view with the sent password
            TextView passView = (TextView) findViewById(R.id.sent_pass);

            passView.setText(intent.getExtras().getString("pass"));

            //set the sent_again view with the sent again password
            TextView againView = (TextView) findViewById(R.id.sent_again);

            againView.setText(intent.getExtras().getString("again"));

            //set the sent_mobile view with the sent mobile
            TextView mobileView = (TextView) findViewById(R.id.sent_mobile);

            mobileView.setText(intent.getExtras().getString("mobile"));


        }


    }
}
