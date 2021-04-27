package v1;

public class Proov4 {

    public static void main(String[] args) {
        Jadayhendus j1 = new Jadayhendus();
        Jadayhendus j2 = new Jadayhendus();
        Roopyhendus r1 = new Roopyhendus();

        r1.lisa(j1);
        r1.lisa(j2);

        Sisend s1 = new Sisend();
        Sisend s2 = new Sisend();

        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();

        Lyliti l3 = new Lyliti();
        Lyliti l4 = new Lyliti();

        Pooraja p1 = new Pooraja(l3);
        Pooraja p2 = new Pooraja(l4);


        j1.lisa(l1);
        j1.lisa(l2);

        j2.lisa(l3);
        j2.lisa(l4);

        Sisend a = new Sisend();
        a.lisa(l1);
        a.lisa(p1);

        Sisend b = new Sisend();
        b.lisa(l2);
        b.lisa(p2);

        a.seisund(true);
        b.seisund(true);

        if (r1.kasJuhib()) {
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }



    }
}
