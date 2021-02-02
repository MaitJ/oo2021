public class Funktsioonid2 {

    public static int midiNumbriks(String t2htnimetus) {
        if (t2htnimetus.equals("do")) {return 60;}
        if (t2htnimetus.equals("do#")) {return 61;}
        if (t2htnimetus.equals("re")) {return 62;}
        if (t2htnimetus.equals("mib")) {return 63;}
        if (t2htnimetus.equals("mi")) {return 64;}
        if (t2htnimetus.equals("fa")) {return 65;}
        if (t2htnimetus.equals("fa#")) {return 66;}
        if (t2htnimetus.equals("sol")) {return 67;}
        if (t2htnimetus.equals("sol#")) {return 68;}
        if (t2htnimetus.equals("la")) {return 69;}
        if (t2htnimetus.equals("sib")) {return 70;}
        if (t2htnimetus.equals("si")) {return 71;}
        //11 tykki edasi
        return -1;
    }

    public static int[] midiNumbriteks(String[] t2htnimetused) {
        int[] vastus = new int[t2htnimetused.length];
        for (int i = 0; i < t2htnimetused.length; i++) {
            vastus[i] = midiNumbriks(t2htnimetused[i]);
        }
        return vastus;
    }

    public static int suurim(int[] m) {
        if (m == null) {throw new RuntimeException("Tyhi muutuja");}
        if (m.length == 0) {throw new RuntimeException("Elemendid puudu");}
        
        int meeles = m[0];

        for (int i = 0; i < m.length; i++) {
            if (m[i] > meeles) {
                meeles = m[i];
            }
        }

        return meeles;
    }

    public static void main(String[] args) {
        int[] sendid = {1, 2, 5};

        int[] eurod = new int[4];
        eurod[0] = 1;
        eurod[1] = 2; 
        eurod[2] = 5; 
        eurod[3] = 10; 

        int[] ostud = {};

        int[] ostudeNimekiri = null;

        int[] mnumbrid = midiNumbriteks(new String[] {
            "do", "re", "mi", "fa", "sol", "la", "si"
        });

        for (int mnr: mnumbrid) {
            System.out.println(mnr);
        }
    }

}