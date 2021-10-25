package zuoye43;

public class DatabasefileTool implements FormatTool{
    public Format conversion(){
        Format format;
        format=new Databasefile();
        return format;
    }
}
