package com.pa.adrian.mfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.edit_message);
        String mensaje = textInputEditText.getText().toString();
        intent.putExtra("Mensaje", mensaje);
        startActivity(intent);

        /* En este método se envía el mensaje desde la actividad principal o MainActivity hasta
        la actividad DisplayMessageActivity. Para ello se utiliza un intent, que es un elemento
        que sirve para comunicar componentes dentro de un proyecto Android. Luego se
        busca el id que previamente se ha creado para el EditText ( o en este caso TextInputEditText ) */
    }
}
