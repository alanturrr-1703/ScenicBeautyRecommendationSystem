package Quadtree;

public class Rectangle {
    private final float left;
    private final float right;
    private final float top;
    private final float bottom;
    private final String data;
    private float x;
    private float y;
    private float h;
    private float w;

    Rectangle(float x, float y, float w, float h, String data){
        this.data = data;
        this.left = (x - w) / 2;
        this.right = (x + w) / 2;
        this.top = (y - h) / 2;
        this.bottom = (y + h) / 2;
    }
    public boolean contains(Rectangle r, Point x) {
        return (r.left <= x.x && x.x <= r.right && r.top <= x.y && x.y >= r.bottom);
    }
    public Rectangle subdivide(Rectangle quadrant) {
        return switch (quadrant.data) {
            case ("ne") -> new Rectangle(this.x + this.w / 4, this.y - this.h / 4, this.w / 2, this.h / 2, "ne");
            case ("nw") -> new Rectangle(this.x - this.w / 4, this.y - this.h / 4, this.w / 2, this.h / 2, "nw");
            case ("se") -> new Rectangle(this.x + this.w / 4, this.y + this.h / 4, this.w / 2, this.h / 2, "se");
            case ("sw") -> new Rectangle(this.x + this.w / 4, this.y - this.h / 4, this.w / 2, this.h / 2, "sw");
            default -> throw new IllegalStateException("Unexpected value: " + quadrant.data);
        };
    }
    
}
