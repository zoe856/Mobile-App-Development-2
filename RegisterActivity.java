package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText name=findViewById(R.id.etName), email=findViewById(R.id.etEmail),
            password=findViewById(R.id.etPassword), confirm=findViewById(R.id.etConfirmPassword);
        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            String n=name.getText().toString().trim(), e=email.getText().toString().trim(),
                p=password.getText().toString(), c=confirm.getText().toString();
            if(n.isEmpty()){name.setError("Enter your name");return;}
            if(!Patterns.EMAIL_ADDRESS.matcher(e).matches()){email.setError("Enter a valid email");return;}
            if(p.length()<4){password.setError("Use at least 4 characters");return;}
            if(!p.equals(c)){confirm.setError("Passwords do not match");return;}
            getSharedPreferences("CampusConnect",MODE_PRIVATE).edit().putString("name",n).putString("email",e).apply();
            Toast.makeText(this,"Registration successful. Please log in.",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,LoginActivity.class)); finish();
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> finish());
    }
}
