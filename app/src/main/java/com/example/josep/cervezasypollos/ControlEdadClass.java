package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ControlEdadClass extends Activity {

    int pollos;
    int cervezas;
    String nombre;
    String direccion;
    String email;
    String codigoPostal;
    String telefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_edad);

        Bundle datos = getIntent().getExtras();

        pollos = datos.getInt("pollos");
        cervezas = datos.getInt("cervezas");
        nombre = datos.getString("nombre");
        direccion = datos.getString("direccion");
        email = datos.getString("email");
        codigoPostal = datos.getString("codigoPostal");
        telefono = datos.getString("telefono");


    }


    public void executeResumen (View view) {

        Intent i = new Intent(this, ResumenClass.class);

        i.putExtra("nombre", nombre);
        i.putExtra("direccion", direccion);
        i.putExtra("email", email);
        i.putExtra("codigoPostal", codigoPostal);
        i.putExtra("telefono", telefono);
        i.putExtra("pollos", pollos);
        i.putExtra("cervezas", cervezas);

        startActivity(i);
    }

}
