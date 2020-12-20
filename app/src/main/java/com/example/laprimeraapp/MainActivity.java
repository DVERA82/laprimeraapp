package com.example.laprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int resultado = add("");
        Log.d("RESULTADO1", String.valueOf(resultado));

        resultado = add("3");
        Log.d("RESULTADO2", String.valueOf(resultado));


        resultado = add("3,5");
        Log.d("RESULTADO3", String.valueOf(resultado));

        TextView miTextView = findViewById(R.id.textViewMain);
        miTextView.setText( " EL RESULTADO ES: " + resultado);
    }
    private int add(String values) {
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() == 3) {
            String valuesArray[] = values.split( ",");
            int result = Integer.parseInt (valuesArray[0])+ Integer.parseInt(valuesArray[1]);
            return result;
        } else {
            return parseInt(values);
        }
    }
}


