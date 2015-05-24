package com.example.sanjay.apexmessage.datamodel;

/**
 * Created by SANJAY on 10/05/2015.
 */
public class contactsdatamodel {

    String cname,cphone;

    boolean selected;

    public contactsdatamodel(){

    }
    public contactsdatamodel(String cname, String cphone, boolean selected) {

        this.cname = cname;
        this.cphone = cphone;
        this.selected = selected;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
