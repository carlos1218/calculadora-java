/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author USER
 */
public class calculadora {
    
    public double a, b, res, angle;
    
    public double suma(){
        return a+b;
    }
    public double resta(){
        return a-b;
    }
    public double mult(){
        return a*b;
    }
    public double div(){
        return a/b;
    }
    public double raiz(){
        return Math.sqrt(b);
    }
    public double pot(){
        return Math.pow(a,b);
    }
    public double coseno(){
        return Math.cos(b);
    }
    public double seno(){
        return Math.sin(b);
    }
    public double tang(){
        return Math.tan(b);
    }
    public double porc(){
        return (a*b)/100;
    }
    
    public calculadora(){
        a = 0;
        b = 0;
        res = 0;
        angle = 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getRes() {
        return res;
    }

    public double getAngle() {
        return angle;
    }
    
}
