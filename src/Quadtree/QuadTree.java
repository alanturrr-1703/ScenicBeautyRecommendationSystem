package Quadtree;
import java.util.ArrayList;
import java.util.List;

public class QuadTree {
    final int MAX_CAPACITY = 4;
    int level = 0;
    List <Node> nodes;
    QuadTree Northwest;
    QuadTree Northeast;
    QuadTree Southwest;
    QuadTree SouthEast;
    Boundary boundary;
    QuadTree(int level, Boundary boundary){
        this.level = level;
        nodes = new ArrayList<>();
        this.boundary = boundary;
    }

}
