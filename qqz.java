public final class qqz implements qql {
    public final String a;
    public final qqc b;
    public final boolean c;
    private final int d;

    public qqz(String s, int v, qqc qqc0, boolean z) {
        this.a = s;
        this.d = v;
        this.b = qqc0;
        this.c = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qmi(qkz0, qrf0, this);
    }

    @Override
    public final String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.d + "}";
    }
}

