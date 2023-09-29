import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        QuadraticEquationSolver quadraticSolver = new QuadraticEquationSolver();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        double a = input.nextInt();
        System.out.print("Enter the value for b: ");
        double b = input.nextInt();
        System.out.print("Enter the value for c: ");
        double c = input.nextInt();

        quadraticSolver.solve(a, b, c);

    }
}