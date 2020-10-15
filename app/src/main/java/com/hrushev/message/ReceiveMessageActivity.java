package com.hrushev.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        String message = getIntent().getStringExtra("messageKey");
        messageTextView = findViewById(R.id.tvMessage);
        messageTextView.setText(message);
    }
}