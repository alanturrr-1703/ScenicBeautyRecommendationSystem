package Quadtree;

public class Point {

    final float x;
    final float y;
    private final image data;

    Point(float x, float y, image data){
        this.x = x;
        this.y = y;
        this.data = data;
    }
    float sqDistance(Point a, Point b){
        float dx = b.x - a.x;
        float dy = b.y - a.y;
        return dx * dx + dy * dy;
    }
    float distance(Point a, Point b){
        return (float) Math.sqrt(sqDistance(a, b));
    }

    public image getData() {
        return data;
    }
}