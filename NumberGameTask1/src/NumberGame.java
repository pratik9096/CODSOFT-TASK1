import java.util.Scanner;

public class NumberGame {
   
    public static void main(String args[])  {
      Scanner sc = new Scanner (System.in);
      int chances=6;
      int finals=0;
      boolean playAgain=true;
      System.out.println("Wlecome Buddy! ");
      System.out.println("Hey Buddy you have about "+chances +" chances to win game");
      while (playAgain) {
        int rand=getrandN(1,100);
        boolean guess =false;
        for (int i=0;i<chances;i++){

        
        
        System.out.println("chance" + (i+1)+" Enter your guess :");
      int user =sc.nextInt();
      if( user==rand){
        guess=true;
        finals+=1;
        System.out.println("You Won it. ");
        break;
      }
      else if (user >rand ){
        System.out.println("Too High");

      }
     else {
        System.out.println("Too Low");
     }
    }
     if (guess==false){

        System.out.println("Sorry Buddy You Lost Chances . The Number is " +rand);
     }
     System.out.println("Do you want to play again(Yes/No)");
     String pA=sc.next();
     playAgain=pA.equalsIgnoreCase("y");
    }
    System.out.println("That it Buddy , Hope you enjoyed it");
    System.out.println(" Here is your Score " + finals);


    
}
     public static int getrandN(int min,int max){
        return(int)(Math.random()*( max-min+1)+min);

     } 
    }


