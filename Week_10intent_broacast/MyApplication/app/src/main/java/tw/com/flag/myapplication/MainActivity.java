package tw.com.flag.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button myButton = null;
    private final String nobody ="Who.care.the.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button)findViewById(R.id.myButton);

        myButton.setOnClickListener(new MyButtonListener());

    }
    class MyButtonListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(nobody);
            intent.putExtra("testIntent", "6666666");
            sendBroadcast(intent);
        }
    }

}
