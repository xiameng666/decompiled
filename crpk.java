public final class crpk implements Runnable {
    public final crpl a;

    public crpk(crpl crpl0) {
        this.a = crpl0;
    }

    @Override
    public final void run() {
        crpl crpl0 = this.a;
        crpq crpq0 = crpl0.c.b;
        crpq0.n();
        crpq0.aJ().j.a("Application going to the background");
        crpq0.ap().r.a(true);
        crpq0.r(true);
        if(!crpq0.am().w()) {
            crpq0.s(false, false, crpl0.b);
            crpq0.d.d();
        }
        crpq0.aJ().i.b("Application backgrounded at: timestamp_millis", Long.valueOf(crpl0.a));
        crni crni0 = crpq0.h();
        crni0.n();
        crni0.m();
        crni0.a();
        croz croz0 = crni0.k();
        croz0.n();
        croz0.a();
        if(!croz0.F() || croz0.aq().k() >= 242600) {
            croz croz1 = crni0.k();
            croz1.n();
            croz1.a();
            croz1.x(new crog(croz1, croz1.q(true)));
        }
        if(crpq0.am().t(crif.aA)) {
            long v = crpq0.aq().Z("com.google.android.gms", null) ? 1000L : crpq0.am().j("com.google.android.gms", crif.D);
            crpq0.aJ().k.b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(v));
            crpq0.i().s(v);
        }
    }
}

