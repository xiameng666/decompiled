public final class jeu implements Comparable {
    public static final jeu a;
    public static final jeu b;
    public static final jeu c;
    public static final jeu d;
    public static final jeu e;
    public static final jeu f;
    public static final jeu g;
    public static final jeu h;
    public static final jeu i;
    public static final jeu j;
    public static final jeu k;
    public final int l;
    private static final jeu m;
    private static final jeu n;
    private static final jeu o;

    static {
        jeu jeu0 = new jeu(100);
        jeu.m = jeu0;
        jeu jeu1 = new jeu(200);
        jeu.n = jeu1;
        jeu jeu2 = new jeu(300);
        jeu.o = jeu2;
        jeu jeu3 = new jeu(400);
        jeu.a = jeu3;
        jeu jeu4 = new jeu(500);
        jeu.b = jeu4;
        jeu jeu5 = new jeu(600);
        jeu.c = jeu5;
        jeu jeu6 = new jeu(700);
        jeu.d = jeu6;
        jeu jeu7 = new jeu(800);
        jeu.e = jeu7;
        jeu jeu8 = new jeu(900);
        jeu.f = jeu8;
        jeu.g = jeu2;
        jeu.h = jeu3;
        jeu.i = jeu4;
        jeu.j = jeu5;
        jeu.k = jeu6;
        ibpo.g(new jeu[]{jeu0, jeu1, jeu2, jeu3, jeu4, jeu5, jeu6, jeu7, jeu8});
    }

    public jeu(int v) {
        this.l = v;
        if(v > 0 && v < 1001) {
            return;
        }
        jie.a(("Font weight can be in range [1, 1000]. Current value: " + v));
    }

    public final int a(jeu jeu0) {
        return ibuq.a(this.l, jeu0.l);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((jeu)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jeu) ? this.l == ((jeu)object0).l : false;
    }

    @Override
    public final int hashCode() {
        return this.l;
    }

    @Override
    public final String toString() {
        return "FontWeight(weight=" + this.l + ')';
    }
}

