package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figures[] figures = {
                new Triangle("Red",10, 10, 10 ),
                new Triangle("Green",10, 20, 30 ),
                new Triangle("Red",10, 20, 15),
                new Rectangle("Red",5, 10),
                new Rectangle("Orange",40, 15),
                new Circle("Red",4),
                new Circle("Red",10),
                new Circle("Blue",5)
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figures[] figures){
        double summ = 0;
        for (int i = 0; i < figures.length ; i++) {
            if (figures[i].getColor().equals("Red")){
                summ = summ + figures[i].perimeter();
            }
        }
        return summ;
    }

    public static double calculateRedArea(Figures[] figures){
        double summ = 0;
        for (int i = 0; i < figures.length ; i++) {
            if (figures[i].getColor().equals("Red")){
                summ = summ + figures[i].area();
            }
        }
        return summ;
    }
}
