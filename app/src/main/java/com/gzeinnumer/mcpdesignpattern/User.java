package com.gzeinnumer.mcpdesignpattern;

import android.text.TextUtils;
import android.util.Patterns;

public class User {
    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int isValidData() {
        //0. check email is empty
        //1. check password is empty
        //2. check passlength > 6

        if (TextUtils.isEmpty(getEmail()))
            return 0;
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 1;
        else if (getPassword().length() <= 6)
            return 2;
        else
            return -1;
    }



}
