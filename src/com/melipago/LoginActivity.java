package com.melipago;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        

        Button loginButton = (Button)findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {

          public void onClick(View view) {
        	  
        	//TODO: validar user/pwd llamando a la API de oauth  
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
          }

        });
      }
    
}
