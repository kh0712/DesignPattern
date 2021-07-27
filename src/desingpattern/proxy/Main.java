package desingpattern.proxy;

public class Main {

    public static void main(String[] args) {
        Image img = new ImageViewer("Real file name");
        img.showImage();
        Image imgProxy = new ProxyImageViewer("Proxy file name");
        imgProxy.showImage();
    }
}
