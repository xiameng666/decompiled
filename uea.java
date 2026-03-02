import jeb.synthetic.FIN;

final class uea implements ueb, uqw {
    private static final kav a;
    private final uqz b;
    private ueb c;
    private boolean d;
    private boolean e;

    static {
        uea.a = uqy.a(20, new udz());
    }

    public uea() {
        this.b = new uqz();
    }

    @Override  // ueb
    public final int a() {
        return this.c.a();
    }

    @Override  // ueb
    public final Class b() {
        return this.c.b();
    }

    @Override  // ueb
    public final Object c() {
        return this.c.c();
    }

    static uea d(ueb ueb0) {
        uea uea0 = (uea)uea.a.a();
        uqo.f(uea0);
        uea0.e = false;
        uea0.d = true;
        uea0.c = ueb0;
        return uea0;
    }

    @Override  // ueb
    public final void e() {
        synchronized(this) {
            this.b.a();
            this.e = true;
            if(!this.d) {
                this.c.e();
                this.c = null;
                uea.a.b(this);
            }
        }
    }

    final void f() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.b.a();
        if(this.d) {
            this.d = false;
            if(this.e) {
                this.e();
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }

    @Override  // uqw
    public final uqz fx() {
        return this.b;
    }
}

