package com.ws1;

import java.util.Scanner;

public class MaxLocation {
    int row;
    int column;
    double maxValue;

    public MaxLocation findLocation(double[][] myArray){
        //MaxLocation locationData = new MaxLocation();
        this.maxValue = myArray[0][0];

        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                if(myArray[i][j] > this.maxValue){
                    this.maxValue = myArray[i][j];
                    this.row = i;
                    this.column = j;
                }
            }
        }

        return this;

    }

    public static void main(String[] args) {
        double [][] dataArray;
        MaxLocation maxLoc = new MaxLocation();

        System.out.print("Enter the number of rows and columns in the array(separate by a space): ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String[] numString = userInput.split(" ");
        int rows = Integer.parseInt(numString[0]);
        int columns = Integer.parseInt(numString[1]);
        dataArray = new double[rows][columns];
        System.out.println();
        System.out.println();

        System.out.println("Enter the array:");
        for(int i = 0; i < rows; i++){
            System.out.println("Row " + i + ":");
            for(int j = 0; j < columns; j++){
                System.out.print("Enter value at "+ j + ": ");
                double arrayValue = input.nextDouble();
                dataArray[i][j] = arrayValue;
            }
        }

        maxLoc = maxLoc.findLocation(dataArray);
        System.out.println();

        System.out.println("The location of the largest element is "+ maxLoc.maxValue + " at (" + maxLoc.row + "," + maxLoc.column + ")");

        input.close();

    }
}
