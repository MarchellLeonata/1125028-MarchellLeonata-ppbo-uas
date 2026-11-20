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
    public String[][] getKeyValueDetails(){
        
    }
}
