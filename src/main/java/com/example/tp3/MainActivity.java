package com.example.tp3;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;  // Ajout de l'import pour EditText
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        Context context = getApplicationContext();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        String text = "Votre message est : " + message;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
