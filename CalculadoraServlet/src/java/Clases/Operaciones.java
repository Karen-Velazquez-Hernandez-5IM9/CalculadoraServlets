/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.lang.Math;

public class Operaciones {
    
    public float Suma(int nume1,int nume2){
        float res= nume1+nume2;
        return res;
    }
    public float Resta(int nume1,int nume2){
        float res= nume1-nume2;
        return res;
    }
    public float Divi(int nume1,int nume2){
        float res= nume1/nume2;
        return res;
    }
    public float Multi(int nume1,int nume2){
        float res= nume1*nume2;
        return res;
    }
    public float Sin(int nume1){
        float res= (float) Math.sin(nume1);
        return res;
    }
    public float Cos(int nume1){
        float res= (float) Math.cos(nume1);
        return res;
    }
    public float Tan(int nume1){
        float res= (float) Math.tan(nume1);
        return res;
    }
    public float LogN(int nume1){
        float res= (float) Math.log(nume1);
        return res;
    }
    public float Log(int nume1){
        float res= (float) Math.log10(nume1);
        return res;
    }
    public float Exp(int nume1){
        float res= (float) Math.exp(nume1);
        return res;
    }
}
