package com.kaming.intentdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle bundle =intent.getExtras();
        String name = bundle.getString("name");
//        bundle.putString("change","改左名!!!!!");
//        intent.putExtras(bundle);
//        SecondActivity.this.setResult(Activity.RESULT_OK,intent);
//        this.finish();

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText(name);

    }
}
