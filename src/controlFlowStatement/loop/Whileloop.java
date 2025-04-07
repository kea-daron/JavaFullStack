package controlFlowStatement.loop;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) throws InterruptedException {
        String name = null;
        while (true){
            System.out.print("Insert Name : ");
            name = new Scanner(System.in).nextLine();
            if(!name.isBlank()){
                break;
            }
        }
        System.out.println(name);
    }
}
