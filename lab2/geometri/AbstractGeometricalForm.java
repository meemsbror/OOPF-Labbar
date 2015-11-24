package geometri;


import java.awt.*;

public abstract class AbstractGeometricalForm implements GeometricalForm{
    @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }
    public void fill(Graphics g){
    }
    public Color getColor(){
        return Color.red;
    }
    public int getArea(){
        return 0;
    }
    public int getHeight(){
        return 0;
    }
    public int getPerimeter(){
        return 0;
    }
    public int getWidth(){
        return 0;
    }
    public int getX(){
        return 0;
    }
    public int getY(){
        return 0;
    }
    public void move(int dx, int dy) throws IllegalPositionException{
    }

    public void place(int x, int y) throws IllegalPositionException{
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode(){
        return 0;
    }
}


/*
@Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }
    public void fill(Graphics g){
        g.drawOval(x,y,width,height);
    }
    public Color getColor(){
        return color;
    }
    public int getArea(){
        return width*height;
    }
    public int getHeight(){
        return height;
    }
    public int getPerimeter(){
        return 2*width+2*height;
    }
    public int getWidth(){
        return width;
    }
    public int getX(){
        return 0;
    }
    public int getY(){
        return 0;
    }
    public void move(int dx, int dy) throws IllegalPositionException{
    }

    public void place(int x, int y) throws IllegalPositionException{
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode(){
        return 0;
    }
 */
