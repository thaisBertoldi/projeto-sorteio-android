package com.example.project_sort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortNumber(View view) {
        TextView result = findViewById(R.id.resultSort);
        int randomNumber = new Random().nextInt(11);
        result.setText("O número sorteado foi: " + randomNumber);
    }
}