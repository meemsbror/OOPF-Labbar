package geometri;

import java.awt.*;
import java.util.Objects;

public class Rectangle implements GeometricalForm{

    private int x,y,width,height;
    private Color color;

    /**
     *Creates a Square at the specified position with the specified width and height.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width
     * @param height the height
     * @param c the color of the Rectangle
     */
    public Rectangle(int x, int y,int width, int height,Color c)throws IllegalPositionException{
    }

    /**
     *Creates a Rectangle at the position of another geometrical form.
     * @param f a geometrical form
     * @param width the width
     * @param height the height
     * @param c the color of the Square.
     */
    Rectangle(GeometricalForm f,int width,int height, Color c){
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
