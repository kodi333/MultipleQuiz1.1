package number.multiplequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LevelChoice extends AppCompatActivity {

    //private static final String TAG = "math Game" ;
    public static final String KEY_LEVEL = "multiplequiz.level";
    public static final int LEVEL_EASY = 0;
    public static final int LEVEL_MEDIUM = 1;
    public static final int LEVEL_HARD = 2;
    //private static final String TAG = "Choose game level" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_choice);
        openNewGameDialog();
    }

    private void openNewGameDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.screenTitle)
                .setItems(R.array.level,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface
                                                        dialoginterface, int i) {
                                startGame(i);
                            }
                        })
                .show();
    }

    private void startGame(int i) {
        Log.d("CHECK", "clicked on " + i);
        Intent intent = new Intent(LevelChoice.this, QuizActivity.class);
        intent.putExtra(LevelChoice.KEY_LEVEL, i);
        startActivity(intent);
    }


}
