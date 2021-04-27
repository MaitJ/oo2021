package v1;

public class Kodune1 {

    public static void main(String[] args) {
        Jadayhendus yld = new Jadayhendus();
        Roopyhendus r1 = new Roopyhendus();

        Jadayhendus j1 = new Jadayhendus();
        Roopyhendus r2 = new Roopyhendus();

        r1.lisa(j1);
        r1.lisa(r2);

        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();
        Lyliti l4 = new Lyliti();

        Sisend a = new Sisend();
        Sisend b = new Sisend();
        Sisend c = new Sisend();
        Sisend d = new Sisend();

        a.lisa(l1);
        b.lisa(l2);
        c.lisa(l3);
        d.lisa(l4);

        r2.lisa(l3);
        r2.lisa(l4);

        j1.lisa(l1);
        j1.lisa(l2);

        yld.lisa(r1);

        Lyliti l5 = new Lyliti();
        Sisend e = new Sisend();
        e.lisa(l5);

        yld.lisa(l5);

        Roopyhendus r3 = new Roopyhendus();

        Sisend f = new Sisend();
        Sisend g = new Sisend();

        Lyliti l6 = new Lyliti();
        Lyliti l7 = new Lyliti();

        f.lisa(l6);
        g.lisa(l7);

        r3.lisa(l6);
        r3.lisa(l7);

        yld.lisa(r3);

        a.seisund(true);
        b.seisund(true);
        c.seisund(true);
        e.seisund(false);
        f.seisund(true);

        System.out.println(yld.kasJuhib());

    }


}
