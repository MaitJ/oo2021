public class Proov1 {
    public static void main(String[] args) {
        M2ngija[] m2ngijad = new M2ngija[] { new M2ngija("Jaanus", 1, 2, 2, 1), new M2ngija("Karl", 9, 4, -1, 2)};
        Pall pall = new Pall(5, 5, 0, -3, 1);
        Kaart m2nguKaart = new Kaart(15, 15);

        for (M2ngija obj : m2ngijad) {
            m2nguKaart.lisaKaardile(obj);
        }

        m2nguKaart.lisaKaardile(pall);
        m2ngijad[1].muudaSuunda(-4, 0);
        m2nguKaart.liigutaM2ngijat(m2ngijad[1], 1);
        m2nguKaart.display();

        System.out.println("Peale palliga liikumist: ");
        m2ngijad[1].hoiaPalli(pall);
        m2ngijad[1].muudaSuunda(2, 5);
        m2nguKaart.liigutaM2ngijat(m2ngijad[1], 1);
        m2nguKaart.display();

        System.out.println("Palli loomine:");
        System.out.println("Palli kiirus x: " + pall.lobj.kiirus.x + " y: " + pall.lobj.kiirus.y);
        m2ngijad[1].looPalli(1);
        System.out.println("Palli kiirus x: " + pall.lobj.kiirus.x + " y: " + pall.lobj.kiirus.y);
        System.out.println("x: " + pall.saaAsukoht().x + " y: " + pall.saaAsukoht().y);
        m2nguKaart.uuendaKaarti();
        m2nguKaart.display();
    }
}