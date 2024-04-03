public class MainChallenge {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//       calculateFinalScore(true,800,5,100);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        calculateFinalScore(true,10000,8,200);
//    }
//    public static void calculateFinalScore(boolean gameStatus,int sc, int level, int bns){
//       boolean gameOver=gameStatus;
//       int score=sc;
//       int finalScore=score;
//       int bonus=bns;
//       int levelCompleted=level;
//       if(gameOver){
//           finalScore+=(levelCompleted*bonus);
//           System.out.println("your final score is " + finalScore);
//
//       }
        String player="mani";
        int pos=calculateHighScorePosition(1500);
        displayHighScorePosition(player,pos);
        pos=calculateHighScorePosition(1000);
        displayHighScorePosition(player,pos);
         pos=calculateHighScorePosition(500);
        displayHighScorePosition(player,pos);
         pos=calculateHighScorePosition(100);
        displayHighScorePosition(player,pos);
         pos=calculateHighScorePosition(25);
        displayHighScorePosition(player,calculateHighScorePosition(25));

   }
   public static void displayHighScorePosition(String player, int position){
        System.out.println(player + "managed to get into position " + position + "on high score list");
   }

   public static int calculateHighScorePosition( int score){
        int result;
        if(score >= 1000){
            result=1;
       }
        else if(score >500 && score < 1000){
            result=2;
       }
        else if(score>=100 && score<500){
            result=3;

       }
        else{
            result= 4;

       }
        return result;
   }



}
