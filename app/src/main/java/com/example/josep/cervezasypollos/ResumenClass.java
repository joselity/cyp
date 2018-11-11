package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumenClass extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen);

        // Recuperamos los datos pasados de la actividad anterior

        Bundle datos = getIntent().getExtras();

        int cervezas = datos.getInt("cervezas");
        int pollos = datos.getInt("pollos");

        String nombre = datos.getString("nombre");
        String direccion = datos.getString("direccion");
        String email = datos.getString("email");
        String telefono = datos.getString("telefono");
        String codigoPostal = datos.getString("codigoPostal");

        // Creamos las variables de tipo textview y les asignamos su texto mediante setText()

        TextView resumen = (TextView)findViewById(R.id.resumenFinal);
        TextView chickenTotal = (TextView)findViewById(R.id.totalPollos);
        TextView beerTotal = (TextView)findViewById(R.id.totalBirras);


        resumen.setText("Gracias por tu pedido " + nombre + "!  \n\nEn breve te mandamos los " + pollos + " pollos y las " + cervezas + " birras");
        chickenTotal.setText(pollos + " pollos * 12,90€ = " + pollos*12.90 + " €");
        beerTotal.setText(cervezas + " birras * 1,75€ = " + cervezas*1.75 + " €");

    }

}
