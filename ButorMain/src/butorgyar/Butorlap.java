
package butorgyar;


public class Butorlap {
    private double hosszusag; 
    private double szelesseg; 
    private boolean tartolapE;
    private final double tartolapAr = 5000; 
    private final double hatlapAr = 500; 

    public Butorlap(double hosszusag, double szelesseg, boolean tartolapE) {
        this.hosszusag = hosszusag/100;
        this.szelesseg = szelesseg/100;
        this.tartolapE = tartolapE;
    }

    public double arSzamol() {
        return hosszusag*szelesseg*(this.tartolapE?tartolapAr:hatlapAr);
    
    
    }
    
    
}//class
