package geometri;

import java.awt.*;
import java.util.Objects;

public class Point implements GeometricalForm{

    private int x,y;
    private Color color;

    /**
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the point
     */
    public Point(int x, int y,Color c)throws IllegalPositionException{
    }

    /**
     *
     * @param f a geometrical form
     * @param c the color of the point
     */
    public Point(GeometricalForm f, Color c){
    }

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
