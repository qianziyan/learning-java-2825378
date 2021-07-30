public class Triangle {
    static double edgeCount = 3;
    double sideOne;
    double sideTwo;
    double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne=sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double calc() {
        return this.sideThree + this.sideTwo;
    }

    public static double calcStatic(double sideOne, double sideThree) {
        return sideThree + sideOne;
    }
}