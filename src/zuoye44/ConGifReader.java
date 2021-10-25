package zuoye44;

public class ConGifReader implements ImageReaderFactory{
    public ImageReader createReader(){
        ImageReader imageReader;
        imageReader=new Gif();
        return imageReader;
    }
}
