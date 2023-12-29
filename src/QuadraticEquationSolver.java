public class QuadraticEquationSolver {
    private int a, b, c;

    public void setVariables(int coefficientA, int coefficientB, int coefficientC){
        a = coefficientA;
        b = coefficientB;
        c = coefficientC;
    }

    public void getResult() {
        int discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) { //the roots are not real
            System.out.println("Complex roots");
        } else if (discriminant > 0) {// the roots are two distinct values
            double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else { //one real root
            System.out.println("x = " + ((-b) / (2.0 * a)));
        }
    }

}
