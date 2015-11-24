package geometri;


import java.awt.*;

public abstract class AbstractGeometricalForm implements GeometricalForm{
    private int x,y;
    final private int width,height;
    final private Color color;

    public AbstractGeometricalForm(int x, int y, int width, int height, Color c){
	    this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color = c;

    }

    public AbstractGeometricalForm(AbstractGeometricalForm f, int width, int height, Color c) {
        this(f.getX(),f.getY(),width,height,c);
    }

        @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }
    public abstract void fill(Graphics g);
    public Color getColor(){
        return Color.red;
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
    }

    public void place(int x, int y) throws IllegalPositionException{

    }

	@Override
	public boolean equals(Object o) {
	}

	@Override
	public int hashCode() {
	}

}