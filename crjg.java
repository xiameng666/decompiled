import j..util.Objects;

public final class crjg {
    final crji a;
    private final int b;
    private final boolean c;
    private final boolean d;

    public crjg(crji crji0, int v, boolean z, boolean z1) {
        Objects.requireNonNull(crji0);
        this.a = crji0;
        super();
        this.b = v;
        this.c = z;
        this.d = z1;
    }

    public final void a(String s) {
        this.a.h(this.b, this.c, this.d, s, null, null, null);
    }

    public final void b(String s, Object object0) {
        this.a.h(this.b, this.c, this.d, s, object0, null, null);
    }

    public final void c(String s, Object object0, Object object1) {
        this.a.h(this.b, this.c, this.d, s, object0, object1, null);
    }

    public final void d(String s, Object object0, Object object1, Object object2) {
        this.a.h(this.b, this.c, this.d, s, object0, object1, object2);
    }
}

