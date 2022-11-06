package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Tampilan_2 (View view) {

//        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(MainActivity.this, Activity_2.class);
        startActivity(intent);
    }
}
