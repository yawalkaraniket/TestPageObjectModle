package com.android.testpageobjectmodle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        buttonSubmit = this.findViewById(R.id.btn_submit);

        buttonSubmit.setOnClickListener(v -> {
            DialogUtil.okDialog(this, "Sign-Up Success", "Successful!");
        });

    }
}
