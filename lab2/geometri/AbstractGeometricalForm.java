package geometri;


import java.awt.*;
import java.lang.NullPointerException;
import java.lang.ClassCastException;


public abstract class AbstractGeometricalForm implements GeometricalForm{
    private int x,y;
    final private int width,height;
    final private Color color;

    public AbstractGeometricalForm(int x, int y, int width, int height, Color c)throws IllegalPositionException{
	    if(isIllegalPosition(x,y)){
            throw new IllegalPositionException("X or Y is negative");
        }
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color = c;

    }

    public AbstractGeometricalForm(AbstractGeometricalForm f, int width, int height, Color c) {
        this.x=f.getX();
        this.y=f.getY();
        this.width=width;
        this.height=height;
        this.color = c;
    }

    @Override
    public int compareTo(GeometricalForm f) {
        if(f == null){
           throw new NullPointerException("the object was null");
        }
        if(f instanceof GeometricalForm){
            GeometricalForm that = (GeometricalForm)f;
            if(this.getArea()-that.getArea()==0){
                return this.getPerimeter()-that.getPerimeter();    
            } 
            return this.getArea()-that.getArea();
        }
        
        throw new ClassCastException("Class was not a GeometricalForm");
    }

    public abstract void fill(Graphics g);

    public Color getColor(){
        return color;
    }

    public abstract int getArea();

    public int getHeight(){
        return height;
    }

    public abstract int getPerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractGeometricalForm that = (AbstractGeometricalForm) o;

        if (getWidth() != that.getWidth()) return false;
        if (getHeight() != that.getHeight()) return false;
        return getColor().equals(that.getColor());
    }

    @Override
    public int hashCode() {
        int result = getWidth();
        result = 31 * result + getHeight();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    public int getWidth(){

        return width;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int dx, int dy) throws IllegalPositionException{
        place(x+dx,y+dy);
    }

    public void place(int x, int y) throws IllegalPositionException{
        if(x<0||y<0){
            throw new IllegalPositionException("X or Y is negative");
        }
        this.x = x;
        this.y = y;
    }
    protected static boolean isIllegalPosition(int x, int y){
        return x<0||y<0;
    }
}
