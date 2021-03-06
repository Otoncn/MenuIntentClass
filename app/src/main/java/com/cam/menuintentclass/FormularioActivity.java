package com.cam.menuintentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        String valor=getIntent().getStringExtra("Datos");
        TextView tvTexto= (TextView) findViewById(R.id.tvTexto);
        tvTexto.setText(valor);
    }
    public  void onClick(View view)
    {
        EditText tvMensaje =  (EditText) findViewById(R.id.etMensaje);
        Intent i = new Intent();
        i.putExtra("Datos",tvMensaje.getText().toString());
        setResult(RESULT_OK,i);
        finish();
    }
}