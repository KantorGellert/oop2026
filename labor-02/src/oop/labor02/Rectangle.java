package oop.labor02;

public class Rectangle {

    private double width;
    private double lenght;

    public Rectangle(double l, double w){
        width = w;
        lenght = l;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth(){
        return width;
    }

    public double area(){
        return width*lenght;
    }

    public double perimeter(){
        return 2*(lenght+width);
    }
}
