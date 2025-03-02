package com.huyhoang.saleappproject_1;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DangNhap extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvRegister = findViewById(R.id.tvRegister);


        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to RegisterActivity
                Intent intent = new Intent(DangNhap.this, DangKy.class);
                startActivity(intent);
            }

            // Xử lý sự kiện đăng nhập
            // btnLogin.setOnClickListener(v -> {
            //   String email = etEmail.getText().toString().trim();
            // String password = etPassword.getText().toString().trim();

//            if (validateInput(email, password)) {
            // Kiểm tra đăng nhập (ví dụ: kiểm tra với Firebase hoặc API)
            //              if (email.equals("user@example.com") && password.equals("123456"))
            //        }
            //  });
        });
    }

}