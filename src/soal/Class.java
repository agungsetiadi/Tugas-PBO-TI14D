/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author Kardinal
 */
public class Class {
    
    String ft;
    String sd;
    String td;

    public String getFt() {
        return ft;
    }

    public void setFt(String ft) {
        this.ft = ft;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }
    
    public void urutan(String f, String s, String t){
        setFt(f);
        setSd(s);
        setTd(t);
    }
    
    public void tampil(){
        System.out.println("1. "+getFt());
        System.out.println("2. "+getSd());
        System.out.println("3. "+getTd());
    }
    
    int z;
    int y;
    int x;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void mulai(int q, int w){
        setZ(q);
        setY(w);
        setX(q+w);
    }
    
    public void akhir(){
        System.out.println(""+getX());
    }
}
