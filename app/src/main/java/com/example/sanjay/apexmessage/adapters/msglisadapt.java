package com.example.sanjay.apexmessage.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.sanjay.apexmessage.MainActivity;
import com.example.sanjay.apexmessage.R;
import com.example.sanjay.apexmessage.datamodel.messagesdata;

import java.util.List;

/**
 * Created by SANJAY on 07/05/2015.
 */
public class msglisadapt extends BaseAdapter {
    private static final String TAG = msglisadapt.class.getSimpleName();
    private Activity activity;
    private LayoutInflater inflater;
    private List<messagesdata>  messagesdatas;
    public msglisadapt(Activity activity,List<messagesdata> messagesdata){
        this.activity=activity;
        this.messagesdatas=messagesdata;
    }

    @Override
    public int getCount() {
        return messagesdatas.size();
    }

    @Override
    public Object getItem(int position) {
        return messagesdatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.messgaeitemview, null);

        TextView msgid = (TextView)convertView.findViewById(R.id.mesageid);
        TextView msgdesc = (TextView)convertView.findViewById(R.id.textdesc);

        messagesdata messagesitem = messagesdatas.get(position);

        String con = (messagesitem.getMsg_content());
Log.v(TAG,con);

        msgid.setText(messagesitem.getMsg_id());
        msgdesc.setText(messagesitem.getMsg_content());

        return convertView;
    }
}
