import android.accounts.Account;

public final class bpid implements glzn {
    public final bpik a;
    public final Account b;
    public final gtas c;

    public bpid(bpik bpik0, Account account0, gtas gtas0) {
        this.a = bpik0;
        this.b = account0;
        this.c = gtas0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = ((bnvj)object0).l;
        if(v == 0) {
            throw null;
        }
        gtas gtas0 = this.c;
        Account account0 = this.b;
        bpik bpik0 = this.a;
        if(v == 2) {
            int v1 = bpik.F(gtas0);
            return bpik0.D(account0, frae.b, gged_interceptors.l(Integer.valueOf(boeb.b)), boeb.d, gged_interceptors.l(Integer.valueOf(boeb.o)), gged_interceptors.l(Integer.valueOf(boeb.p)), v1);
        }
        int v2 = bpik.F(gtas0);
        return bpik0.D(account0, frae.b, gged_interceptors.l(Integer.valueOf(boeb.e)), boeb.m, gged_interceptors.l(Integer.valueOf(boeb.o)), gged_interceptors.l(Integer.valueOf(boeb.p)), v2);
    }
}

