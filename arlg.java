public abstract class arlg implements arlk {
    public final arlj a;
    public final gmcg b;
    protected final arem c;
    private static final aqql d;
    private boolean e;
    private boolean f;

    static {
        arlg.d = new aqql(new String[]{"AbstractTransport"});
    }

    protected arlg(arlj arlj0, gmcg gmcg0, arem arem0) {
        this.e = false;
        this.f = false;
        gftb.check(arlj0);
        this.a = arlj0;
        this.b = gmcg0;
        this.c = arem0;
    }

    protected abstract hkyj a();

    protected abstract void b();

    protected abstract void c(byte[] arg1);

    public final void d(int v) {
        arlg.d.d("onConnectionResult(%d)", new Object[]{v});
        hkyj hkyj0 = this.a();
        this.a.q(v, hkyj0);
        if(v == 0) {
            this.f = true;
            hkyj hkyj1 = this.a();
            this.c.h(hkyj1, 2);
        }
    }

    public void e() {
        arlg.d.d("onDisconnected", new Object[0]);
        this.f = false;
        hkyj hkyj0 = this.a();
        this.a.c(hkyj0);
        hkyj hkyj1 = this.a();
        this.c.h(hkyj1, 3);
    }

    @Override  // arlk
    public final void f() {
        aqql aqql0 = arlg.d;
        aqql0.h("shutdown", new Object[0]);
        if(this.e) {
            aqql0.d("Already shut down. Ignoring.", new Object[0]);
            return;
        }
        this.e = true;
        this.b();
    }

    @Override  // arlk
    public final void g(hkyj hkyj0) {
        throw new UnsupportedOperationException("shutdown with connectionType is only supported for MultiTransport.");
    }

    @Override  // arlk
    public final void h(byte[] arr_b) {
        aqql aqql0 = arlg.d;
        aqql0.h("shutdownWithLastPacket", new Object[0]);
        if(this.e) {
            aqql0.d("Already shut down. Ignoring.", new Object[0]);
            return;
        }
        this.e = true;
        this.c(arr_b);
    }

    @Override  // arlk
    public final boolean i() {
        return !this.e && this.f;
    }
}

