

import java.util.Scanner;
import java.lang.Math;

    public class Main {

        public static void main(String[] args) {

//        Generates a random number between 1-100
            int rNumber = (int)(Math.random() * 101);
            System.out.print("Guess My Number:");
            int Unumber = -1;

//        Asks for a guess, and states the placement relative to the random Number
            do
            {
                Scanner input = new Scanner(System.in);
                Unumber = input.nextInt();

                if(Unumber == rNumber){
                    System.out.println("Correct!");
                }
                else if(Unumber > rNumber)
                {
                    System.out.println("Too High");
                    System.out.print("Try Again:");
                }
                else
                {
                    System.out.println("Too Low");
                    System.out.print("Try Again:");
                }
            }while(Unumber != rNumber);

        }
    }
