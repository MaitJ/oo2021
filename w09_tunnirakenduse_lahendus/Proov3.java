package v1;

public class Proov3 {
    public static void main(String[] args) {
        Jadayhendus j1 = new Jadayhendus();
        Roopyhendus r1 = new Roopyhendus();
        Makett m1 = new Makett();

        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();

        Sisend a = new Sisend();
        Sisend b = new Sisend();
        Sisend c = new Sisend();

        Lyliti l4 = new Lyliti();
        Lyliti l5 = new Lyliti();

        Sisend d = new Sisend();
        Sisend e = new Sisend();

        r1.lisa(l4);
        r1.lisa(l5);

        j1.lisa(l1);
        j1.lisa(l2);
        j1.lisa(l3);

        a.lisa(l1);
        b.lisa(l2);
        c.lisa(l3);

        d.lisa(l4);
        e.lisa(l5);

        d.seisund(true);
        e.seisund(false);

        a.seisund(true);
        b.seisund(true);
        c.seisund(true);

        m1.lisa(r1);
        m1.lisa(j1);


        if (m1.kasJuhib()) {
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }

    }
}
