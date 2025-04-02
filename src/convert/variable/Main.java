package convert.variable;
class Coca{ }
enum Sting{
    RED,
    BLUE
}
public class Main {
    public static void main(String[] args) {
        // auto boxing
        int number = 12;
        Integer number2 = number;
        // unboxing
        Double double_ = 12.23;
        int a = double_.intValue();
    }
}
