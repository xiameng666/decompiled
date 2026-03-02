import android.accounts.Account;

public final class bpjh implements glzn {
    public final bpji a;
    public final boolean b;
    public final gtas c;
    public final Account d;

    public bpjh(bpji bpji0, boolean z, gtas gtas0, Account account0) {
        this.a = bpji0;
        this.b = z;
        this.c = gtas0;
        this.d = account0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(this.b && bouv.h(this.c)) {
            gdta gdta0 = gdta.g(gdtf.k(((bpik)this.a.b).e.f(), new bpfq(((bpik)this.a.b), this.d), ((bpik)this.a.b).m));
            bpiw bpiw0 = new bpiw();
            return gdta0.f(Throwable.class, bpiw0, gmap.a).h(new bpix(((gfsx)object0)), gmap.a);
        }
        return gmbu.i(((gfsx)object0));
    }
}

