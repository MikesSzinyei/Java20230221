
package butorgyar;


public class Butor {
    private int lapokSzama;
    Butorlap[] lapok;

    public Butor() {
        this.lapokSzama = 0;
        this.lapok = new Butorlap[100];
    }
    
    public void lapHozzaad(Butorlap lap) {
        
        if (lapokSzama<100) {
            this.lapok[lapokSzama++]=lap;
        }
        
        
    }
    
    public double arSzamol() {
        double ar=0;
        for (int i = 0; i < this.lapokSzama; i++) {
            ar+=this.lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Butorlapok szama: " + lapokSzama + " ár: " + arSzamol();
    }
    
}//class
