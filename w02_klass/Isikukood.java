public class Isikukood {
    String sisu;

    public Isikukood(String uusSisu) {
        this.sisu = uusSisu;
        if (this.sisu.length() != 11) {
            throw new RuntimeException("Vigane pikkus");
        }
    }

    public String kuuNumber() {
        return this.sisu.substring(3, 5);
    }

    public int kuuPaev() {
        return Integer.parseInt(this.sisu.substring(5, 7));
    }

    public char sugu() {
        int nr = Integer.parseInt(this.sisu.substring(0, 1));

        if (nr % 2 == 0) { return 'N'; }
        return 'M';
    }

    public int aasta() {
        String lopp = this.sisu.substring(1, 3);
        int nr = Integer.parseInt(this.sisu.substring(0, 1));
        if (nr == 5 || nr == 6) {
            return Integer.parseInt("20" + lopp);
        }
        if (nr == 3 || nr == 4){
            return Integer.parseInt("19" + lopp);
        }

        return Integer.parseInt("18" + lopp);
    }

    public void display() {
        System.out.println("Kuu: " + this.kuuNumber());
        System.out.println("Paev: " + this.kuuPaev());
        System.out.println("Aasta: " + this.aasta());
        System.out.println("Sugu: " + this.sugu());
    }
}