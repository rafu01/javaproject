
public class Rock {
    private int player =0;
    private int pc =0;
    public int function(char input, int random){
        if((input=='r'||input =='R')){
            if(random == 0){
                System.out.println("Draw");
                return 0;
            }
            else if(random ==1){
                System.out.println("Paper beat Rock\nYou lost");
                return 1;
            }
            else {
                System.out.println("Rock beat Scissor\nYou won!");
                return 2;
            }
        }
        if((input=='p'||input =='P')){
            if(random == 0){
                System.out.println("Paper beat Scissor\nYou won");
                return 2;
            }
            else if(random ==1){
                System.out.println("Draw");
                return 0;
            }
            else {
                System.out.println("Scissor beat Paper\nYou lost");
                return 1;
            }
        }
        if((input=='s'||input =='S')){
            if(random == 1){
                System.out.println("Scissor beat Paper\nYou won");
                return 2;
            }
            else if(random ==2){
                System.out.println("Draw");
                return 0;
            }
            else {
                System.out.println("Rock beat Scissor\nYou lost");
                return 1;
            }
        }
        return 4;
   }
    public void playerInput(char input){
        if(input=='r'||input =='R'){
            System.out.println("You: Rock");
        }
        else if(input=='p'||input =='P'){
            System.out.println("You: Paper");
        }
        else System.out.println("You: Scissor");
    }
}
