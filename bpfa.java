import android.accounts.Account;

public final class bpfa implements glzm {
    public final bpik a;
    public final Account b;
    public final fqza c;
    public final gtas d;
    public final boolean e;
    public final boolean f;

    public bpfa(bpik bpik0, Account account0, fqza fqza0, gtas gtas0, boolean z, boolean z1) {
        this.a = bpik0;
        this.b = account0;
        this.c = fqza0;
        this.d = gtas0;
        this.e = z;
        this.f = z1;
    }

    @Override  // glzm
    public final gmcd a() {
        int v;
        bpik bpik0 = this.a;
        fqza fqza0 = this.c;
        boolean z = true;
        bpik0.t(this.b, fqza0, true);
        bpik0.o.a();
        if(fqza0.c == 2) {
            v = fqyv.a(((Integer)fqza0.d).intValue());
            if(v == 0) {
                v = 1;
            }
        }
        else {
            v = 1;
        }
        if(!this.e || this.f) {
            z = false;
        }
        return bpik0.p(((fqyi)((gftm)bpik.C(v, this.d, z)).a));
    }
}

