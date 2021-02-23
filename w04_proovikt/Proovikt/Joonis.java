import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Joonis {
    BufferedImage pilt;
    Graphics g;
    int laius, pikkus;
    Vektor[] koordinaadid;

    public Joonis(int laius, int pikkus, Hulknurk hulknurk) {
        this.pilt = new BufferedImage(laius, pikkus, BufferedImage.TYPE_INT_RGB);
        this.g = pilt.createGraphics();
        this.koordinaadid = hulknurk.getVektorid();
    }

    public void joonistaPilt() {
        int algus =(int) laius / 2;
        Vektor esimeneVektor = this.koordinaadid[0];
        Vektor viimaneVektor = this.koordinaadid[this.koordinaadid.length - 1];
        for (int i = 0; i < (this.koordinaadid.length - 1); i++) {
            Vektor punkt1 = this.koordinaadid[i];
            Vektor punkt2 = this.koordinaadid[i + 1];
            g.drawLine((punkt1.x * 10), (punkt1.y * 10), (punkt2.x * 10), (punkt2.y * 10));
        }
        g.drawLine((viimaneVektor.x * 10), (viimaneVektor.y * 10), (esimeneVektor.x * 10), (esimeneVektor.y * 10));

    }

    public BufferedImage getPilt() {
        return this.pilt;
    }
}