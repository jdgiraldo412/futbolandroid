package com.example.futbol_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText jetcodigo,jetnombre,jetciudad;
    RadioButton jrbaficionado,jrbacenso,jrbprofesional;
    CheckBox jcbactivo;
    String codigo,nombre,ciudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ocultar la barra d titulo y asociar objetos java con xml
        jetciudad=findViewById(R.id.etciudad);
        jetnombre=findViewById(R.id.etnombre);
        jetcodigo=findViewById(R.id.etcodigo);
        jcbactivo=findViewById(R.id.cbactivo);
        jrbacenso=findViewById(R.id.rbacenso);
        jrbaficionado=findViewById(R.id.rbaficionado);
        jrbprofesional=findViewById(R.id.rbprofesional);
    }

    public void Adiccionar(View view){
        codigo=jetcodigo.getText().toString();
        nombre=jetnombre.getText().toString();
        ciudad=jetciudad.getText().toString();
    }
}