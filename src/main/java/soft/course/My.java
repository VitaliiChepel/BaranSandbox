package soft.course;

public class My {

    public static void main(String[] args) {
        hello("World");
        hello("Alexei");
        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " равняется " + area(l));

        double rec = 7;
        double rectwo = 9;
        System.out.println("Площадь прямоугольника со сторонами " + rec + " и " +  rectwo +  " равняется " + area(rec,rectwo));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double lenka) {
        return lenka * lenka;
    }

    public static double area(double rec, double rectwo) {
        return rec * rectwo;
    }

}