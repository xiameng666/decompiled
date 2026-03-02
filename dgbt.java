import android.accounts.Account;

public final class dgbt implements Runnable {
    public final dgcp a;
    public final gzdv b;

    public dgbt(dgcp dgcp0, gzdv gzdv0) {
        this.a = dgcp0;
        this.b = gzdv0;
    }

    @Override
    public final void run() {
        gzdv gzdv0 = this.b;
        dgcp dgcp0 = this.a;
        dfsk dfsk0 = dgcp0.b;
        Account account0 = dfsk0.c();
        boolean z = ibuq.m(gzdv0.b, dfsk0.j(account0));
        if(!z) {
            dfsk0.C(gzdv0.b);
        }
        boolean z1 = ibuq.m(gzdv0.d, dfsk0.k(account0));
        boolean z2 = ibuq.m(gzdv0.c, dfsk0.l(account0));
        if(!z1 || !z2) {
            dfsk0.E(gzdv0.c, gzdv0.d);
        }
        if(z && (z2 || z1)) {
            return;
        }
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 16;
        dcpu0.b = 1;
        dcpv dcpv0 = new dcpv(dcpu0);
        dgcp0.f.f(dcpv0);
        dgcp0.d.c(dcpv0);
    }
}

