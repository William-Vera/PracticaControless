package com.example.prcticacontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText edtCedula;
    EditText edtNombres;
    EditText edtFechaNace;
    EditText edtCiudad;
    RadioButton edbMasc;
    //RadioButton edbFem=(RadioButton) findViewById(R.id.rdbFemenino);
    EditText edtCorreo;
    EditText edtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        edtCedula=(EditText)findViewById(R.id.edtCedula);
        edtNombres=(EditText)findViewById(R.id.edtNombres);
        edtFechaNace=(EditText)findViewById(R.id.edtFechaNace);
        edtCiudad=(EditText)findViewById(R.id.edtCiudad);
        edbMasc=(RadioButton) findViewById(R.id.rdbMasculino);
        edtCorreo=(EditText)findViewById(R.id.edtCorreo);
        edtTelefono=(EditText)findViewById(R.id.edtTelefono);

        String Cedula=edtCedula.getText().toString();
        String Nombres=edtNombres.getText().toString();
        String FechaNace=edtFechaNace.getText().toString();
        String Genero=edbMasc.isChecked()?"Masculino":"Femenino";
        String Ciudad=edtCiudad.getText().toString();
        String Email=edtCorreo.getText().toString();
        String Telefono=edtTelefono.getText().toString();

        Intent intent=new Intent(MainActivity.this, ActivityInformacion.class);
        Bundle bundle=new Bundle();
        bundle.putString("Cédula", Cedula);
        bundle.putString("Nombres", Nombres);
        bundle.putString("FechaNace", FechaNace);
        bundle.putString("Género", Genero);
        bundle.putString("Ciudad", Ciudad);
        bundle.putString("Correo", Email);
        bundle.putString("Teléfono", Telefono);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void btnLimpiar(View view)
    {
        edtCedula=(EditText)findViewById(R.id.edtCedula);
        edtNombres=(EditText)findViewById(R.id.edtNombres);
        edtFechaNace=(EditText)findViewById(R.id.edtFechaNace);
        edtCiudad=(EditText)findViewById(R.id.edtCiudad);
        edbMasc=(RadioButton) findViewById(R.id.rdbMasculino);
        edtCorreo=(EditText)findViewById(R.id.edtCorreo);
        edtTelefono=(EditText)findViewById(R.id.edtTelefono);

        edtCedula.setText("");
        edtNombres.setText("");
        edtFechaNace.setText("");
        edtCiudad.setText("");
        edbMasc.setChecked(false);
        edtCorreo.setText("");
        edtTelefono.setText("");
    }
}