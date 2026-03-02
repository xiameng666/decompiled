import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;
import java.util.concurrent.Semaphore;

public final class ernq implements Runnable {
    final AccountChallengeWebView a;

    public ernq(AccountChallengeWebView accountChallengeWebView0) {
        Objects.requireNonNull(accountChallengeWebView0);
        this.a = accountChallengeWebView0;
        super();
    }

    @Override
    public final void run() {
        this.a.j = new Semaphore(this.a.i - this.a.k);
        this.a.c();
        this.a.a();
    }
}

