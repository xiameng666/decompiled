import android.view.View.OnClickListener;

public final class aanp {
    public final aaln a;
    public final aane b;
    public final lqh c;
    public final lqd d;
    public final lqh e;
    public final aann f;
    public final aaon g;

    public aanp(lps lps0, aaln aaln0, aaon aaon0, aamr aamr0, aane aane0) {
        lqh lqh0 = new lqh();
        this.e = lqh0;
        this.f = new aann(this);
        this.a = aaln0;
        this.g = aaon0;
        this.b = aane0;
        lqh lqh1 = new lqh();
        this.c = lqh1;
        lqh lqh2 = aane0.c;
        this.d = lqh2;
        switch(aaon0.b().c) {
            case 1: 
            case 11100: {
                lqh1.l(aano.a);
                lqh1.o(lqh2, new aang(this));
                aanh aanh0 = new aanh(this);
                fhrx.a(lqh1, aamr0.a, aanh0);
                aani aani0 = new aani(this);
                fhrx.a(lqh1, aamr0.b, aani0);
                break;
            }
            default: {
                lqh1.l(aano.d);
            }
        }
        aanj aanj0 = new aanj(this);
        fhrx.a(lqh0, aaon0.i, aanj0);
        aank aank0 = new aank(this);
        fhrx.a(lqh0, aaln0.f, aank0);
        lsa.a(aaln0.b).g(lps0, new aanl(this));
    }

    public final aatb a() {
        return this.a.d();
    }

    public final void b(int v, int v1, View.OnClickListener view$OnClickListener0) {
        fhru fhru0 = new fhru(new aaqd(v, v1, view$OnClickListener0));
        this.e.l(fhru0);
    }
}

