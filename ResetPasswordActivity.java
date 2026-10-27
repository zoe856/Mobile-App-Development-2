package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        EditText p=findViewById(R.id.etPassword), c=findViewById(R.id.etConfirmPassword);
        findViewById(R.id.btnReset).setOnClickListener(v -> {
            String pass=p.getText().toString(), confirm=c.getText().toString();
            if(pass.length()<4){p.setError("Use at least 4 characters");return;}
            if(!pass.equals(confirm)){c.setError("Passwords do not match");return;}
            Toast.makeText(this,"Password reset simulated successfully.",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,LoginActivity.class)); finish();
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> startActivity(new Intent(this,LoginActivity.class)));
    }
}
