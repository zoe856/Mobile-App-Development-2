package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        EditText email=findViewById(R.id.etEmail);
        findViewById(R.id.btnContinue).setOnClickListener(v -> {
            String e=email.getText().toString().trim();
            if(!Patterns.EMAIL_ADDRESS.matcher(e).matches()){email.setError("Enter a valid email");return;}
            getSharedPreferences("CampusConnect",MODE_PRIVATE).edit().putString("email",e).apply();
            Toast.makeText(this,"Demo recovery started for "+e,Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,ResetPasswordActivity.class));
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> finish());
    }
}
