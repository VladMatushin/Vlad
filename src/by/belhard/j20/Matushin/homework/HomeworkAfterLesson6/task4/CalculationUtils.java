package by.belhard.j20.Matushin.homework.HomeworkAfterLesson6.task4;

public class CalculationUtils {

    public double Area(Object object) {
        double pi = Math.PI;
        if (object instanceof Circle){
            double area;
            area = pi* Math.pow(((Circle) object).r,2);
            return area;
        }
        if (object instanceof Square){
            if (object instanceof Rectangle){
                double area;
                area = ((Rectangle) object).getSidelength()* ((Rectangle) object).getSide2length();
                return area;
            }
            else {
                double area;
                area = Math.pow(((Rectangle) object).getSidelength(),2);
                return area;
            }
        }
        return 0;
    }

    public double Perimeter(Object object){
        double pi = Math.PI;
        if (object instanceof Circle){
            double perimeter;
            perimeter = pi*((Circle) object).r*2;
            return perimeter;
        }
        if (object instanceof Square){
            if (object instanceof Rectangle){
                double perimeter;
                perimeter = ((Rectangle) object).getSidelength()*2 +  ((Rectangle) object).getSide2length()*2;
                return perimeter;
            }
            else {
                double perimeter;
                perimeter = ((Rectangle) object).getSidelength()*2;
                return perimeter;
            }
        }
        return 0;

    }
}
