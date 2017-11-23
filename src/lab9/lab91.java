package lab9;

import java.applet.Applet;
import java.awt.*;

    public class lab91 extends Applet {
        public void paint(final Graphics g)

        {

            g.drawLine(0, 0, 500, 0);

            g.drawLine(0, 0, 0, 500);

            g.drawLine(500, 0, 500, 500);

            g.drawLine(500, 500, 0, 500);

            g.drawLine(20, 400, 400, 400);
            g.drawLine(20, 400, 20, 200);
            g.drawLine(400, 200, 400, 400);
            g.drawLine(20, 200, 400, 200);
            g.drawLine(215, 100, 400, 200);
            g.drawLine(215, 100, 20, 200);

        }
    }