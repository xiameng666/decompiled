public final class capc extends capd {
    public final Long a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final Long f;

    public capc(caoz caoz0) {
        Long long0 = caoz0.b;
        super(caoz0.a);
        this.a = long0;
        this.b = caoz0.c;
        this.c = caoz0.d;
        this.d = caoz0.e;
        this.e = caoz0.f;
        this.f = caoz0.g;
    }

    public final Boolean a() {
        return this.a == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }

    public final boolean b() {
        return this.d != null;
    }

    public final boolean c() {
        return this.f != null;
    }
}

