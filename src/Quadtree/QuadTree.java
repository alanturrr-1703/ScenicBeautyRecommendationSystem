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
    // Travelling the tree using the Depth First Search Algorithm//
    void DFS(QuadTree tree){
        if (tree == null) return;
        System.out.printf(
                "\n Level: %d [X1=%d Y1=%d] \t[X2=%d Y2=%d]",
                tree.level, tree.boundary.getxMin(), tree.boundary.getxMax(), tree.boundary.getyMax()
        );

    }
}
