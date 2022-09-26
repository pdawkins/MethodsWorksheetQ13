import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int sides = input.nextInt();
        printMatrix(sides);
    }

    public static void printMatrix(int sides){
        Random rand = new Random();

        for (int i =1; i<=sides; i++){
            for(int j=1; j<=sides; j++){
                System.out.print(rand.nextInt(2)+"\t");
            }
            System.out.println();
        }
    }
}