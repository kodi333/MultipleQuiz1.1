package number.multiplequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EndScreen extends AppCompatActivity {

    private TextView iqTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int mScore  = intent.getIntExtra("M_SCORE",0); //access the variable
        setContentView(R.layout.activity_end_screen);

        iqTextView = (TextView) findViewById(R.id.iqText);
        iqTextView.setText("Your math sequence iq is\n " + mScore);
    }



   /* public void displayEndScreen() {
        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.imagePlace);
        mImageView.setImageResource(R.drawable.dice);
    }*/




}
