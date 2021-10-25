package zuoye42;

public class CurveChartFactory implements ChartFactory{
    public Chart createChart(){
        Chart chart;
        chart=new CurveChart();
        return chart;
    }
}
