package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void executeAbout (View view) {

        Intent i = new Intent(this, AboutClass.class);

        startActivity(i);
    }

    public void executeShop (View view) {

        Intent i = new Intent(this, PedidoClass.class);

        startActivity(i);
    }


    public void exitApp (View view) {

        finish();
    }
}
