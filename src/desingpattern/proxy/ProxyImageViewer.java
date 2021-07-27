package desingpattern.proxy;

public class ProxyImageViewer extends ImageViewer{


    private String fileName;
    private ImageViewer instance = null;

    public ProxyImageViewer(String fileName) {
        super();
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        if(instance == null){
            instance = new ImageViewer(fileName);
        }
        System.out.print("[Proxy]");
        instance.showImage();

    }
}
