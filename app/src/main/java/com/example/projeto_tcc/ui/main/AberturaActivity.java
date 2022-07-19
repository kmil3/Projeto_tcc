package com.example.projeto_tcc.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;

import com.example.projeto_tcc.MainActivity;
import com.example.projeto_tcc.R;

public class AberturaActivity extends AppCompatActivity implements Runnable {

    Thread thread;
    Handler handler;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);

        handler = new Handler();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        i = 1;

        try {
            while (i<100){
                Thread.sleep(15);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        i ++;
                    }
                });
            }


        }catch (Exception e){

        }

        startActivity(new Intent(this, MainActivity.class));
    }
}