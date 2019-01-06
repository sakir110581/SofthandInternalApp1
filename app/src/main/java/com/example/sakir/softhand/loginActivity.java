package com.example.sakir.softhand;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity extends AppCompatActivity {
private EditText email,password;
private Button button;
FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth=FirebaseAuth.getInstance();
        button=findViewById(R.id.loginbuttonid);
        email=findViewById(R.id.loginemailid);
        password=findViewById(R.id.loginpasswordid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //---------------------------Firebase using login.
                if(email.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Input correctly email and password.", Toast.LENGTH_SHORT).show();
                }else if(!email.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()){
                    try {
                         mAuth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                           if(task.isSuccessful()){
                             Intent intent=new Intent(getApplicationContext(),homeActivity.class);
                             startActivity(intent);
                             finish();
                        }else{
                          String errorNotice=task.getException().getMessage();
                          Toast.makeText(getApplicationContext(), "Error+ "+errorNotice, Toast.LENGTH_SHORT).show();
                        }
                        }
                          });
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Error+ "+e, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Login system error", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
