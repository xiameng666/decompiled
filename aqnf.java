import android.accounts.Account;
import java.util.concurrent.Callable;

public final class aqnf implements Callable {
    public final Account a;
    public final grkf b;
    public final aqvd c;
    public final aqnb d;

    public aqnf(aqnb aqnb0, Account account0, grkf grkf0, aqvd aqvd0) {
        this.d = aqnb0;
        this.a = account0;
        this.b = grkf0;
        this.c = aqvd0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.d.e(this.a, this.d.c, this.b, this.c));
    }
}

