import android.accounts.Account;

public final class dgam implements Runnable {
    public final dgan a;
    public final dcpv b;

    public dgam(dgan dgan0, dcpv dcpv0) {
        this.a = dgan0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Running certificates syncing task.", new Object[0]);
        dgan dgan0 = this.a;
        dfsk dfsk0 = dgan0.b;
        Account account0 = dfsk0.c();
        if(account0 == null) {
            cunf0.b().p("Skipped certificates syncing task for self share, due to missing account.", new Object[0]);
            return;
        }
        dcpv dcpv0 = this.b;
        dgan0.c(dcpv0);
        if(!dfsk0.T(account0)) {
            dfsk0.K(account0, Boolean.valueOf(dgan0.H(account0, dcpv0)));
        }
    }
}

