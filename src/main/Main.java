package main;
import java.awt.*;
public class Main {
    public static void main(String args[]) {
        // get monitor size for scaling
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        GUI.start();
    }
}