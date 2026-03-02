import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class dftu implements Runnable {
    public final dfud a;
    public final dcpv b;

    public dftu(dfud dfud0, dcpv dcpv0) {
        this.a = dfud0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Force running contacts and certificates syncing task.", new Object[0]);
        dfud dfud0 = this.a;
        dfsk dfsk0 = dfud0.b;
        Account account0 = dfsk0.c();
        if(account0 == null) {
            cunf0.e().p("Failed to sync contacts and certificates: account not set.", new Object[0]);
        }
        else {
            dcpv dcpv0 = this.b;
            dgao dgao0 = (dgao)dfud0.d;
            dgao0.n().F(dcpv0);
            dfud0.d.c(dcpv0);
            List list0 = new ArrayList();
            if(dfsk0.d(account0).f != 0) {
                list0 = dgao0.n().w(account0);
            }
            dbxx dbxx0 = dfud.g(dfsk0.d(account0).f) ? dfud0.c.b(account0) : dbxx.a;
            if(dfud0.e.p(account0, dbxx0, list0, dcpv0)) {
                dfsk0.I(account0, true);
                return;
            }
        }
        cunf0.e().p("Failed to force sync contacts and certificates.", new Object[0]);
    }
}

