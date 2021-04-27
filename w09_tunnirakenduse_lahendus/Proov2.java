package v1;

public class Proov2 {

    public static void main(String[] args) {
        Jadayhendus j1 = new Jadayhendus();

        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();

        Sisend a = new Sisend();
        Sisend b = new Sisend();
        Sisend c = new Sisend();

        j1.lisa(l1);
        j1.lisa(l2);
        j1.lisa(l3);

        a.lisa(l1);
        b.lisa(l2);
        c.lisa(l3);

        a.seisund(false);
        b.seisund(true);
        c.seisund(true);

        if (j1.kasJuhib()) {
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
}
