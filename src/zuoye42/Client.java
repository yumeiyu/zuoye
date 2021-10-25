package zuoye42;

public class Client {
    public static void main(String args[]){
        ChartFactory factory;
        Chart chart;
        factory=new CurveChartFactory();
        //factory=new HistogramFactory();
        chart=factory.createChart();
        chart.display();
    }
}
