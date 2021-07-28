package desingpattern.flyweight;

public class TreeFactory {

    private final TreeModel model;

    public TreeFactory(TreeModel model) {
        this.model = model;
    }

    public Tree create(Position position, int height, int thickness){
        return new Tree(model, position, height, thickness);
    }
}
