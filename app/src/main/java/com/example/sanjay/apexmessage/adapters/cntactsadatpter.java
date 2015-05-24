package com.example.sanjay.apexmessage.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanjay.apexmessage.R;
import com.example.sanjay.apexmessage.datamodel.contactsdatamodel;
import com.example.sanjay.apexmessage.datamodel.messagesdata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SANJAY on 11/05/2015.
 */
public class cntactsadatpter extends BaseAdapter {

    private static final String TAG = cntactsadatpter.class.getSimpleName();
    private Activity activity;
    private LayoutInflater inflater;
    private List<contactsdatamodel>  contactsdatamodel;

    public cntactsadatpter(Activity activity, List<contactsdatamodel> contactsdatamodel) {
        this.activity = activity;

        this.contactsdatamodel = contactsdatamodel;
    }

    @Override
    public void notifyDataSetChanged() // Create this function in your adapter class
    {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return contactsdatamodel.size();
    }

    @Override
    public Object getItem(int position) {
        return contactsdatamodel.get(position);
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
            convertView = inflater.inflate(R.layout.contactlist, null);

        TextView contactName = (TextView) convertView.findViewById(R.id.contactname);
        TextView contactPhone = (TextView) convertView.findViewById(R.id.contactphonemuber);

        CheckBox ccheckBox = (CheckBox) convertView.findViewById(R.id.checkBox1);


            contactsdatamodel itmc = contactsdatamodel.get(position);


        String pname = itmc.getCname();

        String phonumber = itmc.getCphone();


        contactName.setText(pname);

        contactPhone.setText(phonumber);

        ccheckBox.setChecked(itmc.isSelected());



        return convertView;
    }

    }
    /*
    private List<contactsdatamodel> mContactsdatamodels;
    private Activity mActivity;
    public cntactsadatpter(Context context, int textViewResourceId,
                           List<contactsdatamodel> mContactsdatamodels) {
        super(context, textViewResourceId, mContactsdatamodels);
        this.mContactsdatamodels = new ArrayList<contactsdatamodel>();
        this.mContactsdatamodels.addAll(mContactsdatamodels);
    }

    private class ViewHolder {
        TextView contnm,contactphone;
        CheckBox name;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        Log.v("ConvertView", String.valueOf(position));

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater)mActivity.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.contactlist, null);
            holder = new ViewHolder();
            holder.contnm = (TextView) convertView.findViewById(R.id.contactname);
            holder.contactphone = (TextView) convertView.findViewById(R.id.contactphonemuber);
            holder.name = (CheckBox) convertView.findViewById(R.id.checkBox1);
            convertView.setTag(holder);

            holder.name.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v) {
                    CheckBox cb = (CheckBox) v ;
                    contactsdatamodel country = (contactsdatamodel) cb.getTag();
                    Toast.makeText(mActivity.getApplicationContext(),
                            "Clicked on Checkbox: " + cb.getText() +
                                    " is " + cb.isChecked(),
                            Toast.LENGTH_LONG).show();
                    country.setSelected(cb.isChecked());
                }
            });
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        contactsdatamodel country = mContactsdatamodels.get(position);
        holder.contnm.setText(" (" +  country.getCname() + ")");
        holder.name.setText(country.getCphone());
        holder.name.setChecked(country.isSelected());
        holder.name.setTag(country);

        return convertView;

    }

    */


