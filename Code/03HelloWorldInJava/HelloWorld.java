public class HelloWorld {
    public static void main(String[] args) {
        int number1;
        int number2;
        int multiplication;
        //code to read from keyboard
        number1=27;
        number2=35;
        multiplication = multiplicationTwoNumbers(number1, number2);
        System.out.println("Hello World from Mateo Castillo");
        System.out.println("The multiplication of "+ number1+" and "+number2+" is "+ multiplication);
    }
    public static int multiplicationTwoNumbers(int multiplication1, int multiplication2){
        int total=0;
        total= multiplication1*multiplication2;
        return total;
    }
}
