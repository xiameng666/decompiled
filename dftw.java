import android.accounts.Account;

public final class dftw implements Runnable {
    public final dfud a;
    public final dcpv b;

    public dftw(dfud dfud0, dcpv dcpv0) {
        this.a = dfud0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        dfud dfud0 = this.a;
        Account account0 = dfud0.b.c();
        if(account0 == null) {
            dcvz.a.e().p("Failed to sync contact book: account not set.", new Object[0]);
            return;
        }
        gmbu.t(dfud0.b(account0, false, this.b), new dftx(dfud0), gmap.a);
    }
}

