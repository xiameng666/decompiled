import android.accounts.Account;
import java.util.List;

public final class dgai implements Runnable {
    public final dgan a;
    public final dcpv b;

    public dgai(dgan dgan0, dcpv dcpv0) {
        this.a = dgan0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        dgan dgan0 = this.a;
        dfsk dfsk0 = dgan0.b;
        Account account0 = dfsk0.c();
        if(account0 == null) {
            return;
        }
        cunk cunk0 = dgan0.c.c(account0, this.b);
        dfsk0.J(account0, Boolean.valueOf(cunk0.d() && dgan0.G(account0, this.b, ((List)cunk0.c()))));
    }
}

