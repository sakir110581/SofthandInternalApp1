package com.example.sakir.softhand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class homeActivity extends AppCompatActivity {
   // private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    //private Toolbar toolbar = findViewById(R.id.home_page_toolbar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


      // setSupportActionBar(toolbar);
       //getSupportActionBar().setTitle("Home page");

    }

   // @Override
   // protected void onStart() {
     //   super.onStart();
      //  FirebaseUser currentUser=mAuth.getCurrentUser();
     //   if(currentUser==null){
       //     Intent intent=new Intent(homeActivity.this,lockActivity.class);
         //   intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //    startActivity(intent);
         //   finish();
       // }
   // }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }
}
