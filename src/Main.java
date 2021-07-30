import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static double func(int a, int b) {
        System.out.println("Func call");
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        double res = func(3,4);

        System.out.println("Hello world from IntelliJ IDE!" + res);

        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String word = "speaker";
        char studentFirstInitial = word.charAt(0);
        char studentLastInitial = word.charAt(1);

//        System.out.println("input a number between 1 and 10:  ");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        if(num < 5) {
//            System.out.println("small value ");
//        }
//        else {
//            System.out.println("big value ");
//        }

//        Scanner input = new Scanner(System.in);
//        String Question = "1+1 = ?";
//        String one = "one";
//        String two = "two";
//        String three = "three";
//
//        System.out.println(Question);
//        String userInput = input.next();
//        if(userInput.toLowerCase().equals(two)) {
//            System.out.println("Correct!!");
//        }
//        else {
//            System.out.println("Wrong!");
//        }

        Triangle tri = new Triangle(1.2, 2,3.6);
        System.out.println(tri.calc());
        System.out.println(Triangle.calcStatic(1.2, 2.3));
        System.out.println(Triangle.edgeCount);


    }
}
