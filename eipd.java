import j..util.Objects;

final class eipd {
    final long a;
    final String b;
    final long c;
    final Object d;
    final boolean e;
    final eiph f;
    private long g;

    public eipd(eiph eiph0, long v, String s, long v1, Object object0, boolean z) {
        Objects.requireNonNull(eiph0);
        this.f = eiph0;
        super();
        this.g = -1L;
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = object0;
        this.e = z;
    }

    final long a(eiop eiop0) {
        long v = this.g;
        if(v == -1L) {
            v = eiop0.c("INSERT INTO flag_overrides(config_package_id, account_id, active, name, type, value)\nVALUES (?, ?, ?, ?, ?, ?);\n").g(new Object[]{((long)this.f.a), ((long)this.a), (this.e ? ((int)1) : null), this.b, ((long)this.c), this.d}).c();
            this.g = v;
        }
        return v;
    }
}

