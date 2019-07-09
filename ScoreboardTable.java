package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 * 
 * 2015
 */
public class ScoreboardTable {

    public static void main(String[] args) {
        int[][] scoreboardTable = new int[18][8];

        for (int i = 0; i < 18; i++) {
            scoreboardTable[i][0] = i; //takim
            scoreboardTable[i][1] = (int) (Math.random() * 35); //galibiyet
            scoreboardTable[i][3] = (int) (Math.random() * 35); //maglubiyet
            if ((scoreboardTable[i][1] + scoreboardTable[i][3]) > 35) {
                while ((scoreboardTable[i][1] + scoreboardTable[i][3]) > 35) {
                    scoreboardTable[i][1] = (int) (Math.random() * 35); //galibiyet
                    scoreboardTable[i][3] = (int) (Math.random() * 35); //maglubiyet
                }
            }

            scoreboardTable[i][2] = 34 - (scoreboardTable[i][1] + scoreboardTable[i][3]); //beraberlik

            scoreboardTable[i][4] = (int) (Math.random() * 101); //attigi gol
            scoreboardTable[i][5] = (int) (Math.random() * 101); //yedigi gol
            if (scoreboardTable[i][4] + scoreboardTable[i][5] > 101) {
                while (scoreboardTable[i][4] + scoreboardTable[i][5] < 101) {
                    scoreboardTable[i][4] = (int) (Math.random() * 101); //attigi gol
                    scoreboardTable[i][5] = (int) (Math.random() * 101); //yedigi gol
                }
            }
            scoreboardTable[i][6] = scoreboardTable[i][4] - scoreboardTable[i][5]; //avaraj
            scoreboardTable[i][7] = (scoreboardTable[i][1] * 3) + (scoreboardTable[i][2] * 1); //puan
            if(scoreboardTable[i][7]>scoreboardTable[i][4])
            {
                while (scoreboardTable[i][7]>scoreboardTable[i][4]) {
                    scoreboardTable[i][4] = (int) (Math.random() * 101); //attigi gol
                    scoreboardTable[i][5] = (int) (Math.random() * 101); //yedigi gol
                }
            }
            scoreboardTable[i][6] = scoreboardTable[i][4] - scoreboardTable[i][5]; //avaraj
        }

        int[] temp = new int[8];
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 17; j++) {
                if (scoreboardTable[j][7] > scoreboardTable[j + 1][7]) {
                    for (int k = 0; k < 8; k++) {
                        temp[k] = scoreboardTable[j][k];
                        scoreboardTable[j][k] = scoreboardTable[j + 1][k];
                        scoreboardTable[j + 1][k] = temp[k];
                    }
                }
            }
        }
        
        //0. Team
        //1. Win 
        //2. Draw
        //3. Lose
        //4. Goal
        //5. Give away a goal 
        //6. Goal difference 
        //7. Points

        System.out.println("T\t\tW\tD\tL\tGoal\tG-Goal\tGD\tP");
        for (int i = 17; 0 <= i; i--) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    System.out.print((scoreboardTable[i][j]+1)+ ".Team  \t");
                } else {
                    System.out.print(scoreboardTable[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
