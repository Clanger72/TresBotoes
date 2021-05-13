package com.example.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivit extends AppCompatActivity {
    private static final String TAG = "SecondActivit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.EXTRA_BUTTON_ID, R.id.button_text_um);
        String text = "";
        switch (id){
            case R.id.button_text_um:
            text = "Texto um pressionado!";
                break;
            case R.id.button_text_dois:
                text = "Texto dois pressionado!";
                break;
            case R.id.button_text_tres:
                text = "Texto tres pressionado!";
                break;
            default:
                text = "Erro! Isso não severia acontecer!";
                break;
        }

        TextView textView = findViewById(R.id.text_display);
        textView.setText(text);
        Log.d(TAG, "onCreate: Recebido id " + id);
    }
}