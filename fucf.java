public final class fucf {
    public final fryk a;
    public final fryv b;
    public final fryv c;
    public final boolean d;
    public final fryv e;

    public fucf(fryk fryk0, fryv fryv0, fryv fryv1, boolean z, fryv fryv2) {
        this.a = fryk0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = z;
        this.e = fryv2;
    }

    public fucf(fryk fryk0, fryv fryv0, boolean z, fryv fryv1, int v) {
        if(1 == (v & 1)) {
            fryk0 = null;
        }
        this(fryk0, null, fryv0, ((boolean)(((int)z) | ((v & 8) == 0 ? 1 : 0) ^ 1)), ((v & 16) == 0 ? fryv1 : null));
    }
}

