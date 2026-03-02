import android.accounts.Account;
import java.util.concurrent.Callable;

public final class alkb implements Callable {
    public final alkl a;
    public final Account b;

    public alkb(alkl alkl0, Account account0) {
        this.a = alkl0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        return this.b == null ? Boolean.valueOf(false) : Boolean.valueOf(this.a.e.d(this.b, gqus.n));
    }
}

