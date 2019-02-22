package com.gzeinnumer.mcpdesignpattern;


import android.content.Context;

public class LoginPresenter{

    private Context context;
    ILoginView loginView;

    public LoginPresenter(Context context) {
        this.context = context;
    }

    public void onLogin(String email, String password) {
        User user = new User(email, password);
        loginView = new ILoginView(context);

        int loginCode = user.isValidData();
        if (loginCode == 0)
            loginView.onLoginError("Masukan Email");
        else if(loginCode == 1)
            loginView.onLoginError("masukan email yang benar");
        else if(loginCode == 2)
            loginView.onLoginError("Harus lebih dari 6 huruf");
        else
            loginView.onLoginSuccess("Suksess!!");
    }
}
