import java.util.List;

public final class qrc implements qql {
    public final String a;
    public final qpw b;
    public final List c;
    public final qpv d;
    public final qpy e;
    public final qpw f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public qrc(String s, qpw qpw0, List list0, qpv qpv0, qpy qpy0, qpw qpw1, int v, int v1, float f, boolean z) {
        this.a = s;
        this.b = qpw0;
        this.c = list0;
        this.d = qpv0;
        this.e = qpy0;
        this.f = qpw1;
        this.i = v;
        this.j = v1;
        this.g = f;
        this.h = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qmj(qkz0, qrf0, this);
    }
}

