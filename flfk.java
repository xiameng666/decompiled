public final class flfk implements Runnable {
    public final flfv a;
    public final fmga b;
    public final flub c;

    public flfk(flfv flfv0, fmga fmga0, flub flub0) {
        this.a = flfv0;
        this.b = fmga0;
        this.c = flub0;
    }

    @Override
    public final void run() {
        flit flit0 = (flit)this.a.f;
        flgk flgk0 = new flgk(flit0, this.a.b, this.b);
        flit0.b.d(flgk0);
        flgv flgv0 = new flgv(flit0, this.a.b, this.b, this.c.b);
        flit0.m.post(flgv0);
    }
}

