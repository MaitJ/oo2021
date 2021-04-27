package com.company;

import org.junit.*;
import static org.junit.Assert.*;

public class Main {

    Jook testJook = new Jook("Coca Cola", 0.85, 1.2);
    Joogipudel testPudel = new Joogipudel(750, "Plastik", 40, 0.10, testJook);

    Joogivaat testVaat = new Joogivaat(5000, 3000, testJook);
    Joogivaat testVaatTyhi = new Joogivaat(5000, 150, testJook);
    Joogivaat testVaat1l = new Joogivaat(5000, 1000, testJook);
    Joogivaat testVaatalFull = new Joogivaat(5000, 4900, testJook);

    Joogikast testKast = new Joogikast("Papp kast", 0.2, 24, 100);
    Joogikast neljanePakk = new Joogikast("Plastik", 0.05, 4, 0.01);

    //Pudel 1
    //Maht 750
    @Test
    public void pudeliKontroll() {
        assertEquals(940.0, testPudel.arvutaMass(), 0.0001);
    }

    @Test
    public void pudeliKontrollHind() {
        assertEquals(0.74, testPudel.leiaOmahind(), 0.001);
    }

    @Test
    public void taidetudPudelKontroll() {
        Joogipudel uusJook = testVaat.taidaPudel(testPudel);
        assertEquals("Coca Cola", uusJook.sisu.nimi);
    }

    @Test
    public void koguseKontroll() {
        Joogipudel uusJook = testVaat.taidaPudel(testPudel);
        assertEquals(2250.0, testVaat.kogus, 0.0001);
    }

    @Test
    public void tyhiPudeliKontroll() {
        Joogipudel uusJook = testVaatTyhi.taidaPudel(testPudel);
        assertNull(uusJook.sisu);
    }

    @Test
    public void pudeliteKontroll() {
        Joogipudel[] uuedPudelid = testVaat.tyhjendaVaat(testPudel);
        assertEquals(4, uuedPudelid.length);
    }

    @Test
    public void pudeliteKontroll2() {
        Joogipudel[] uuedPudelid = testVaat1l.tyhjendaVaat(testPudel);
        assertEquals(1, uuedPudelid.length);
        assertEquals(250, testVaat1l.kogus, 0.0001);
    }

    @Test
    public void tyhiVaatTyhjendamine() {
        Joogipudel[] uuedPudelid = testVaatTyhi.tyhjendaVaat(testPudel);
        assertEquals(0, uuedPudelid.length);
    }

    @Test
    public void pudeliteHind() {
        Joogipudel[] uuedPudelid = testVaat.tyhjendaVaat(testPudel);
        double sum = 0;
        for (int i = 0; i < uuedPudelid.length; ++i) {
            sum += uuedPudelid[i].leiaOmahind();
        }
        assertEquals(2.96, sum, 0.0001);
    }

    @Test
    public void kastiSuurus() {
        assertEquals(0, testKast.praeguneKastiSisu());
    }

    @Test
    public void kastiLisamine() {
        testVaat.tyhjendaVaatKasti(testPudel, testKast);
        assertEquals(4, testKast.kastiCount);
        assertEquals("Coca Cola", testKast.kastiSisu[testKast.praeguneKastiSisu() - 1].sisu.nimi);
    }

    @Test
    public void kastiMass() {
        testVaat.tyhjendaVaatKasti(testPudel, testKast);
        assertEquals(3860, testKast.arvutaMass(), 0.001);
    }

    @Test
    public void kastiHind() {
        testVaat.tyhjendaVaatKasti(testPudel, testKast);
        assertEquals(3.16, testKast.arvutaHind(), 0.0001);
    }

    @Test
    public void kastiLisamineEdge() {
        testVaat.tyhjendaVaatKasti(testPudel, neljanePakk);
        assertEquals(3.01, neljanePakk.arvutaHind(), 0.001);
        assertEquals(3760.01, neljanePakk.arvutaMass(), 0.001);
    }

    @Test
    public void kastiLisamineOver() {
        testVaatalFull.tyhjendaVaatKasti(testPudel, neljanePakk);
        assertEquals(null, neljanePakk.kastiSisu[0]);
        assertEquals(0.01, neljanePakk.arvutaMass(), 0.001);
        assertEquals(0.05, neljanePakk.arvutaHind(), 0.001);
    }


}
