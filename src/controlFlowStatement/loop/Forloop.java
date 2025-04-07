package controlFlowStatement.loop;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        System.out.print(" Insert number to sum : ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (i==n){
                System.out.print(i);
            }else {
                System.out.print(i+ " + ");
            }
        }
        System.out.println(" = " + sum);
    }
}
