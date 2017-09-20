package com.pa.adrian.mfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView tvMensajeNombre;
    TextView tvMensajeApellido;
    TextView tvMensajeFecha;

    /*Se declaran los TextView.*/

    String nombre           = getResources().getString(R.string.nombreMensajeEnviado);
    String apellidos        = getResources().getString(R.string.apellidosMensajeEnviado);
    String añoNacimiento    = getResources().getString(R.string.añoMensajeEnviado);

    /*Se declaran e inician los string con el nombre, apellidos y año de nacimiento que se usarán en
      la segunda activity para dar una mayor información al usuario. Se usan para ellos los
      recursos strings almacenados previamente.*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle parametros       = getIntent().getExtras();
        String mensajeNombre    = parametros.getString("MensajeNombre");
        String mensajeApellido  = parametros.getString("MensajeApellido");
        String mensajeFecha     = parametros.getString("MensajeFecha");

        /* Aquí se capturan los parámetros de los mensajes pasados desde la actividad principal. */

        tvMensajeNombre     =(TextView) findViewById(R.id.tvMensajeNombre);
        tvMensajeApellido   =(TextView) findViewById(R.id.tvMensajeApellido);
        tvMensajeFecha      =(TextView) findViewById(R.id.tvMensajeFecha);

        /* Se almacenan en los TextView creados previamente buscando sus respectivos id que se les han
         asignado para que así resulte más fácil su personalización, ya que se puede hacer desde el
         visor de texto del layout activity_display_message. */

        tvMensajeNombre.setText(nombre + " " + mensajeNombre);
        tvMensajeApellido.setText(apellidos + " " + mensajeApellido);
        tvMensajeFecha.setText(añoNacimiento + " " + mensajeFecha);

        /* Por último se utilizan los setText en los que se introducen los String de los mensajes
         introducidos en la anterior activity para mostrarlo en ésta. */

    }
}
