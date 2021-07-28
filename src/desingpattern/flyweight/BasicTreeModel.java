package desingpattern.flyweight;

public class BasicTreeModel implements TreeModel {

    private Texture texture;
    private Mesh mesh;

    public BasicTreeModel(Texture texture, Mesh mesh) {
        this.texture = texture;
        this.mesh = mesh;
    }

}
