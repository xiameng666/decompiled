public final class qqt implements qql {
    public final String a;
    public final qqh b;
    public final qqh c;
    public final qpw d;
    public final boolean e;

    public qqt(String s, qqh qqh0, qqh qqh1, qpw qpw0, boolean z) {
        this.a = s;
        this.b = qqh0;
        this.c = qqh1;
        this.d = qpw0;
        this.e = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qmf(qkz0, qrf0, this);
    }

    @Override
    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + "}";
    }
}

