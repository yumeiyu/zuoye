package zuoye44;

public class ConJpgReader implements ImageReaderFactory{
    public ImageReader createReader(){
        ImageReader imageReader;
        imageReader=new Jpg();
        return imageReader;
    }
}
