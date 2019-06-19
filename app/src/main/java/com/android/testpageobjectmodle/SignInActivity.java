package com.android.testpageobjectmodle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    Button btnResetPassword, buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_activitty);

        btnResetPassword = this.findViewById(R.id.btn_reset_password);
        btnResetPassword.setOnClickListener(v -> {
            DialogUtil.okDialog(this, "Reset Password", "Reset password Successful!");
        });

        buttonSubmit = this.findViewById(R.id.btn_submit);
        buttonSubmit.setOnClickListener(v -> {
            DialogUtil.okDialog(this, "Success","Successful!");
        });
    }
}
