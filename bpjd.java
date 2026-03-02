import android.accounts.Account;

public final class bpjd implements glzn {
    public final bpji a;
    public final boolean b;
    public final gtas c;
    public final Account d;
    public final boov e;

    public bpjd(bpji bpji0, boov boov0, boolean z, gtas gtas0, Account account0) {
        this.a = bpji0;
        this.e = boov0;
        this.b = z;
        this.c = gtas0;
        this.d = account0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gdta gdta0 = gdta.g(this.e.c().c((this.b ? bnzj.f : bnzj.g), true)).h(new bpjf(((gfsx)object0)), gmap.a);
        bpjg bpjg0 = new bpjg(this.b, ((gfsx)object0));
        gdta gdta1 = gdta0.f(bnyt.class, bpjg0, this.a.e).i(new bpjh(this.a, this.b, this.c, this.d), this.a.e);
        bpiv bpiv0 = new bpiv(((gfsx)object0));
        return gdta1.e(Throwable.class, bpiv0, gmap.a);
    }
}

