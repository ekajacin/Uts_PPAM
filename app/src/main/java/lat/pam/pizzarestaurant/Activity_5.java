package lat.pam.pizzarestaurant;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Activity_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void order_massage1(View view) {
        Toast toast = Toast.makeText(this, "Terima kasih Eka sudah memesan  ditoko kami, pesanan Pepperoni Pizza  anda dikirim menggunakan Fast Delivery", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }


}