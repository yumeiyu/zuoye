package zuoye43;

public class ExcelfileTool implements FormatTool{
    public Format conversion(){
        Format format;
        format=new Excelfile();
        return format;
    }
}
