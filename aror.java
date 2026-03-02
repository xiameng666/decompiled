import j..util.Objects;

final class aror implements evqc {
    public final String a;
    public final gmcu b;
    final arot c;

    public aror(arot arot0, String s, gmcu gmcu0) {
        Objects.requireNonNull(arot0);
        this.c = arot0;
        super();
        this.a = s;
        this.b = gmcu0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        aqql aqql0 = arot.a;
        aqql0.g("Failure requesting connection", exception0, new Object[0]);
        int v = (exception0 instanceof aztb) ? ((aztb)exception0).b() : 13;
        arot arot0 = this.c;
        arot0.d.m(v);
        if(((Boolean)arot0.m.mr()).booleanValue()) {
            aqql0.f("Retrying request connection, till retry count is hit", new Object[0]);
            aroq aroq0 = new aroq(this);
            arot0.c.execute(aroq0);
        }
    }
}

