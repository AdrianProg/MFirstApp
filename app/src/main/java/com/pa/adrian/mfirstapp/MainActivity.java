package com.pa.adrian.mfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        /*En este método se envía el mensaje desde la actividad principal o MainActivity hasta
        la actividad DisplayMessageActivity. Para ello se utiliza un intent, que es el elemento
        que comunica los componentes dentro del proyecto Android*/

        TextInputEditText textInputEditTextNombre           = (TextInputEditText) findViewById(R.id.edit_message_nombre);
        TextInputEditText textInputEditTextApellidos        = (TextInputEditText) findViewById(R.id.edit_message_apellido);
        TextInputEditText textInputEditTextFechaNacimiento  = (TextInputEditText) findViewById(R.id.edit_message_añoNacimiento);


        /*Luego se buscan el los id que previamente se han creado para el EditText (o en este caso
        TextInputEditText)*/

        String mensajeNombre       = textInputEditTextNombre.getText().toString();
        String mensajeApellido     = textInputEditTextApellidos.getText().toString();
        String mensajeFecha        = textInputEditTextFechaNacimiento.getText().toString();
        intent.putExtra("MensajeNombre", mensajeNombre);
        intent.putExtra("MensajeApellido", mensajeApellido);
        intent.putExtra("MensajeFecha", mensajeFecha);


        /*Por último se crean varios String en los que se almacenan los contenido de los mensajes
         que se van a introducir para luego mandarlos a la segunda activity mediante el .putExtra*/

        startActivity(intent);

        /* Aquí finalmente se inicia la actividad.*/
    }
}
