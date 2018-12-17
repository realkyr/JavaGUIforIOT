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

public class BarChartDataTemp extends JFrame {
   
    
 
   
   public BarChartDataTemp( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      this.setLayout(new FlowLayout());
      this.getContentPane().setBackground(new java.awt.Color(34, 34, 34));
      this.setSize(1050, 780);
      this.setResizable(false);
      
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,
         "Date","Average in Date",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
      
      
      barChart.setBackgroundPaint(new java.awt.Color(34, 34, 34));
      barChart.getTitle().setPaint(new java.awt.Color(255, 255, 255));
      barChart.getTitle().setFont(new java.awt.Font("RSU", 0, 24));
      barChart.getPlot().setBackgroundPaint(new java.awt.Color(100, 100, 100));
      barChart.getCategoryPlot().getRenderer().setBaseItemLabelPaint(new java.awt.Color(0, 0, 255));
      barChart.getCategoryPlot().getDomainAxis().setLabelPaint(new java.awt.Color(255, 255, 255));
      barChart.getCategoryPlot().getDomainAxis().setLabelFont(new java.awt.Font("RSU", 0, 18));
      barChart.getCategoryPlot().getDomainAxis().setTickLabelPaint(new java.awt.Color(255, 255, 255));
      barChart.getCategoryPlot().getDomainAxis().setTickLabelFont(new java.awt.Font("RSU", 0, 18));
      barChart.getCategoryPlot().getRangeAxis().setLabelPaint(new java.awt.Color(255, 255, 255));
      barChart.getCategoryPlot().getRangeAxis().setLabelFont(new java.awt.Font("RSU", 0, 18));
      barChart.getCategoryPlot().getRangeAxis().setTickLabelPaint(new java.awt.Color(255, 255, 255));
      barChart.getCategoryPlot().getRangeAxis().setTickLabelFont(new java.awt.Font("RSU", 0, 18));
      barChart.getCategoryPlot().getRenderer().setSeriesPaint(0, new java.awt.Color(249, 124, 220));
     // System.out.println(lineChart.);
      
      ChartPanel chartPanel = new ChartPanel( barChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 1000 , 700 ) );
      
      chartPanel.setBackground( new java.awt.Color(0, 0, 255) );
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
      
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      /* DefaultCategoryDataset dataset2 = new DefaultCategoryDataset( );
      
      String[] dataset = new String[2];
      SecurityUtil.setUp();
      try {
          DataServices.initialTempData();
          TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException ex) {
          ex.printStackTrace();
      }

      for (HistoryData data: DataServices.getTemperatureData()) {
          dataset[0] = data.getDate();
          dataset[1] = String.valueOf(data.getAverage());
          System.out.println(dataset[0] + " " + dataset[1]);
      }
      
      dataset2.addValue( Double.parseDouble(dataset[1]), "Temperature", dataset[0] ); */
      dataset.addValue( 29.5 , "Temperature" , "20181210" );
      dataset.addValue( 27.5 , "Temperature" , "20181211" );
      dataset.addValue( 28.5 , "Temperature" , "20181212" );
      dataset.addValue( 29.5 , "Temperature" , "20181213" );
      dataset.addValue( 27.5 , "Temperature" , "20181214" );
      dataset.addValue( 28.5 , "Temperature" , "20181215" );
      dataset.addValue( 30.2 , "Temperature" , "20181216" ); 
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      BarChartDataTemp chart = new BarChartDataTemp(
         "Temperature Average Value Analysis" ,
         "Summary the Average Value of Temperature");
     
   }


}
