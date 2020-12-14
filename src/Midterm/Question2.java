////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Midterm;
import java.security.SecureRandom;

public class Question2 {
    private static final int radius = 2;
    private static int center_x = 9;
    private static int center_y = 12;
    private static final int area_x = 15;
    private static final int area_y = 15;
    private static final int stepSize = radius * 2;
    private static final int totalAttempts = 5000;

    public static void main(String[] args) {
        int numberOfHits = 0;

        for(int fireCount = 0; fireCount < totalAttempts; fireCount++)
        {

            float[] shotCoordinates = fire();

            if( checkForHit(shotCoordinates[0], shotCoordinates[1]) )
            {
                numberOfHits++;
            }

            moveTarget();
        }

        System.out.println("You hit the target " + numberOfHits + " times.");
        System.out.println("Estimated probability: " + (Math.PI * radius * radius / (area_x * area_y)) );
        System.out.println("Event probability: " + ((double) numberOfHits / totalAttempts));
    }


    public static float[] fire(){
        SecureRandom randomNumbers = new SecureRandom();
        float shot_x =  randomNumbers.nextFloat() * area_x;
        float shot_y = randomNumbers.nextFloat() * area_y;

        return new float[]{shot_x, shot_y};
    }


    public static boolean checkForHit(float shot_x, float shot_y){
        double relative_x = shot_x - center_x;
        double relative_y = shot_y - center_y;

        return relative_x * relative_x + relative_y * relative_y < radius * radius;
    }


    public static void moveTarget(){
        SecureRandom randomNumbers = new SecureRandom();
        int moveDirection;

        moveDirection = randomNumbers.nextInt(4) + 1;

        if(movementIsBlocked(moveDirection)) return;

        if( moveDirection == 1) center_x += stepSize;
        if( moveDirection == 2) center_x -= stepSize;
        if( moveDirection == 3) center_y += stepSize;
        if( moveDirection == 4) center_y -= stepSize;

    }


    public static boolean movementIsBlocked(int direction){
        // Radius + StepSize = radius * 3
        if(direction == 1) return area_x - center_x < radius + stepSize;
        if(direction == 2) return center_x < radius + stepSize;
        if(direction == 3) return area_y - center_y < radius + stepSize;
        if(direction == 4) return center_y < radius + stepSize;
        return false;
    }
}