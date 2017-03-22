package number.multiplequiz;

/**
 * Created by Ja on 2017-01-26.
 */

public class QuestionEasyLibrary {

    private String mQuestions [] = { // Sequences
            "Let's kick off.\n 1  2  0  3  -1  4  (__)",//-2 +- easy
            "Easy start.\n 2  4  8  16  32  64  (__)",//128 easy
            "Ave Cesar!\n I  V  X  L  C  D  (__)",//Roma m easy
            "Well, still easy.\n 1  4  9  16  25  36  49  64  (__)",//81 squares easy
            "Liked school?\n 2  3  5  7  11  13  (__)",//17 easy 1st numbers
            "A bit harder.\n 3  7  15  31  63  127  255  (__)",//511 2n+1 easy
    };

    private String mChoices [][] = {
            {"-2","-3","5"},
            {"142","177","128"},
            {"IX","DD","M"},
            {"81","84","94"},
            {"11","17","19"},
            {"545","510","511"},
    };

    private String mCorrectAnswers[] = {"-2","128","M","81","17","511"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public int getQuestionLength() {
        int lenght  = mQuestions.length;
        return lenght;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}