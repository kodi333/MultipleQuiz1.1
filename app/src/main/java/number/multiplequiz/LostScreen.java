package number.multiplequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class LostScreen extends AppCompatActivity {

    private TextView iqLostText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent2 = getIntent();
        int mScore  = intent2.getIntExtra("M_SCORE",0); //access the variable
        setContentView(R.layout.activity_lost_screen);

        iqLostText = (TextView) findViewById(R.id.iqLostText);
        iqLostText.setText("Your math sequence iq was\n " + mScore + "\n Please try again!");

    }

}
