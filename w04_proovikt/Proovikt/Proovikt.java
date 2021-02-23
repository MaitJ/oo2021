import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Proovikt {

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader sisse = new BufferedReader(new FileReader("sisend1.txt"));

        String[] x = sisse.readLine().split(" ");
        String[] y = sisse.readLine().split(" ");
        sisse.close();
        Vektor[] nurgad = new Vektor[x.length];

        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                nurgad[i] = new Vektor(Integer.parseInt(x[i]), Integer.parseInt(y[i]));
            }
        } else {
            throw new RuntimeException("Koordinaadid ei ole paaris");
        }
        Hulknurk hulknurk = new Hulknurk(nurgad);
        Joonis joonis = new Joonis(100, 100, hulknurk);
        joonis.joonistaPilt();
        ImageIO.write(joonis.getPilt(), "png", new File("pilt1.png"));
        //Vektor[] nurgad = {nurk1, nurk2, nurk3, nurk4};
        //Hulknurk hulknurk = new Hulknurk(nurgad);
        System.out.println("Ymbermoot: " + hulknurk.ymbermoot());
    }
}