package zuoye43;

public class TXTfileTool implements FormatTool{
    public Format conversion(){
        Format format;
        format=new TXTfile();
        return format;
    }
}
