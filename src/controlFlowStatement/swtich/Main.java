package controlFlowStatement.swtich;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("បញ្ចូលលេខទី១ : ");
        int លេខទី១ = new Scanner(System.in).nextInt();
        System.out.print("បញ្ចូលលេខទី២ : ");
        int លេខទី២ = new Scanner(System.in).nextInt();
        System.out.println("=" .repeat(20));
        System.out.println("""
                1. បូកលេខ
                2. ដកលេខ
                3. រកលេខដែលធំជាង
                4. ផ្លាសប្តូរលេខ
                5. ចាកចេញ
                """);
        System.out.println("=" .repeat(20));
        System.out.print("បញ្ចូលជម្រើស : ");
        int ជម្រើស = new Scanner(System.in).nextInt();
        switch (ជម្រើស){
            case 1->{
                int បូក = លេខទី១ + លេខទី២;
                System.out.println("តម្លៃសរុប : "+បូក);
                break;
            }
            case 2->{
                int ដក = លេខទី១ - លេខទី២;
                System.out.println("តម្លៃសរុប : "+ដក);
                break;
            }
            case 3->{
                if (លេខទី១ > លេខទី២){
                    System.out.println("លេខទី១ធំជាងលេខទិ២");
                }else {
                    System.out.println("លេខទី២ធំជាងលេខទិ១");
                }
            }
            case 4->{
                int លេខជំនួស;
                លេខជំនួស = លេខទី១;
                លេខទី១ = លេខទី២;
                លេខទី២ = លេខជំនួស;
                System.out.println("លេខទី១ = " + លេខទី១);
                System.out.println("លេខទី១ = " + លេខទី២);
            }
            case 5->{
                return;
            }
        }
    }
}
