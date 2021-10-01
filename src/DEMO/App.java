package DEMO;

class App {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        //couting해줌
        Image image1 = createImage("HiRes_10MB_Photo1");//(new LoggingProxyImage(new ProxyImage()));
        Image image2 = createImage("HiRes_10MB_Photo2");//new LoggingProxyImage(new ProxyImage("HiRes_10MB_Photo2"));

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
    public static Image createImage(String filename){
//        return new RealImage(filename);
        //return new ProxyImage(filename);
        return new RateLimitingImage(new ProxyImage(filename));
    }
}