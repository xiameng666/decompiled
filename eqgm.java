import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class eqgm implements evpz {
    final Account a;
    final CountDownLatch b;

    public eqgm(eqgn eqgn0, Account account0, CountDownLatch countDownLatch0) {
        this.a = account0;
        this.b = countDownLatch0;
        Objects.requireNonNull(eqgn0);
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(evql0.n()) {
            Status status0 = ((KeyRegistrationResult)evql0.j()).b;
            eqgn.b.j("Registration for %s complete %s", new Object[]{this.a, status0});
        }
        else {
            Exception exception0 = evql0.i();
            eqgn.b.j("Registration for %s failed %s", new Object[]{this.a, exception0});
        }
        this.b.countDown();
    }
}

