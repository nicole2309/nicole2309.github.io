import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	// creamos una instancia en clase Scanner //
        Scanner input = new Scanner(System.in);
    	// llamada input //
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // usamos input para leer un entero//
        System.out.println("You entered " + number);

        // closing the scanner object //
        input.close();
    }
}