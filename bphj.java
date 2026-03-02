import android.accounts.Account;

public final class bphj implements glzn {
    public final bpik a;
    public final boolean b;
    public final Account c;
    public final boolean d;
    public final fqzl e;
    public final boov f;

    public bphj(bpik bpik0, boolean z, Account account0, boolean z1, fqzl fqzl0, boov boov0) {
        this.a = bpik0;
        this.b = z;
        this.c = account0;
        this.d = z1;
        this.e = fqzl0;
        this.f = boov0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbx.a;
        }
        return this.b ? gdta.g(this.a.e.h()).i(new bpew(this.a, this.b, ((gfsx)object0), this.c, this.d, this.e, this.f), this.a.m) : gdta.g(gmbu.i(hfyn.c)).i(new bpew(this.a, this.b, ((gfsx)object0), this.c, this.d, this.e, this.f), this.a.m);
    }
}

