/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond_stars;

import java.util.Scanner;
/**
 *
 * @author pkontekas
 */
public class Diamond_stars {
    
    static void printDiamond(int side)
    {
        int topHalfRows=side;
        int bottomHalfRows = topHalfRows - 1;
        int starPosition = topHalfRows;
        int numStars = -1;

        for (int i = 0; i < topHalfRows; i++) 
        {
            numStars = numStars + 2;
            starPosition = starPosition - 1;

            for (int j = 0; j < starPosition; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < numStars; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < bottomHalfRows; i++) 
        {
            numStars = numStars - 2;
            starPosition = starPosition + 1;

            for (int j = 0; j < starPosition; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < numStars; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) 
    {
        // diamond stars algorithm with position and scanner for whatever Diamond Size we want
        Scanner scan = new Scanner(System.in);
        System.out.println("Give us the Diamond's Side Size you want : ");
        int side = scan.nextInt();
        printDiamond(side);
    }
}