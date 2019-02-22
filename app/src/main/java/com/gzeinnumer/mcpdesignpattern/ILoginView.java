package com.gzeinnumer.mcpdesignpattern;

import android.content.Context;
import android.widget.Toast;



public class ILoginView {

    private Context context;
    public ILoginView(Context context) {
        this.context = context;
    }

    public void onLoginSuccess(String message) {
        Toast.makeText(context, "Masuk", Toast.LENGTH_SHORT).show();
    }

    public void onLoginError(String message) {
        Toast.makeText(context, "Gagal", Toast.LENGTH_SHORT).show();
    }
}
