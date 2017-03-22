package number.multiplequiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    Intent intent = getIntent();
    int i  = intent.getIntExtra(LevelChoice.KEY_LEVEL,0);

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mIncorrectScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    final Handler handler = new Handler();

    private String mAnswer;
    private int mScore = 80;
    private int mIncorrect = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mIncorrectScoreView = (TextView) findViewById(R.id.incorrect);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();


        //Start of button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 5;
                    updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    mIncorrect = mIncorrect + 1;
                    updateIncorrect(mIncorrect);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 5;
                    updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    mIncorrect = mIncorrect + 1;
                    updateIncorrect(mIncorrect);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 5;
                    updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    mIncorrect = mIncorrect + 1;
                    updateIncorrect(mIncorrect);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    private void updateIncorrect(int point) {
        mIncorrectScoreView.setText("" + mIncorrect);
    }



        private void updateQuestion () {
            switch (i){
                case 0:
        if (mIncorrect >= 4) { // How many mistakes possible

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after delay
                    displayLostScreen();
                }
            }, 2000);

        } else {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after delay


                    if (mQuestionNumber < mQuestionLibrary.getQuestionLength()) {
                        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
                        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

                        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);


                        //Log.d("CHECK", String.valueOf(mScore));
                        //Log.d("CHECK", String.valueOf(mQuestionLibrary.getQuestionLength()));
                        mQuestionNumber++;

                    } else { //otherwise display end screen
                        displayEndScreen();
                    }

                }
            }, 2000); //Do something after
        }
                    break;
        }
    }


    private void displayEndScreen() {
        Intent intent = new Intent(this, EndScreen.class);
        intent.putExtra("M_SCORE",mScore);
        startActivity(intent);
    }

    private void displayLostScreen() {
        Intent intent2 = new Intent(this, LostScreen.class);
        intent2.putExtra("M_SCORE",mScore);
        startActivity(intent2);
    }


}
