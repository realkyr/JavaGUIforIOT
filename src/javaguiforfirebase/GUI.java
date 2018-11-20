/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phureekanusont
 */
public class GUI {
    private JFrame frame;
    private JLabel jl;
    
    public void init(){
        frame = new JFrame("FrameDemo");
        jl = new JLabel("HelloWorld");
        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
//      frame.getContentPane().add(BorderLayout.CENTER);
        frame.add(jl);
        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }
    
    public void setLabel(String text){
        jl.setText(text);
    }
    public void addLabel(String text){
        frame.add(new JLabel(text));
        frame.pack();
    }
}
