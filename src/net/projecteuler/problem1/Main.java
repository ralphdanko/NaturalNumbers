package net.projecteuler.problem1;

public class Main {

    public static void main(String[] args) {

        Equation[] equations = new Equation[2];
        equations[0] = new Equation(0, 9);
        equations[1] = new Equation(0, 999);

        for(Equation equation: equations) {
            System.out.println("Zakres liczb: " + equation.getInitialNumber() + " - " + equation.getMaxNumber() );
            equation.execute(3,5);
            System.out.println("-------------------------");
        }
    }
}