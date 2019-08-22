package com.example.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editDadosNum;
    private EditText editLadosNum;
    private TextView textSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDadosNum = findViewById(R.id.editDadosNum);
        editLadosNum = findViewById(R.id.editLadosNum);
        textSoma = findViewById(R.id.textSoma);
    }
    public void numLancamento(int result){
        int max = Integer.parseInt(editDadosNum.getText().toString());
        int soma = 0;
        for (int i = 1;i<= max;i++){

            soma = soma + resultDado(result);

        }

        textSoma.setText(soma + "/n");
    }

    public int resultDado(int x){
        int max = Integer.parseInt(editLadosNum.getText().toString());
        int min = 1;
        Random aleatorio = new Random();
        int result = aleatorio.nextInt((max - min) + 1) + min;
        return result;


    }
}
