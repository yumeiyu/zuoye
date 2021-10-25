/*
 * 开发团队           ：余美玉开发团队
 * 开发团队领导        ：余美玉
 * 开发人员姓名        ：余美玉
 * 开发人员学号/工号    ：2019112150
 * 个人/公司邮箱       ：3360413593@qq.com
 * 开发时间           ：2021/10/21 21:51
 * 文件名称           ：AndroidSystemFactory.Java
 * 开发工具           ：IntelliJ IDEA
 * 开发系统当前用户    ：Lenovo
 */
package zuoye53;

public class AndroidSystemFactory implements SystemFactory{
    public OperationController createOperationController(){
        return new AndroidOperationController();
    }
    public InterfaceController createInterfaceController(){
        return new AndroidInterfaceController();
    }
}
