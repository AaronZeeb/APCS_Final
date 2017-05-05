import javax.swing.JFrame;
public class Run
{
    static final int ANIMATION_TIME_IN_SECONDS = 60;
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        
        frame.setSize(800, 600);
        frame.setTitle("TitleScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TitleScreen component = new TitleScreen();
        frame.add(component);

        frame.setVisible(true);
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame(seconds);
            Thread.sleep( 1000 );
        }
        
    }

}
