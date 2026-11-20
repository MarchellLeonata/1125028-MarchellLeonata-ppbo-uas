package model;

public class Lingkaran extends Object2D {
    private double jariJari;

    public Lingkaran(String label, double jariJari){
        super(label);
        this.jariJari = jariJari;
    }

    public double getJariJari(){
        return jariJari;
    }
    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }
    
    @Override 
    public double hitungLuas(){
        return 2 * 3.14 * jariJari;
    }
    
    @Override 
    public  double hitungKeliling(){
        return 3.14 * jariJari * jariJari;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        
    }
}
