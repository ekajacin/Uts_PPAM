package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void Tampilan_5(View view) {
        Intent intent = new Intent(Activity_4.this, Activity_5.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(Activity_4.this, Activity_3.class);
        startActivity(intent);
    }
}