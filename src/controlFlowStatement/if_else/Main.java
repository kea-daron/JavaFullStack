package controlFlowStatement.if_else;

public class Main {
    public static void main(String[] args) {
        String name = "koko";
        if(name == "kaka"){
            System.out.println("You have been allowed");
        } else if (name.equalsIgnoreCase("koko")) {
            System.out.println("This is koko");
        } else {
            System.out.println("This is not a user");
        }
    }
}
