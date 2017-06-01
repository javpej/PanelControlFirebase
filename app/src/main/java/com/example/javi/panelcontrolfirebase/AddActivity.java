package com.example.javi.panelcontrolfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by javi on 1/06/17.
 */

public class AddActivity extends AppCompatActivity{

    EditText etUrl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_add);
        super.onCreate(savedInstanceState);

        etUrl = (EditText) findViewById(R.id.EtUrl);

    }

    public void pulsarAceptar (View v){

        if (etUrl.getText().toString().trim().length() == 0){

            Toast.makeText(this, "No has introducido Ninguna Url", Toast.LENGTH_SHORT).show();

        }else {

            String sUrlpasar = etUrl.getText().toString();

            Intent iresult = getIntent();

            iresult.putExtra("mensaje", sUrlpasar);

            setResult(2, iresult);

        }

    }
}
