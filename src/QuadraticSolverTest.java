import java.util.Scanner;

public class QuadraticSolverTest {
    public static void main(String[] args) {
    
        System.out.print("Hello and welcome!");
        QuadraticSolver quadraticSolver = new QuadraticSolver();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = input.nextInt();
        System.out.print("Enter the value for b: ");
        int b = input.nextInt();
        System.out.print("Enter the value for c: ");
        int c = input.nextInt();

        quadraticSolver.solve(a, b, c);

    }
}
