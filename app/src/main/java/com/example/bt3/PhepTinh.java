package com.example.bt3;

import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PhepTinh {

    Double so1,so2,kq;

    public PhepTinh(Double so1, Double so2, Double kq) {
        this.so1 = so1;
        this.so2 = so2;
        this.kq = kq;
    }

    public Double getKq() {
        return kq;
    }

    public void setKq(Double kq) {
        this.kq = kq;
    }

    public Double getSo1() {
        return so1;
    }

    public void setSo1(Double so1) {
        this.so1 = so1;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }
    public double tru(Double so1,Double so2){
        return kq = so1 - so2;
    }
    public double nhan(Double so1,Double so2){
        return kq = so1 * so2;
    }
    public double cong(Double so1,Double so2){
        return kq = so1 / so2;
    }
    public double logarit(Double so1,Double so2){
        return kq = log(so1);
    }
    public double somu(Double so1,Double so2){
        return kq = pow(so1,so2);
    }
    public double canbac(Double so1,Double so2){
        return kq = sqrt(so1);
    }
}
