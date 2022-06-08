package com.company;
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
class Circle{
    public double x;
    public double y;
    public double r;
    public void printCircle(){
        System.out.println("Окружность с центром"+x+";"+y+"и радиусом"+r);
    }
    public void moveCircle(double a, double b){
        x=x+a;
        y=y+b;
    }
    public void zoomCircle(double k){
        r=r*k;
    }
    public Circle(double a, double b,double x){
        this.x=a;
        this.y=b;
        r=x;
    }
    public double lengthCircle(){
        double d = 2*Math.PI*r;
        return d;
    }
    public void moveCenter(){
        x=(Math.random()*10);
        y=(Math.random()*10);
    }
    public double diffCenterDrop(Circle cr){
        double resX = this.x - cr.x;
        double resY = this.y - cr.y;
        double resD = (resX*resX)+(resY*resY);
        double sqrt = Math.sqrt(resD);
        System.out.println(sqrt);
        return sqrt;
    }
    public boolean ifTouch(Circle cr){
        double d = diffCenterDrop(cr);
        boolean b;
        if((this.r+cr.r)>=d&&(this.r+d)>=cr.r&&(cr.r+d)>=this.r){
            b= true;
        }else b= false;
        System.out.println(b);
        return b;

    }

}
