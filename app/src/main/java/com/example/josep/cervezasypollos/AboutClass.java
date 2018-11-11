package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutClass extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void goHome (View view) {

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);


    }

}

