package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle(8.0,3.0,4.0);
        Circle c2 = new Circle(2.0,3.0,2.0);
        c1.diffCenterDrop(c2);
        c1.ifTouch(c2);
    }
}
class Circle{ // класс круга
    public double x;
    public double y;
    public double r;
    public void printCircle(){ // метод для вывода круга
        System.out.println("Окружность с центром"+x+";"+y+"и радиусом"+r);
    }
    public void moveCircle(double a, double b){ // метод для перемещения центра круга
        x=x+a;
        y=y+b;
    }
    public void zoomCircle(double k){ // было написано до меня я прочто перепечатал
        r=r*k;
    }
    public Circle(double a, double b,double x){ // конструктор
        this.x=a;
        this.y=b;
        r=x;
    }
    public double lengthCircle(){ // метод для вычисления длинны окружности
        double d = 2*Math.PI*r;
        return d;
    }
    public void moveCenter(){ // метод для установки рандомной точки центра круга
        x=(Math.random()*10);
        y=(Math.random()*10);
    }
    public double diffCenterDrop(Circle cr){ // метод для вычисления расстояния между двумя центрами окружностей
        double resX = this.x - cr.x;
        double resY = this.y - cr.y;
        double resD = (resX*resX)+(resY*resY);
        double sqrt = Math.sqrt(resD);
        System.out.println(sqrt);
        return sqrt;
    }
    public boolean ifTouch(Circle cr){ // метод, который проверяет, касаются ли окружности друг друга
        double d = diffCenterDrop(cr);
        boolean b;
        if((this.r+cr.r)>=d&&(this.r+d)>=cr.r&&(cr.r+d)>=this.r){
            b= true;
        }else b= false;
        System.out.println(b);
        System.out.println("Привет Дима");
        return b;



    }


}
