package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText email = findViewById(R.id.etEmail), password = findViewById(R.id.etPassword);
        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            String e = email.getText().toString().trim();
            String p = password.getText().toString();
            if (e.isEmpty() || p.isEmpty()) { email.setError("Enter email and password"); return; }
            if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) { email.setError("Enter a valid email address"); return; }
            // Demo-only local authentication: use any valid email and a password of at least 4 characters.
            if (p.length() < 4) { password.setError("Password must be at least 4 characters"); return; }
            getSharedPreferences("CampusConnect", MODE_PRIVATE).edit().putString("email", e).putString("name", e.split("@")[0]).apply();
            startActivity(new Intent(this, DashboardActivity.class));
            finish();
        });
        findViewById(R.id.btnRegister).setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
        findViewById(R.id.btnForgot).setOnClickListener(v -> startActivity(new Intent(this, ForgotPasswordActivity.class)));
    }
}
