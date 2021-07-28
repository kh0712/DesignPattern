package desingpattern.flyweight;

public class Main {

    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory(new BasicTreeModel(new Texture(), new Mesh()));

        Tree tree = treeFactory.create(new Position(1, 2), 13, 5);
        Tree tree2 = treeFactory.create(new Position(3, 4), 23, 15);

        TreeModel model = tree.getModel();
        System.out.println("model = " + model);

        TreeModel model2 = tree2.getModel();
        System.out.println("model2 = " + model2);
        System.out.println(model == model2);


    }
}
