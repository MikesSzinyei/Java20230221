
package geom;


public class Pont {
    private double x;
    private double y;
    private boolean origoE;
    private final double ORIGOX=0.0;
    private final double ORIGOY=0.0;

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;   
        this.origoE=(x==ORIGOX && y==ORIGOY);
    }

    public boolean isOrigoE() {
        return origoE;
    }

    
    
    public Pont() {
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        this.origoE=(x==ORIGOX && y==ORIGOY);
        
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        this.origoE=(x==ORIGOX && y==ORIGOY);
    }

    @Override
    public String toString() {
        return "Pont{" + "x=" + x + ", y=" + y + ", origoE=" + origoE + ", ORIGOX=" + ORIGOX + ", ORIGOY=" + ORIGOY + '}';
    }

    
    
    
    
    
}//Pont
