import android.accounts.Account;

public final class bpfk implements glzn {
    public final bpik a;

    public bpfk(bpik bpik0) {
        this.a = bpik0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fqxm fqxm0 = ((fqzl)object0).j;
        if(fqxm0 == null) {
            fqxm0 = fqxm.a;
        }
        bpik bpik0 = this.a;
        gfsx gfsx0 = bpik0.c(fqxm0);
        if(!gfsx0.i()) {
            return gmbx.a;
        }
        Account account0 = (Account)gfsx0.d();
        bnla bnla0 = ((boou)bpik0.d).a(account0).a();
        fqxm fqxm1 = ((fqzl)object0).j;
        if(fqxm1 == null) {
            fqxm1 = fqxm.a;
        }
        return bnla0.j((fqxm1.d == null ? gsyz.a : fqxm1.d), gszv.c);
    }
}

