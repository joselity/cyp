package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class DatosClass extends Activity {


    EditText name;
    EditText address;
    EditText mail;
    EditText postalCode;
    EditText phoneNumber;
    int pollos;
    int cervezas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);

        Bundle pedido = getIntent().getExtras();

        pollos = pedido.getInt("pollos");
        cervezas = pedido.getInt("cervezas");

        name = (EditText)findViewById(R.id.inputName);
        address = (EditText)findViewById(R.id.inputAddress);
        mail = (EditText)findViewById(R.id.inputMail);
        postalCode = (EditText)findViewById(R.id.inputCP);
        phoneNumber = (EditText)findViewById(R.id.inputPhone);
    }


    public void executeControl (View view) {


        Intent i = new Intent(this, ControlEdadClass.class);

        String nombre = name.getText().toString();
        String direccion = address.getText().toString();
        String email = mail.getText().toString();
        String codigoPostal = postalCode.getText().toString();
        String telefono = phoneNumber.getText().toString();

        if (nombre.length() == 0 || direccion.length() == 0 || email.length() == 0 || codigoPostal.length() == 0 || telefono.length() == 0) {

            Toast toast = Toast.makeText(getApplicationContext(),"Completa los datos para continuar, gracias!", Toast.LENGTH_SHORT);
            toast.show();

        } else {

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
}

