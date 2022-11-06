package lat.pam.pizzarestaurant;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void kembali(View view) {
        Intent intent = new Intent(Activity_2.this, MainActivity.class);
        startActivity(intent);
    }

    public void tampilan_3(View view) {
        Intent intent = new Intent(Activity_2.this, Activity_3.class);
        startActivity(intent);
    }
}