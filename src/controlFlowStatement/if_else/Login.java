package controlFlowStatement.if_else;

import java.util.Scanner;

public class Login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";
    public static void main(String[] args) {
        System.out.println("[+] Insert user name : ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("[+] Insert password : ");
        String password = sc.nextLine();
        if(userName.equals(USERNAME) && password.equals(PASSWORD)) {
            System.out.println("Login successful");
        }else {
            System.out.println("Login failed");
        }
    }
}

