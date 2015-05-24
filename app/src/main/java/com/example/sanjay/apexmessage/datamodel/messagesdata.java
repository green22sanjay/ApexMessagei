package com.example.sanjay.apexmessage.datamodel;

/**
 * Created by SANJAY on 07/05/2015.
 */
public class messagesdata {
    String msg_id,msg_content;

    public messagesdata(    ){

    }

    public messagesdata(String msg_id, String msg_content) {
        this.msg_id = msg_id;
        this.msg_content = msg_content;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public String getMsg_content() {
        return msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }
}
