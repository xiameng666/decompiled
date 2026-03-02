import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;

public final class aljr implements Runnable {
    public final aljs a;
    public final Account b;

    public aljr(aljs aljs0, Account account0) {
        this.a = aljs0;
        this.b = account0;
    }

    @Override
    public final void run() {
        Account account0 = this.b;
        SettingsChimeraActivity settingsChimeraActivity0 = this.a.c;
        if(!account0.name.equals(settingsChimeraActivity0.n.d())) {
            settingsChimeraActivity0.n.i(account0.name);
        }
    }
}

