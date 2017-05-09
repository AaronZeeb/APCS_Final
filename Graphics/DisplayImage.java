import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
public class DisplayImage extends Applet
{
        Image img1, img2;

        public void init(){

                img1 = getImage(getDocumentBase(), getParameter("title.jpg"));
        }

        public void paint(Graphics g){

                g.drawImage(img1, 0,0,this);
        }

}