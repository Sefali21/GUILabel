package label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JFrame {
    public MyLabel(){
        String path= "src/label/java.png";
        ImageIcon image=new ImageIcon("src/label/java1.png");
        Border border=BorderFactory.createLineBorder(Color.red, 3);


        JLabel label=new JLabel();                          //creates a label
        label.setText("I'm learning GUI");             //set text of the label
        label.setIcon(image);
        label.validate();
        label.setHorizontalTextPosition(JLabel.CENTER);         //set text left, center right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);              //set text top, center, bottom of imageicon
        label.setForeground(Color.ORANGE);                          //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 16));     //set font of text
        label.setIconTextGap(10);                //set gab of text to image
        label.setBackground(Color.BLACK);         //set background color
        label.setOpaque(true);                   //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);          //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);        //set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250);   //set x,y position within frame as well as dimensions         //icon istenen yere koymak icin. framesetLayout ile birlikte calisiyor




        JFrame frame=new JFrame();
        //frame.setSize(420,420);           //frame.pack kullaniliyorsa gerek yok, zati oto frame ölcekli yerlestiriyoryapiyor

        //frame.setLayout(null);

        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

        frame.pack();




    }


}
