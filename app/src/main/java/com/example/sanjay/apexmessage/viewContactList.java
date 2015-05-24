package com.example.sanjay.apexmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sanjay.apexmessage.adapters.cntactsadatpter;
import com.example.sanjay.apexmessage.adapters.msglisadapt;
import com.example.sanjay.apexmessage.datamodel.contactsdatamodel;
import com.example.sanjay.apexmessage.datamodel.messagesdata;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SANJAY on 08/05/2015.
 */

public class viewContactList extends ActionBarActivity {

    private static final String TAG = viewContactList.class.getSimpleName();
    private ListView listView;
    private Context mContext;
    private cntactsadatpter listAdapter;
    private List<contactsdatamodel> feedItem;
    Button mBtnselctall,mBtnunselct;
    ArrayAdapter<String> adapter;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);
        getSupportActionBar().setCustomView(R.layout.customactionbartwo);



        setContentView(R.layout.contactview);
        listView = (ListView) findViewById(R.id.listView1);
        feedItem = new ArrayList<contactsdatamodel>();
        listAdapter = new cntactsadatpter(this,feedItem);
        Cursor c = getContentResolver().query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,
                null, null, null);
        while (c.moveToNext()) {

            contactsdatamodel item = new contactsdatamodel();
            String contactName = c
                    .getString(c
                            .getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phNumber = c
                    .getString(c
                            .getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));




            item.setCname(contactName);
            item.setCphone(phNumber);
            item.setSelected(false);

            feedItem.add(item);

        }
        c.close();
        listView.setAdapter(listAdapter);

        mBtnselctall = (Button)findViewById(R.id.btnslall);
        mBtnunselct = (Button)findViewById(R.id.btnunall);



        mBtnselctall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                }

        });


        mBtnunselct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






        }
    });


        Button mButton = (Button)getSupportActionBar().getCustomView().findViewById(
                R.id.btnPost);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<listAdapter.getCount();i++){

                    contactsdatamodel contactsdatamodel=(contactsdatamodel)listAdapter.getItem(i);
                    if(contactsdatamodel.isSelected()){

                        String s=contactsdatamodel.getCphone();
                        Log.v(TAG,s);
                    }
                }





            }


        }


    );

    checkButtonClick();
    }

    private void displayListView() {


    }



    private void checkButtonClick() {

    }
}
