/* TODO Write your beautiful file header here */
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;

/* TODO */
public class Player extends RoundedSquare {
    final static double STROKE_FRACTION = 0.1;

    /* TODO */
    public Player() {
        /* TODO
         set a fill color, a stroke color, and set the stroke type to
         centered
         */
    }
    
    /* TODO */
    @Override
    public void setSize(double size) {
        /* TODO
         1. update the stroke width based on the size and 
            STROKE_FRACTION
         2. call super setSize(), bearing in mind that the size
            parameter we are passed here includes stroke but the
            superclass's setSize() does not include the stroke
         */
    }
}