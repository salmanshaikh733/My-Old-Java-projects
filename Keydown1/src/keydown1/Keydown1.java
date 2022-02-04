/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keydown1;

import java.awt.*;
import java.applet.*;

public class Keydown1 extends Applet {

    int x = 0;
    int y = 0;
    int increase = 25;

    public void init() {
        setBackground(Color.magenta);
    }

    public boolean keyDown(Event evt, int key) {
        if (key == Event.RIGHT) {
            x += increase;
        } else if (key == Event.LEFT) {
            x -= increase;
        }
        repaint();
        return true;
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, 50, 50);
    }
}