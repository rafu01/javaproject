
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("LET'S PLAY ROCK PAPER SCISSOR\nWrite r for Rock\nWrite p for Paper\nWrite s for Scissor");
        System.out.println("Enter 0 to exit and 1 to restart the point table");
        int pointCount, playerPoint=0, pcPoint=0;
        while(sc.hasNext()){
            char input = sc.next().charAt(0);
            if(input == '1'){
                System.out.println("Point table cleared");
                playerPoint =0;
                pcPoint =0;
            }
            else if(input == '0'){
                break;
            }
            else if(input=='R' || input=='r'||input=='P'||input == 'p'||input=='S'||input=='s'){
                int rand = random.nextInt(3);
                if(rand ==0){
                    System.out.println("Computer: Rock");  
                }
                else if(rand ==1){
                    System.out.println("Computer: Paper");
                }
                else if(rand ==2){
                    System.out.println("Computer: Scissor");
                }
                Rock player = new Rock();
                player.playerInput(input);
                pointCount = player.function(input, rand);
                if(pointCount==1){
                    pcPoint++;
                }
                else if(pointCount ==2){
                    playerPoint++;
                }
                System.out.println("Your point "+playerPoint+"\nComputer Point "+pcPoint);
                
            }
            else 
                System.out.println("Invalid input");
        }
    }   
}
