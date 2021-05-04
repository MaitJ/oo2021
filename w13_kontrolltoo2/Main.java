package com.company;
import org.junit.*;

import javax.swing.*;

import static org.junit.Assert.*;

public class Main {
    SirgeVorrand vorrand = new SirgeVorrand(3.0);
    SirgeVorrandVaba vorrandMassiiv = new SirgeVorrandVaba(3.0, 0);
    SirgePuhver puhver = new SirgePuhver("testarvud.txt");

    @Test
    public void x3Kontroll() {
        assertEquals(3.0, vorrand.arvuta(1.0), 0.001);
    }
    @Test
    public void xKontroll2() {
        assertEquals(6.0, vorrand.arvuta(2.0), 0.001);
    }
    @Test
    public void xKontroll3() {
        assertEquals(-6.0, vorrand.arvuta(-2.0), 0.001);
    }
    @Test
    public void xKontroll__3() {
        assertEquals(new Double[] {3.0, -3.0, 30.0, -30.0}, vorrand.arvuta(new Double[] {1.0, -1.0, 10.0, -10.0}));
    }
    @Test
    public void xKontroll_3() {
        vorrandMassiiv.vabaliige = 2;
        assertEquals(5.0, vorrandMassiiv.arvuta(1.0), 0.001);
    }
    @Test
    public void xKontroll4() {
        assertEquals(new Double[] {3.0, 6.0, 9.0, 30.0}, vorrandMassiiv.arvuta(new Double[] {1.0, 2.0, 3.0, 10.0}));
    }
    @Test
    public void xKontroll5() {
        vorrandMassiiv.vabaliige = 2.0;
        assertEquals(new Double[] {5.0, 8.0, 11.0, 32.0}, vorrandMassiiv.arvuta(new Double[] {1.0, 2.0, 3.0, 10.0}));
    }
    @Test
    public void puhverKontroll3x2() {
        assertEquals(new Double[] {-4.0, -1.0, 2.0, 5.0, 8.0}, puhver.arvuta().get(0));
    }
    @Test
    public void puhverKontroll2x15() {
        assertEquals(new Double[] {-11.0, -13.0, -15.0, -17.0, -19.0}, puhver.arvuta().get(2));
    }
    @Test
    public void puhverKontroll2() {
        assertEquals(new Double[] {4.0, 2.0, -0.0, -2.0, -4.0}, puhver.arvuta().get(3));
    }
    @Test
    public void puhverKontroll3() {
        assertEquals(new Double[] {-6.0, -3.0, 0.0, 3.0, 6.0}, puhver.arvuta().get(1));
    }
}
