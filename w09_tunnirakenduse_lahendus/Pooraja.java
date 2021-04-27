package v1;

public class Pooraja implements Lylitatav {
    Lylitatav sisu;

    public Pooraja(Lylitatav l) {
        this.sisu = l;
    }

    public void seisund(boolean sees) {
        this.sisu.seisund(!sees);
    }
}
