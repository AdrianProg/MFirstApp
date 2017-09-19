package com.pa.adrian.mfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView tvMensajeNombre;
    TextView tvMensajeApellido;
    TextView tvMensajeFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle parametros       = getIntent().getExtras();
        String mensajeNombre    = parametros.getString("MensajeNombre");
        String mensajeApellido  = parametros.getString("MensajeApellido");
        String mensajeFecha     = parametros.getString("MensajeFecha");

        /* Aquí se capturan los parámetros de los mensajes pasados desde la actividad principal. */

        tvMensajeNombre=(TextView) findViewById(R.id.tvMensajeNombre);
        tvMensajeApellido=(TextView) findViewById(R.id.tvMensajeApellido);
        tvMensajeFecha=(TextView) findViewById(R.id.tvMensajeFecha);

        /* Se almacena en los TextView creados previamente buscando sus respectivos id que se les han
         asignado para que así resulte más fácil su personalización, ya que se puede hacer desde el
         visor de texto del layout activity_display_message. */

        tvMensajeNombre.setText("Nombre: " + mensajeNombre);
        tvMensajeApellido.setText("Apellidos: " + mensajeApellido);
        tvMensajeFecha.setText("Año de nacimiento: "  + mensajeFecha);

        /* Por último se utilizan los setText en los que se introducen los String de los mensajes
         introducidos en la anterior activity para mostrarlo en ésta. */

    }
}
