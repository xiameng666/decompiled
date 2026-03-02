import android.accounts.Account;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class aivy implements Callable {
    public final Account a;
    public final long b;

    public aivy(Account account0, long v) {
        this.a = account0;
        this.b = v;
    }

    @Override
    public final Object call() {
        aizw aizw0 = aizx.a();
        azts azts0 = aizz.c(this.b);
        try {
            int v = (int)(((Integer)evrg.n(azts0.jy(this.a.name))));
            ((ggtj)aizz.a.h()).z("Folsom sync status: %s", v);
            aizw0.b(v);
            if(v != 5 && v != 6 && v != 7) {
                aizw0.c(false);
                aizw0.a = 2;
                return aizw0.a();
            }
            aizw0.c(true);
            return aizw0.a();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(aizz.a.i(), "getSyncStatus failed.", exception0);
            aizw0.c(false);
            aizw0.a = 3;
            return aizw0.a();
        }
    }
}

