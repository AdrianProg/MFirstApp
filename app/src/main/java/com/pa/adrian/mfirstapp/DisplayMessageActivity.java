package com.pa.adrian.mfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView tvMensajeRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle parametros = getIntent().getExtras();
        String mensaje = parametros.getString("Mensaje");

        tvMensajeRecibido=(TextView) findViewById(R.id.tvMensajeRecibido);

        tvMensajeRecibido.setText(mensaje);

        /* Aquí se captura el parámetro de mensaje pasado desde la actividad principal y se almacena
         en un TextView creado previamente buscando el id que se le ha asignado para que así resulte
         más fácil su personalización, ya que se puede hacer desde el visor de texto del layout
         activity_display_message. */

    }
}
