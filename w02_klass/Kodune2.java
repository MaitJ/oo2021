public class Kodune2 {

    public static void main(String[] args) {
        Auto volvo940 = new Auto("Volvo", "940", new String[] {"1994-2000", "1993-2001"}, new Mootor("B230FB", new String[] {"1989-1990", "1990-2005"}, 96.0));
        Auto volvo740 = new Auto("Volvo", "740", new String[] {"1993-2000", "1993-1998"}, new Mootor("B230FT", new String[] {"1990-1995", "1990-2005"}, 114.0));
        Auto bmw330d = new Auto("BMW", "330d", new String[] {"2003-2005"}, new Mootor("M57D30", new String[] {"2003-2005"}, 150.0));

        System.out.println(volvo940 + "\n" + volvo740 + "\n" + bmw330d);
    }
}