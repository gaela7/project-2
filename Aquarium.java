import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
    public static void drawDeadEye(PainterAPI p) {
        //draw dead eye
    }

    public static void drawStars(PainterAPI p) {
        //calls a loop of DrawTriangle methdod
    }

    public static void drawShip(PainterAPI p) {
        //call circle method
        //call triangle method
        
    }
    public static void drawEarth(PainterAPI p) {
        //draw earth

    }

    public static void drawSaturn(PainterAPI p) {
        //draw saturn
        //calls smaller draw circle method to draw saturn's rings
        //loop circles for rings
    }
    public static void drawJupiter(PainterAPI p) {
        //draws jupiter
        //calls smaller draw circle method to draw jupiter's red spot
    }


    public static void drawBackground(PainterAPI p, Color color) {
        //draw background
    }

    public static void drawTriangle(PainterAPI p, int x, int y, int size) {
        //draw triangle
    }

    public static void drawCircle(PainterAPI p, int x, int y, int radius) {
        //draw circle
    }


    public static void drawFish(PainterAPI p) {
        //call draw cirlce method
        //call draw triangle method

    }
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
        painter.forward(100);
        /** 
         * */ 

     }
}