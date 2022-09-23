package com.company.egg_moim2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이미지 버튼 클릭시 액티비티 전환
        ImageButton moim_plus = findViewById(R.id.moim_plus);
        moim_plus.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MoimAddActivity.class);
            startActivity(intent);
        });
    }
}
