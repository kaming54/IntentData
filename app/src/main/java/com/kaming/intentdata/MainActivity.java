package com.kaming.intentdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","不太好~~~");
                bundle.putInt("id",123);
                bundle.putStringArray("arr", new String[]{"1", "2", "3"});
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
