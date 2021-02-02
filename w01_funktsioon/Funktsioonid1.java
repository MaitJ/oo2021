public class Funktsioonid1 {

    public static double taksoHind(float km) {
        return Math.round((3 + (0.80 * km)) * 100) / 100.0;
    }


    public static String temperatuuriHinnang(int t) {
        if (t < 18) {
            return "Kylm";
        } else {
            return "Soe";
        }
    }

    public static double ringiPindala(double raadius) {
        return Math.PI * raadius * raadius;
    }

    public static void main(String[] args) {
        System.out.println(ringiPindala(5));

        if (args.length == 1) {
            System.out.println(taksoHind(Float.parseFloat(args[0])));
        }
    }
}