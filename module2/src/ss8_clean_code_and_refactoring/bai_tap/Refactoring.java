package ss8_clean_code_and_refactoring.bai_tap;

public class Refactoring {
    public static String getScore(int scorepOfPlayer1, int scoreOfPlayer2) {
        StringBuilder score = new StringBuilder();
        final int NUMBER_OF_PLAYER = 2;
        int tempScore;
        if (scorepOfPlayer1 == scoreOfPlayer2) {
            switch (scorepOfPlayer1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
            }
        } else if (scorepOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            int minusResult = scorepOfPlayer1 - scoreOfPlayer2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i <= NUMBER_OF_PLAYER; i++) {
                if (i == 1) tempScore = scorepOfPlayer1;
                else {
                    score.append("-");
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }

    public static void main(String[] args) {
        System.out.println(getScore(3, 2));
    }
}

