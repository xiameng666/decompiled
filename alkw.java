import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextChimeraActivity;

public final class alkw implements Runnable {
    public final SettingsMaterialNextChimeraActivity a;
    public final Account b;

    public alkw(SettingsMaterialNextChimeraActivity settingsMaterialNextChimeraActivity0, Account account0) {
        this.a = settingsMaterialNextChimeraActivity0;
        this.b = account0;
    }

    @Override
    public final void run() {
        SettingsMaterialNextChimeraActivity settingsMaterialNextChimeraActivity0 = this.a;
        if(settingsMaterialNextChimeraActivity0.isDestroyed()) {
            return;
        }
        Account account0 = this.b;
        if(account0 != null && (settingsMaterialNextChimeraActivity0.l != null && account0.equals(settingsMaterialNextChimeraActivity0.l)) || account0 == null && settingsMaterialNextChimeraActivity0.l == null) {
            ((ggtj)SettingsMaterialNextChimeraActivity.j.h()).x("Selected account matched initial account check, skipping processing");
            return;
        }
        if(account0 == null) {
            ((ggtj)SettingsMaterialNextChimeraActivity.j.h()).x("Initial account check did not find any with BeTo enabled, skipping processing");
            return;
        }
        ((ggtj)SettingsMaterialNextChimeraActivity.j.h()).x("Selected account was updated from initial account check");
        settingsMaterialNextChimeraActivity0.l = account0;
        settingsMaterialNextChimeraActivity0.n.a(account0, settingsMaterialNextChimeraActivity0);
    }
}

