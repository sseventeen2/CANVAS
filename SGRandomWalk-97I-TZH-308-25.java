
/**
 * Write a description of class SGRandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SGRandomWalk
{
    public static void main(String[] args)
    {
    Rectangle rex = new Rectangle(0,0,300,300);
    rex.setColor(Color.BLUE);
    rex.fill();
    Ellipse cell = new Ellipse(100,100,100,100);
    cell.draw();
    Ellipse circle = new Ellipse(100,100,10,10);    
    circle.setColor(Color.YELLOW);
    circle.fill();
    }
}
