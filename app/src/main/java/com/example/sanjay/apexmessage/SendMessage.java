package com.example.sanjay.apexmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SANJAY on 08/05/2015.
 */
public class SendMessage extends Activity {

    TextView testmsg;
    ImageButton mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendmessage);
        String getmsg = getIntent().getStringExtra("sendmsg");

        testmsg = (TextView)findViewById(R.id.messagebody);
        mButton = (ImageButton)findViewById(R.id.addbut);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SendMessage.this,viewContactList.class);
                startActivity(intent);

            }
        });
        Toast.makeText(getApplicationContext(),getmsg,Toast.LENGTH_LONG).show();
        testmsg.setText(getmsg);


    }

}
