package Quadtree;

public class Rectangle {
    private float x;
    private float y;
    private float w;
    private float h;
    private final float left;
    private final float right;
    private final float top;
    private final float bottom;

    Rectangle(float x, float y, float w, float h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        this.left = (x - w) / 2;
        this.right = (x + w) / 2;
        this.top = (y - h) / 2;
        this.bottom = (y + h) / 2;
    }
    public boolean contains(Rectangle r, Point x) {
        return (r.left <= x.x && x.x <= r.right && r.top <= x.y && x.y >= r.bottom);
    }
    public Rectangle subdivide(Rectangle quadrant) {
        switch (quadrant){
            case ('ne'):
        }
    }
}
