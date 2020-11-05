package com.example.appsend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.appSend.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        EditText editTextCorreo = (EditText) findViewById(R.id.editTextCorreo);
        EditText editTextAsunto = (EditText) findViewById(R.id.editTextAsunto);
        EditText editTextMensaje = (EditText) findViewById(R.id.editTextMensaje);

        String name = editTextName.getText().toString();
        String email = editTextCorreo.getText().toString();
        String asunto = editTextAsunto.getText().toString();
        String message = editTextMensaje.getText().toString();

        String fullMessage = "Nombre: "+ name+
                "\nCorreo: "+email+
                "\nAsunto: "+asunto+
                "\nMensaje: "+message;
        
        intent.putExtra(EXTRA_MESSAGE, fullMessage);
        startActivity(intent);
    }

    public void TextFieldClicked(View view){
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        EditText editTextCorreo = (EditText) findViewById(R.id.editTextCorreo);
        EditText editTextAsunto = (EditText) findViewById(R.id.editTextAsunto);
        EditText editTextMensaje = (EditText) findViewById(R.id.editTextMensaje);

        editTextName.setText("");
        editTextCorreo.setText("");
        editTextAsunto.setText("");
        editTextMensaje.setText("");
    }
}