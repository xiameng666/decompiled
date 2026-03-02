public final class qrd implements qql {
    public final qpw a;
    public final qpw b;
    public final qpw c;
    public final boolean d;
    public final int e;

    public qrd(int v, qpw qpw0, qpw qpw1, qpw qpw2, boolean z) {
        this.e = v;
        this.a = qpw0;
        this.b = qpw1;
        this.c = qpw2;
        this.d = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qmk(qrf0, this);
    }

    @Override
    public final String toString() {
        return "Trim Path: {start: " + this.a + ", end: " + this.b + ", offset: " + this.c + "}";
    }
}

