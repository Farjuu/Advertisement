package dev.farjana.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {

    ProgressBar progressBar;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progress);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(this,MainActivity.class);
            this.startActivity(intent);
            finish();
        },4000);
    }
}