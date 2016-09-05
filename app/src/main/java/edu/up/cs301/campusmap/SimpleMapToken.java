package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Eric M. Hoser
 * @version August 2015
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables
        x = xCoord;
        y = yCoord;
        radius = 15;
        paint = new Paint();

        double redVal = Math.floor(Math.random()*256); // picks a random double between 0 and 256 and floors it such that the numbers picked at between 0 and 255
        double greenVal = Math.floor(Math.random()*256); // picks a random double between 0 and 256 and floors it such that the numbers picked at between 0 and 255
        double blueVal = Math.floor(Math.random()*256); // picks a random double between 0 and 256 and floors it such that the numbers picked at between 0 and 255

        int intRed = (int) redVal; // sets redVal to a int so it can be used to set color
        int intGreen = (int) greenVal; // sets greenVal to a int so it can be used to set color
        int intBlue = (int) blueVal; // sets blueVal to a int so it can be used to set color

        paint.setColor(Color.rgb(intRed, intGreen, intBlue)); // sets color of marker
    }//ctor

    /**
     * this token can paint itself on a given canvas
     */
    public void drawOn(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
