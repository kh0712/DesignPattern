package desingpattern.proxy;

public class ImageViewer implements Image{

    private String fileName;

    public ImageViewer(String fileName) {
        this.fileName = fileName;
        System.out.println("Image Loading: "+fileName);
    }

    protected ImageViewer() {
    }

    @Override
    public void showImage() {
        System.out.println("Show Image: "+fileName);
    }
}
