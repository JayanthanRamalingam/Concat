package com.jayanthan.cat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button join=(Button)findViewById(R.id.join);
        join.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText fname=(EditText)findViewById(R.id.fname);
                EditText lname=(EditText)findViewById(R.id.lname);
                EditText funame=(EditText)findViewById(R.id.funame);
                String str=fname.getText().toString()+""+lname.getText().toString();
                funame.setText(str);
            }
        });
    }
}
