package com.example.slaby.zajecia_1;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        // Do something in response to button
        TextView text = (TextView) findViewById(R.id.textView3);
        EditText in = (EditText) findViewById(R.id.Input_here);

        text.setText(in.getText());
    }

}
