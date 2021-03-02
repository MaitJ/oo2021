import java.io.*;
public class kt {
    public static double kronoloogilineKeskmine(double[] arvud) {
        double keskmine = 0;

        double esimene = (arvud[0] / 2);
        double viimane = (arvud[arvud.length - 1] / 2);

        keskmine += esimene;
        keskmine += viimane;

        for (int i = 1; i <= (arvud.length - 2); i++) {
            keskmine += arvud[i];
        }
        keskmine /= (arvud.length - 1);
        return keskmine;
    }

    public static void output(BufferedReader sisse) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("v2ljund.txt"));
        String rida = sisse.readLine();
        while (rida != null) {
            String[] ridaArray = rida.split(" ");
            int kuupaev = Integer.parseInt(ridaArray[0]);
            double[] temperatuurid = new double[ridaArray.length - 1];
            for (int i = 1; i < ridaArray.length; i++) {
                temperatuurid[i - 1] = Integer.parseInt(ridaArray[i]);
            }

            pw.print(kuupaev + " ");
            pw.print(kronoloogilineKeskmine(temperatuurid));

            pw.println();
            rida = sisse.readLine();
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader sisse = new BufferedReader(new FileReader("sisend.txt"));
        output(sisse);
        sisse.close();



        //double[] testArvud0 = {1, 5, 3};
        //double[] testArvud = {1, 5, 8, 3};
        //System.out.println(kronoloogilineKeskmine(testArvud0));
        //System.out.println(kronoloogilineKeskmine(testArvud));
    }
}