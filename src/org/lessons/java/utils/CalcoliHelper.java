package org.lessons.java.utils;

public class CalcoliHelper {
    //Overloading 
    public static int mySum(int num1,int num2){
        return num1 + num2;
    }

    public static double mySum(double num1,double num2){
        return num1 + num2;
    }

    public static int mySubstraction(int num1,int num2){
        return num1 - num2;
    }

    public static double mySubstraction(double num1,double num2){
        return num1 - num2;
    }

    public static int myMultiplier(int num1,int num2){
        return num1 * num2;
    }

    public static double myMultiplier(double num1,double num2){
        return num1 * num2;
    }

    public static int myAbsValue(int num){
        return Math.abs(num);
    }

    public static double myAbsValue(double num){
        return Math.abs(num);
    }

    public static int whoIsMin(int num1,int num2){
        if (num1<num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int whoIsMax(int num1,int num2){
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double whoIsMin(double num1,double num2){
        if (num1<num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double whoIsMax(double num1,double num2){
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int miaPotenza(int num1, int num2){
        int result=1;
        for(int i=0;i<num2;i++){
            result=num1*num1;   
        }
        return result;
    }
}
