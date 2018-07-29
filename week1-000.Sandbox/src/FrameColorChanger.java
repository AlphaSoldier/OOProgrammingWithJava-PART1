import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class FrameColorChanger implements Runnable
{
    private JFrame f;
    private final String names[] = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
                              "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};  
    private final Color colors[] = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray,
                              Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
        
    FrameColorChanger()
    {  
        f= new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cont = f.getContentPane();
        Button b=new Button("Set Color");  
        b.setBounds(200,100,60,20);  
        final Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        for(int i = 0; i < names.length; ++i)
            c.add(names[i]);
        b.addActionListener(new ActionListener() 
        {  
            public void actionPerformed(ActionEvent e) {     
            Color color = colors[c.getSelectedIndex()];
            f.getContentPane().setBackground(color);
        }  
        });
        cont.add(b);
        cont.add(c);  
        f.setSize(400,400); 
        f.setVisible(true);
    }

    @Override
    public void run() {
        
    }
}