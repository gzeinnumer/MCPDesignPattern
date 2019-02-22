package com.gzeinnumer.mcpdesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.edEmail)
    EditText edEmail;
    @BindView(R.id.edPassword)
    EditText edPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;

    LoginPresenter loginPresenter;
    ILoginView loginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        loginPresenter.onLogin(edEmail.getText().toString(), edPassword.getText().toString());
    }




}
