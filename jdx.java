public final class jdx {
    public static jdy a(String s, jeu jeu0, int v, jes jes0, int v1) {
        if((v1 & 2) != 0) {
            jeu0 = jeu.h;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            jes0 = new jes(new jep[0]);
        }
        return new jdw(s, jeu0, v, jes0);
    }
}

