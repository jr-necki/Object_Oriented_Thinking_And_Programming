package DEMO;

//cache
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);

        }
        image.displayImage(); // 캐싱된 이미지를 보여줌으로써 과도한 디스크 사용 줄여줌
    }

}