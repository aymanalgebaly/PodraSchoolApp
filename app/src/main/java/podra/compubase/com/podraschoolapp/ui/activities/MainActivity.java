package podra.compubase.com.podraschoolapp.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import podra.compubase.com.podraschoolapp.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.enter_user_name)
    EditText enterUserName;
    @BindView(R.id.enter_password)
    EditText enterPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this,HomeActivity.class));
    }
}
