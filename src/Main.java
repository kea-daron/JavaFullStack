import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.printf("%f", Math.PI);
        Scanner sc = new Scanner(System.in);
        System.out.print("[+] insert name : ");
        String name = sc.nextLine();
        System.out.print("[+] insert age : ");
        int age = sc.nextInt();
        System.out.print("[+] insert gender : ");
        char gender = sc.next().charAt(0);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}