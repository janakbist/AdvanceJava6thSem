package np.edu.scst;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Random Number Game!");
        System.out.println("Please Enter Your Name : ");
        Scanner s = new Scanner(System.in); 
        String name = s.next();
        System.out.println("Hello " + name);
        System.out.println("Shall we Start the Game?");
        System.out.println("\t 1.Yes");
        System.out.println("\t 2.No");
        try{
        int yesNo = s.nextInt();
        while(yesNo != 1){
        System.out.println("Shall we Start the Game?");
        System.out.println("\t 1.Yes");
        System.out.println("\t 2.No");
         yesNo = s.nextInt();
        }
        int max =9;
        int min =0;
        Random random = new Random();
        int randomNum = random.nextInt(max+min)+min;
        System.out.println("Please Guess the Number");
        int guessNum =s.nextInt();
        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;
        while(!shouldFinish){
            timesTried++;
            if(timesTried<5) {
                if(guessNum ==randomNum){
                    hasWon=true;
                    shouldFinish =true;
                } 
                else if(guessNum > randomNum){
                System.out.println("Guess Lower " );
                guessNum =s.nextInt();  
                }
                else{
                    System.out.println("Guess Higher");
                    guessNum =s.nextInt();
                }
            }
            else{
                shouldFinish= true;
            }
        }
        if(hasWon) {
            System.out.println("Congratulation! You have guessed in your "+timesTried+"guess");
        }
        else{
            System.out.println("Game Over!");
            System.out.println("The number was : " +randomNum);
        } 

    }catch(Exception e){
        
            System.out.println("Please Enter Number Not character"+e);
            
    
    }
    }
    
}
