package task2;


import task2.figur.Circle;
import task2.figur.EquilateralTriangle;
import task2.figur.GeometricFigure;
import task2.figur.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricFigure> figures = new ArrayList<>();
        figures.add(new Circle(2));
        figures.add(new Rectangle(2, 3));
        figures.add(new EquilateralTriangle(5));
        figures.add(new Rectangle(4, 6));
        figures.add(new Circle(3));
        figures.add(new EquilateralTriangle(2));
        for (GeometricFigure geometricFigure : figures) {
            System.out.println(geometricFigure.calculatePerimeter());
        }
    }
}
