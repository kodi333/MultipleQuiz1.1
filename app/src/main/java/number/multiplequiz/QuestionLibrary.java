package number.multiplequiz;

public class QuestionLibrary {

    private String mQuestions [] = { // Sequences
            "Let's kick off.\n 1  2  0  3  -1  4  (__)",//-2 +- easy
            "Easy start.\n 1  2  4  16  32  64  (__)",//128 easy
            "Ave Cesar!\n I  V  X  L  C  D  (__)",//Roma m easy
            "Well, still easy.\n 1  4  9  16  25  36  49  64  (__)",//81 squares easy
            "Liked school?\n 1  3  5  7  11  13  (__)",//17 easy 1st numbers
            "A bit harder.\n 3  7  15  31  63  127  255  (__)",//511 2n+1 easy
            "The Golden sequence.\n 0  1  1  2  3  5  8  13  21  34  (__)  ",//55 medium or easy Fibonacci
            "What number goes next? \n 2  3  3  5  10  13  39  43  172  (__)",//177 medium
            "You have seen it before.\n 3  9  21  45  (__)  189",//93 2n+3 medium
            "I know you can do below.\n 200  100  50  25  13  6  (__)",//3 mod div 2 medium
            "Bip! I am hal 9000.\n 1  10  11  (__)  101  110  111",//digital 100 medium
            "Just math. 80  63  48  35  24  15  8  (__)",//3 root - 1 hard
            "And Now for Something Completely Different\n A  B  D  G  K  (__)",//P medium
            "Below riddle has 40ty years..\n 679   378   168   48   32   (__)",// 6 hard
            "You will not quess this one:)\n 3  10  29  84  (__)  734",//hard 2op 247 3*3+1 3*3*3+2 3*3*3*3+3
            "Bip! Bip!\n a  ab  aa  abb  aba  (__)  aaa",//digital ab hard
            "Try thinking different.. \n 1  2  4  8  16  77  145  668  1345  6677  13444  (__)"//55778 hard add reciprocal and sort
    };

    private String mChoices [][] = {
            {"-2","-3","5"},
            {"142","177","128"},
            {"IX","DD","M"},
            {"81","84","94"},
            {"11","17","19"},
            {"545","510","511"},
            {"55","93","88"},
            {"177","179","181"},
            {"88","93","94"},
            {"9","5","3"},
            {"101","111","100"},
            {"2","3","6"},
            {"N","S","P"},
            {"6","2","7"},
            {"289","247","242"},
            {"bbb","aab","baa"},
            {"55788","55748","55778"},
    };

    private String mCorrectAnswers[] = {"-2","128","M","81","17","511","55","177","93","3","100","3","P","6","247","aab","55778"};


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

