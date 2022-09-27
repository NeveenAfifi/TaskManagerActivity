package neveen.afifi.taskmanageractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity
{
    private TextInputEditText etEmailSU;
    private TextInputEditText etPasswordSU;
    private TextInputEditText etRePassword;
    private Button btnCancel;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etEmailSU=findViewById(R.id.etEmailSU);
        etPasswordSU=findViewById(R.id.etPasswordSU);
        etRePassword=findViewById(R.id.etRePassword);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}