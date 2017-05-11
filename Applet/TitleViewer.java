import javax.swing.JFrame;
public class TitleViewer
{
    static final int ANIMATION_TIME_IN_SECONDS = 60;
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1024, 768);
        frame.setTitle("TitleScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageViewer pic = new ImageViewer();
        frame.add(pic);
        
        Title component = new Title();
        frame.add(component);
        
        

        frame.setVisible(true);
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame(seconds);
            Thread.sleep( 1000 );
        }
        
    }

}

