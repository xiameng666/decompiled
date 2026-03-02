import android.graphics.Path.FillType;

public final class qqx implements qql {
    public final Path.FillType a;
    public final String b;
    public final qpv c;
    public final qpy d;
    public final boolean e;
    private final boolean f;

    public qqx(String s, boolean z, Path.FillType path$FillType0, qpv qpv0, qpy qpy0, boolean z1) {
        this.b = s;
        this.f = z;
        this.a = path$FillType0;
        this.c = qpv0;
        this.d = qpy0;
        this.e = z1;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qlx(qkz0, qrf0, this);
    }

    @Override
    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}

