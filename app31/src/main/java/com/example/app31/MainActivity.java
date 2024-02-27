package com.example.app31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTextView;
    ImageButton ibCatsvil;
    /*
    1.создадим d для компонента
    2.связать нащу переменную
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTextView = findViewById(R.id.tvName);
        ibCatsvil = findViewById(R.id.imageButton);

    }

    public void clickClick(View view){
        tvTextView.setText("Catsvill");
    }
}