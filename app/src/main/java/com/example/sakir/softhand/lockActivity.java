package com.example.sakir.softhand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class lockActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);
        button=findViewById(R.id.buttonid);
        editText=findViewById(R.id.codeid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code=editText.getText().toString();
                if(code.isEmpty()){
                    Toast.makeText(lockActivity.this, "Empty Code", Toast.LENGTH_LONG).show();
                } else if(code.equals("2019")){
                    Toast.makeText(lockActivity.this, "Welcome to Softhand", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(lockActivity.this,loginActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(lockActivity.this, "Wrong Code", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
