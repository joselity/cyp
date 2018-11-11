package com.example.josep.cervezasypollos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PedidoClass extends Activity {

    // Declaración variables contadores

    public int beerCount;
    public int chickenCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedidos);

        beerCount = 0;
        chickenCount = 0;
    }

    public void executeOrder (View view) {

        Intent i = new Intent(this, DatosClass.class);


        i.putExtra("cervezas", beerCount);
        i.putExtra("pollos", chickenCount);

        startActivity(i);
    }

    // Métodos incrementadores

    public void moreBeer (View view) {

        beerCount++;
        setBeerCount();
    }

    public void moreChicken (View view) {

        chickenCount++;
        setChickenCount();
    }


    // Métodos decrementadores

    public void lessBeer (View view) {

        beerCount--;

        if (beerCount < 0) {
            beerCount = 0;
        }

        setBeerCount();
    }

    public void lessChicken (View view) {

        chickenCount--;

        if (chickenCount < 0) {
            chickenCount = 0;
        }

        setChickenCount();
    }

    public void setBeerCount() {

        TextView beerRes = (TextView)findViewById(R.id.cuentaBirras);

        if (beerCount == 0) {
            beerRes.setText("");
        } else {
            beerRes.setText("" + beerCount);
        }
    }

    public void setChickenCount() {

        TextView chickenRes = (TextView)findViewById(R.id.cuentaPollos);

        if (chickenCount == 0) {
            chickenRes.setText("");
        } else {
            chickenRes.setText("" + chickenCount);
        }
    }

}
