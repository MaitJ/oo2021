import java.util.*;

public class Proov2 {
    public static void main(String[] args) {
        Hashtable<String, Double> ht = new Hashtable<String, Double>();
        ht.put("Juku", 4.0);
        ht.put("Kati", 5.0);
        System.out.println(ht.get("Juku"));
        for (String eesnimi : ht.keySet()) {
            System.out.println(eesnimi + " - " + ht.get(eesnimi));
        }
    }
}