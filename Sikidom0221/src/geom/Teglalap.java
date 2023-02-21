
package geom;


public class Teglalap {
    Pont[] csucsok =new Pont[4];
    
    public Teglalap(double m, double sz, Pont balfelso) {
        csucsok[0]=balfelso;
        csucsok[1]=new Pont (balfelso.getX()+sz,balfelso.getY());
        csucsok[2]=new Pont(balfelso.getX(),balfelso.getY()-m);
        csucsok[3]=new Pont(balfelso.getX()+sz,balfelso.getY()-m);
    }
    
    public double getM() {
        return (csucsok[0].getY()-csucsok[2].getY());
    }
    
    public double getSz() {
        return (csucsok[1].getX()-csucsok[0].getX());
    }
    
    public double getTerulet() {
        return getM()*getSz();
    }
    
    public double getKerulet() {
        return (getM()+getSz())*2;
    }

    

    
    
    public String toString() {
        return "Teglalap - kerület: "+this.getKerulet() 
                +" terület: "+this.getTerulet();
                

    
                
    
    }
    
    
    
    
}//Taglalap
