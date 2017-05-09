import java.awt.*;
//import java.awt.font.*;
//import java.awt.geom.*;
//import java.awt.image.BufferedImage;
//import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import javax.swing.JFrame;

public class ATestprogram
{
static final int ANIMATION_TIME_IN_SECONDS = 60;
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();

        frame.setSize(1024,768);
        frame.setTitle("TitleScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Picture title = new Picture("title.jpg");
        frame.add(title);
        //TitleScreen component = new TitleScreen();
        //frame.add(component);
        frame.setVisible(true);

		final double FACTOR = .5;



}//end of main


}//end of class








