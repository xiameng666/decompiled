import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraContentProvider;
import j..util.Objects;
import java.util.concurrent.Callable;

final class alkh implements Callable {
    final Account a;
    final alkl b;

    public alkh(alkl alkl0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(alkl0);
        this.b = alkl0;
        super();
    }

    @Override
    public final Object call() {
        Account account0 = this.a;
        return account0 == null ? null : SettingsChimeraContentProvider.a(this.b.d, account0.name);
    }
}

