package v1;

public class Proov1 {
    public static void main(String[] args) {
        Roopyhendus r1 = new Roopyhendus();
        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();

        Sisend a = new Sisend();
        Sisend b = new Sisend();

        a.lisa(l1);
        b.lisa(l2);

        r1.lisa(l1);
        r1.lisa(l2);

        a.seisund(false);
        b.seisund(true);

        if (r1.kasJuhib()) {
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }

    }

}
