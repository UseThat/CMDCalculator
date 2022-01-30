public class Calculator {
    double add(double a, double b){
        return a + b;
    }
    double add(double a, double b, double c){
        return add(a,b) + c;
    }

    double add(double a, double b, double c,double d) {
        return add(a, b, c) + d;
    }

    double subtract(double a, double b){
        return a - b;
    }
    double subtract(double a, double b, double c){
        return subtract(a,b) - c;
    }

    double subtract(double a, double b, double c,double d) {
        return subtract(a, b, c) - d;
    }
}
