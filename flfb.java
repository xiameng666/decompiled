public final class flfb implements Runnable {
    public final flfv a;
    public final fmga b;
    public final flub c;

    public flfb(flfv flfv0, fmga fmga0, flub flub0) {
        this.a = flfv0;
        this.b = fmga0;
        this.c = flub0;
    }

    @Override
    public final void run() {
        flfv flfv0 = this.a;
        fmga fmga0 = this.b;
        flfv0.u.f(fmga0.c, fmga0.b, fmga0.d);
        int v = fmga0.f.a();
        flub flub0 = this.c;
        fmhr fmhr0 = flub0.a;
        if(v == 5) {
            flfv0.j.put(fmhr0.c, fmhr0);
            flfv0.k(fmhr0);
            fmai fmai0 = fmaj.a();
            fmai0.g(10020);
            fmai0.n(flfv0.b.c().f());
            fmai0.o(flfv0.b.d().toStringUtf8());
            fmai0.p(fmhr0.c);
            fmaj fmaj0 = fmai0.a();
            flfv0.h.b(fmaj0);
        }
        else {
            if(fmga0.k.a() == fmfz.b) {
                flfv0.d.W(fmga0);
            }
            else {
                flfv0.d.V(fmga0);
            }
            String s = fmga0.a;
            if(fmhr0 == null) {
                fmhr fmhr1 = (fmhr)flfv0.j.get(s);
                if(fmhr1 != null) {
                    flfv0.k(fmhr1);
                }
            }
            else {
                flfv0.d.m(fmhr0);
            }
        }
        flfk flfk0 = new flfk(flfv0, fmga0, flub0);
        flfv0.p.post(flfk0);
    }
}

