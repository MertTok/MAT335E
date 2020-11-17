package Homework1;
import java.util.Scanner;

public class TestClip {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Declarations
        Clip MG_clip = new Clip(20,13);
        char command;

        // Inform user about controls
        System.out.println("Enter f to fire, r to reload, q to quit...");

        // Run program until the user decides to quit
        while(true){
            command = input.next().charAt(0);

            if(command == 'f'){
                MG_clip.fire();
            }

            else if(command == 'r'){
                MG_clip.reload();
            }

            else if(command == 'q'){
                System.out.println("We live to fight another day...");
                break;
            }

            updateUI(MG_clip);
        }
    }

    // Updates UI that shows bullets
    public static void updateUI(Clip clip){
        for(int i = clip.getBulletsLeft(); i > 0; i--) { System.out.print("="); }
        System.out.print(" " + clip.getBulletsLeft() + "/" + clip.getBulletCapacity());
    }
}
