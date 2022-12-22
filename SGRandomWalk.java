
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
        int step =0;
    Rectangle rex = new Rectangle(0,0,300,300);
    rex.setColor(Color.BLUE);
    rex.fill();
    Ellipse cell = new Ellipse(50,50,200,200);
    cell.draw();
    Ellipse circle = new Ellipse(145, 145, 10, 10);
    circle.setColor(Color.YELLOW);
    circle.fill();
    int v = circle.getX();
    while(Math.sqrt(Math.pow((double) circle.getX()-150,2.0)+Math.pow((double) circle.getY()-150,2.0))<100)
    {
    try{ Thread.sleep(100);}
    catch(Exception ex) {};
    circle.translate(((int)(Math.random()*20)-10),((int)(Math.random()*20)-10));
    step++;
}
    System.out.println(step);
}
}
