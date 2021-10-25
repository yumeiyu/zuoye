package zuoye43;

import java.util.Objects;

public class Client {
    public static void main(String args[]){
        FormatTool tool;
        Format format;
        tool=(FormatTool) XMLUtil.getBean();
        format= tool.conversion();
        format.transition();
    }
}
