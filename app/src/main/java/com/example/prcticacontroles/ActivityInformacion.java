package com.example.prcticacontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        TextView textInicio=(TextView) findViewById(R.id.txtInicio);
        Bundle bundle=this.getIntent().getExtras();

        if(bundle != null){
            textInicio.setText("Hola "+ bundle.getString("Nombres")+ " Esta es tu información: \n"+
                    "Cédula: "+bundle.getString("Cédula")+"\n"+
                    "Nombres: "+bundle.getString("Nombres")+"\n"+
                    "Fecha Nacimiento: "+bundle.getString("FechaNace")+"\n"+
                    "Género: "+bundle.getString("Género")+"\n"+
                    "Ciudad: "+bundle.getString("Ciudad")+"\n"+
                    "Correo o Email: "+bundle.getString("Correo")+"\n"+
                    "Teléfono: "+bundle.getString("Teléfono"));
        }
    }
}