package com.example.campusconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        String name=getSharedPreferences("CampusConnect",MODE_PRIVATE).getString("name","Student");
        ((TextView)findViewById(R.id.tvWelcome)).setText("Welcome, "+name+"!");
        findViewById(R.id.btnProfile).setOnClickListener(v -> startActivity(new Intent(this,ProfileActivity.class)));
        findViewById(R.id.btnLogout).setOnClickListener(v -> logout());
    }
    private void logout() {
        startActivity(new Intent(this,LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }
}
