import android.accounts.Account;
import java.util.concurrent.Callable;

public final class aljp implements Callable {
    public final Account a;

    public aljp(Account account0) {
        this.a = account0;
    }

    @Override
    public final Object call() {
        return (Boolean)alol.a(this.a.name).f().get();
    }
}

