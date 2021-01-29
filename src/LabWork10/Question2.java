package LabWork10;

public class Question2 {

    public static void main(String[] args) {
        int current_x = 0, current_y = 0;
        int[][] movementMatrix = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1}
        };

        System.out.println("Movement Matrix:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(movementMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < 5 * 5; i++){
            if(current_x < 4 && movementMatrix[current_y][current_x + 1] == 1){
                current_x += + 1;
                System.out.print("R");
            }
            else if( current_y < 4 && movementMatrix[current_y + 1][current_x] == 1){
                current_y += 1;
                System.out.print("D");
            }
        }
    }
}
