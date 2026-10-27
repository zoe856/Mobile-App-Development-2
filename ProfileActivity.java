package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String name=getSharedPreferences("CampusConnect",MODE_PRIVATE).getString("name","Student");
        String email=getSharedPreferences("CampusConnect",MODE_PRIVATE).getString("email","Not provided");
        ((TextView)findViewById(R.id.tvName)).setText("Name: "+name);
        ((TextView)findViewById(R.id.tvEmail)).setText("Email: "+email);
        findViewById(R.id.btnBackDashboard).setOnClickListener(v -> finish());
        findViewById(R.id.btnLogout).setOnClickListener(v -> {
            startActivity(new Intent(this,LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        });
    }
}
