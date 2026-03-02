import android.accounts.Account;

public final class bpfw implements glzn {
    public final bpik a;
    public final gfsx b;
    public final fqzl c;

    public bpfw(bpik bpik0, gfsx gfsx0, fqzl fqzl0) {
        this.a = bpik0;
        this.b = gfsx0;
        this.c = fqzl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        bpik bpik0 = this.a;
        fqzl fqzl0 = this.c;
        if(((Boolean)object0).booleanValue()) {
            bpik0.t(((Account)this.b.d()), (fqzl0.c == 22 ? ((fqza)fqzl0.d) : fqza.a), false);
            return gmbx.a;
        }
        return bpik0.e(fqzl0, true, gfqx.a);
    }
}

