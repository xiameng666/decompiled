public final class bgda implements ibts {
    public final bgds a;
    public final ibts b;
    public final ibth c;
    public final ibth d;
    public final ibtw e;

    public bgda(bgds bgds0, ibts ibts0, ibth ibth0, ibth ibth1, ibtw ibtw0) {
        this.a = bgds0;
        this.b = ibts0;
        this.c = ibth0;
        this.d = ibth1;
        this.e = ibtw0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dnr)object0), "$this$LazyColumn");
        bgds bgds0 = this.a;
        if((bgds0.b instanceof bgaw)) {
            dol.a(((dnr)object0), new gze(0xE6B1638A, true, new bgdb(bgds0, this.b)));
        }
        dol.a(((dnr)object0), new gze(0xEAB66985, true, new bgdc(this.c)));
        if(bgds0.c) {
            dol.a(((dnr)object0), new gze(0xDCD065F3, true, new bgdd(this.d)));
        }
        bgdf bgdf0 = new bgdf(new bgcz(), bgds0.d);
        bgdg bgdg0 = new bgdg(bgds0.d);
        gze gze0 = new gze(2039820996, true, new bgdh(bgds0.d, bgds0, this.e));
        ((dnr)object0).b(bgds0.d.size(), bgdf0, bgdg0, gze0);
        return ibom.a;
    }
}

