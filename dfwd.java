public final class dfwd implements Runnable {
    public final dfzz a;
    public final gmcu b;

    public dfwd(dfzz dfzz0, gmcu gmcu0) {
        this.a = dfzz0;
        this.b = gmcu0;
    }

    @Override
    public final void run() {
        this.a.av();
        ((dgao)this.a.t).n().D();
        this.a.u.d();
        this.a.ae.a.g();
        cjpa cjpa0 = cjqh.a(this.a.ae.b.a, "nearby", "nearbysharing:provider:contacts:state", 0).c();
        cjpa0.d();
        cjpd.f(cjpa0);
        this.a.l.x();
        this.a.y.i();
        this.a.k.b();
        this.b.q(null);
        dcvz.a.b().p("NearbySharingProvider has been reset", new Object[0]);
    }
}

