import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ddki {
    public final Context a;
    private static ddki b;

    private ddki(Context context0) {
        this.a = context0;
    }

    public static ddki a(Context context0) {
        synchronized(ddki.class) {
            if(ddki.b == null) {
                ddki.b = new ddki(context0.getApplicationContext());
            }
        }
        return ddki.b;
    }

    public final evql b(Account account0) {
        fpfv fpfv0 = ddki.g(this.a, account0);
        gmcg gmcg0 = cuui.d();
        evqp evqp0 = new evqp();
        gmcg0.execute(new ddke(this, account0, evqp0));
        gmcg0.shutdown();
        gmcg gmcg1 = cuui.d();
        ddkf ddkf0 = new ddkf(fpfv0);
        return evqp0.a.f(gmcg1, ddkf0).f(cuui.d(), (/* MISSING LAMBDA PARAMETER */) -> cuuc.d(fpfv0.e(), hvqs.r()).f(cuui.d(), new ddkc(fpfv0))).d(cuui.d(), new ddkh(this));
    }

    public final evql c(Account account0) {
        evqp evqp0 = new evqp();
        cuui.d().execute(new ddkd(this, account0, evqp0));
        return evqp0.a;
    }

    public final evql d(Account account0) {
        return ddki.f(ddki.g(this.a, account0));
    }

    public final boolean e(Account account0) {
        try {
            boolean z = ((Boolean)evrg.o(this.d(account0), hvqs.a.aT().cB(), TimeUnit.MILLISECONDS)).booleanValue();
            dcvz.a.b().h("%s to upload device contacts.", (z ? "Consented" : "Not consented"));
            return z;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            dcvz.a.e().f(exception0).p("Cannot verify Device Contacts: got exception.", new Object[0]);
            return false;
        }
    }

    // Detected as a lambda impl.
    public static evql f(fpfv fpfv0) {
        return cuuc.d(fpfv0.e(), hvqs.r()).f(cuui.d(), new ddkc(fpfv0));
    }

    static fpfv g(Context context0, Account account0) {
        return cusd.a(context0).a(account0);
    }
}

