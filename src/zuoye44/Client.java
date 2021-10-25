package zuoye44;

public class Client {
    public static void main(String args[]){
        ImageReaderFactory factory;
        ImageReader imageReader;
        factory=new ConGifReader();
        //factory=new ConJpgReader();
        imageReader=factory.createReader();
        imageReader.format();
    }
}
