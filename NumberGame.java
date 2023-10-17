import java.util.Scanner;
public class NumberGame{
public static void  main(String[] args){
Scanner kb=new Scanner(System.in);
int chances=8;
int finals=0;
boolean playAgain=true;
System.out.println(" Welcome buddy...");
System.out.println(" Hey buddy you have about "+chances+" chances to win the game.");
while(playAgain){
    int random=getrandNo(1,100);
    boolean guess=false;
    for(int i=0;i<chances;i++){
        System.out.println("Chance "+(i+1)+" Enter youe guess. ");
        int user=kb.nextInt();
        if (user==random){
            guess=true;
            finals+=1;
            System.out.println(" You won buddy...." );
            break;
        }
        else if(user>random){
            System.out.println(" Too high...");
        }
        else{
            System.out.println("Too low...");
        }
    }
    if(guess==false){
        System.out.println(" Sorry buddy, You have lost the chances. The number is "+random);
    }
    System.out.println(" Do you wanna play again (yes/no)...");
    String pAgain=kb.next();
    playAgain=pAgain.equalsIgnoreCase("yes");

}
System.out.println("  Buddy, I hope you enjoyed it.");
System.out.println("Your score is:"+finals);
}
public static int getrandNo(int min,int max){
    return (int)(Math.random()*(max-min+1)+min);
}
} 