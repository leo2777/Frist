package com.leo.butterknife;

import lombok.Data;

@Data
public class Base {
    private String Msg;
    private String S;

    public Base(String Msg){
        this.Msg=Msg;
    }
}
