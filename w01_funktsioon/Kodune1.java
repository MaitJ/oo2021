import java.util.Scanner;
public class Kodune1 {

    public static int kwToHp(int kw) {
        return (int) Math.round(kw / 0.745699872);
    }

    public static void technicalSpecs(String engineCode) {
        String engineBase = "b230";
        String[] engineTypes = {"f", "e", "et", "ft", "fb", "fk"};
        String[] releaseYears = {"1985-1986", "1985-1987", "1985-1990", "1985-1998", "1990-1994", "1994-1998"};
        int[] kilowatts = {85, 98, 136, 123, 96, 101};

        for (int i = 0; i < engineTypes.length; i++) {
            String engine = engineBase + engineTypes[i];

            if (engine.equals(engineCode)) {
                int hp = kwToHp(kilowatts[i]);
                System.out.println("Mootor: " + engine.toUpperCase());
                System.out.println("V2ljalaske aastad: " + releaseYears[i]);
                System.out.println("Kilowatte: " + kilowatts[i]);
                System.out.println("Hobuj6udu: " + hp);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volvo B230 mootori tehnilised andmed.");
        System.out.println("Palun sisesta oma mootorikood: ");

        String engineCode = scanner.nextLine();
        technicalSpecs(engineCode.toLowerCase());        
    }
}