package net.projecteuler.problem1;

public class Equation {
    private int firstNumber;
    private int secondNumber;
    private int initialNumber = 0;
    private int maxNumber = 100;
    private int sum;

    //getters and setters
    public int getFirstNumber() {return firstNumber;}
    public void setFirstNumber(int firstNumber) {this.firstNumber = firstNumber;}
    public int getSecondNumber() {return secondNumber;}
    public void setSecondNumber(int secondNumber) {this.secondNumber = secondNumber;}
    public int getInitialNumber() {return initialNumber;}
    public void setInitialNumber(int initialNumber) {this.initialNumber = initialNumber;}
    public int getMaxNumber() {return maxNumber;}
    public void setMaxNumber(int maxNumber) {this.maxNumber = maxNumber;}
    public int getSum() {return  sum;}

    //constructors
    public Equation() {}

    public Equation(int initialNumber, int maxNumber) {
        this.initialNumber = initialNumber;
        this.maxNumber = maxNumber;
    }

    //methods
    public void execute(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        execute();
    }

    public void execute() {
        for (int i=initialNumber; i<=maxNumber; i++) {
            if (i%firstNumber == 0 && !(i%secondNumber == 0)) {
                sum+= i;
            }
            else if (i%secondNumber == 0 && !(i%firstNumber == 0)) {
                sum+= i;
            }
            else if (i%firstNumber == 0 & i%secondNumber == 0) {
                sum+= i;
            }
        }
        System.out.println("Suma liczb podzielnych przez " + firstNumber + " i " + secondNumber + ": " + sum);
    }

}
