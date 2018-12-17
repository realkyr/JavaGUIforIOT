/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

/**
 *
 * @author Paoyimpae
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javafx.scene.chart.NumberAxis;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javaguiforfirebase.Main;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import javaguiforfirebase.DataServices;
import javaguiforfirebase.HistoryData;
import javaguiforfirebase.SecurityData;
import javaguiforfirebase.SecurityUtil;

public class LineChartDataGas extends JFrame {
   
    
 
   
   public LineChartDataGas( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      this.setLayout(new FlowLayout());
      this.getContentPane().setBackground(new java.awt.Color(34, 34, 34));
      this.setSize(1050, 780);
      this.setResizable(false);
      
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Date","Average in Date",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
      lineChart.setBackgroundPaint(new java.awt.Color(34, 34, 34));
      lineChart.getTitle().setPaint(new java.awt.Color(255, 255, 255));
      lineChart.getTitle().setFont(new java.awt.Font("RSU", 0, 24));
      lineChart.getPlot().setBackgroundPaint(new java.awt.Color(100, 100, 100));
      lineChart.getCategoryPlot().getRenderer().setBaseItemLabelPaint(new java.awt.Color(0, 0, 255));
      lineChart.getCategoryPlot().getDomainAxis().setLabelPaint(new java.awt.Color(255, 255, 255));
      lineChart.getCategoryPlot().getDomainAxis().setLabelFont(new java.awt.Font("RSU", 0, 18));
      lineChart.getCategoryPlot().getDomainAxis().setTickLabelPaint(new java.awt.Color(255, 255, 255));
      lineChart.getCategoryPlot().getDomainAxis().setTickLabelFont(new java.awt.Font("RSU", 0, 18));
      lineChart.getCategoryPlot().getRangeAxis().setLabelPaint(new java.awt.Color(255, 255, 255));
      lineChart.getCategoryPlot().getRangeAxis().setLabelFont(new java.awt.Font("RSU", 0, 18));
      lineChart.getCategoryPlot().getRangeAxis().setTickLabelPaint(new java.awt.Color(255, 255, 255));
      lineChart.getCategoryPlot().getRangeAxis().setTickLabelFont(new java.awt.Font("RSU", 0, 18));
      lineChart.getCategoryPlot().getRenderer().setSeriesPaint(0, new java.awt.Color(126, 152, 248));
      /* lineChart.s
      lineChart.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
      lineChart.setForeground(new java.awt.Color(255, 255, 255)); */
     
      
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 1000 , 700 ) );
      
      chartPanel.setBackground( Color.RED );
      /* setContentPane( chartPanel ); */
      this.add(chartPanel);

      /* ChartFrame frame = new ChartFrame("Temperature Average Value Analysis", lineChart);
      frame.setFont(new Font("Sans-Serif", Font.PLAIN, 18)); 
      frame.pack();
      frame.setVisible(true);*/
       
      JButton button = new JButton("ออกจากหน้านี้");
      button.setSize(30, 30);
      button.setFont(new java.awt.Font("RSU", 0, 18));
      button.setForeground(new java.awt.Color(0, 0, 0));
      this.add(button, BorderLayout.SOUTH);
      button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if (command.equalsIgnoreCase("ออกจากหน้านี้")) {
                    setVisible(false);
               
                }
            }
        });
      // this.pack();
      this.setVisible(true);
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset2 = new DefaultCategoryDataset( );
      // SecurityUtil.setUp();
      DataServices.initialSmokeData();
      DataServices.waiting();
      System.out.println(DataServices.getSmokeData().size());
      for (HistoryData data: DataServices.getSmokeData()) {
          dataset2.addValue( data.getAverage(), "Smoke", data.getDate() );
      }
      return dataset2;
   }
   
   public static void main( String[ ] args ) {
      LineChartDataGas chart = new LineChartDataGas(
         "Smoke Average Value Analysis" ,
         "Summary the Average Value of Smoke");
     
   }


}
