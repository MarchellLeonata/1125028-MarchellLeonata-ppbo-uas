package model;

public class Kerucut extends Object3D {
    private double jariJari;
    private double tinggi;
    
    public Kerucut(String label, double jariJari, double tinggi){
        super(label);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getjariJari(){
        return jariJari;
    }
    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    public double getTinggi(){
        return jariJari;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override 
    public double hitungLuasPermukaan(){
        return 3.14 * jariJari + tinggi + jariJari;
    }

    @Override 
    public double hitungVolume(){
        return 0.3 * 3.14 * jariJari * jariJari * tinggi;
    }   

    @Override 
    public String[][] getKeyValueDetails(){
       return [
        ["Label" + getLabel()],
        ["Jari-Jari" + getJariJari()],
        ["Tinggi" + getTinggi()];
       ]
    }
}
