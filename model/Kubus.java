package model;

public class Kubus extends Object3D {
    private double sisi;
    
    public Kubus(String label, double sisi){
        super(label);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    @Override 
    public double hitungLuasPermukaan(){
        return 6 * sisi * sisi;
    }

    @Override 
    public double hitungVolume(){
        return sisi * sisi * sisi;
    }  

    @Override 
    public String[][] getKeyValueDetails(){
        return [
            ["Label" + geLabel()],
            ["Sisi" + getSisi()];
        ]
    }

}
