package desingpattern.flyweight;

public class Tree {

    private TreeModel model;
    private Position pos;
    private int height;
    private int thickness;

    public Tree(TreeModel model,Position pos, int height, int thickness) {
        this.model = model;
        this.height = height;
        this.thickness = thickness;
    }

    public TreeModel getModel() {
        return model;
    }
}
