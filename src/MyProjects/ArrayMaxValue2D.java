package MyProjects;

import java.util.Scanner;

public class ArrayMaxValue2D {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: ");

    
    int[][] temp = new int[input.nextInt()][input.nextInt()];

    
    System.out.println("Enter the array: ");
    for(int i=0; i < temp.length; i++) {
        for(int j=0; j < temp[0].length; j++) {
            temp[i][j] = input.nextInt();
            
        }
        
    }
    input.close();

    
    Position pos = Position.findLargest(temp); //new position object equal to next class method findLargest             

    System.out.println("The position of the largest element is " + pos.maxValue + " at (" + pos.row + ", " + pos.column + ")");



    }
}

class Position {
    public int row=0, column=0;
    public int maxValue = 0;
    
   //Accessed from main class
    public static Position findLargest(int[][] a) {
        	Position pos = new Position();        
        pos.maxValue=a[0][0];

            for(int i = 0; i < a.length; i++) {
                for(int j=0; j < a[i].length; j++) {
                    if(a[i][j] > pos.maxValue) {
                        pos.maxValue = a[i][j];
                        pos.row = i;
                        pos.column = j;
                    }
                }

            }

            return pos;
       }
}
