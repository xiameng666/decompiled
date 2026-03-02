import android.accounts.Account;

public final class dgac implements Runnable {
    public final dgaf a;
    public final Account b;
    public final boolean c;
    public final dcpv d;

    public dgac(dgaf dgaf0, Account account0, boolean z, dcpv dcpv0) {
        this.a = dgaf0;
        this.b = account0;
        this.c = z;
        this.d = dcpv0;
    }

    @Override
    public final void run() {
        boolean z = this.c;
        Account account0 = this.b;
        dcpv dcpv0 = this.d;
        dgaf dgaf0 = this.a;
        dfsk dfsk0 = dgaf0.a;
        if(!dfsk0.U(account0) || z) {
            dcvz.a.b().h("Running sender certificates uploading task with force = %s.", Boolean.valueOf(z));
            dfsk0.M(account0, dgaf0.h(account0, dcpv0));
        }
        dcvz.a.b().h("Running sender certificates downloading task with force = %s.", Boolean.valueOf(z));
        dfsk0.L(account0, dgaf0.g(account0, dcpv0));
    }
}

