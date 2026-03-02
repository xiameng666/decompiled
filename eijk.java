import java.util.List;

public final class eijk implements eijf {
    public final eijl a;
    public final eijl b;
    public final Object c;
    private static eijk d;
    private final gmcg e;

    public eijk(gmcg gmcg0) {
        eijl eijl0 = new eijl(gmcg0);
        eijl eijl1 = new eijl(gmcg0);
        super();
        this.c = new Object();
        this.e = gmcg0;
        this.a = eijl0;
        this.b = eijl1;
    }

    @Override  // eijf
    public final eiji a() {
        throw null;
    }

    @Override  // eijf
    public final List b() {
        throw null;
    }

    @Override  // eijf
    public final void c() {
        synchronized(this) {
            new bblp(1, 10).execute(new eijj(this));
        }
    }

    @Override  // eijf
    public final void d() {
        throw null;
    }

    @Override  // eijf
    public final void e(String s) {
        throw null;
    }

    public static eijk f() {
        synchronized(eijk.class) {
            if(eijk.d == null) {
                eijk.d = new eijk(new bblp(0x7FFFFFFF, 10));
            }
        }
        return eijk.d;
    }
}

