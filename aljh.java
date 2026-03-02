import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import java.util.concurrent.Callable;

public final class aljh implements Callable {
    public final SettingsChimeraActivity a;
    public final Account b;

    public aljh(SettingsChimeraActivity settingsChimeraActivity0, Account account0) {
        this.a = settingsChimeraActivity0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.b != null && this.a.m.d(this.b, gqus.b));
    }
}

