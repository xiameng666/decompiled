import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import java.util.concurrent.Callable;

public final class alje implements Callable {
    public final SettingsChimeraActivity a;

    public alje(SettingsChimeraActivity settingsChimeraActivity0) {
        this.a = settingsChimeraActivity0;
    }

    @Override
    public final Object call() {
        Account[] arr_account;
        try {
            SettingsChimeraActivity settingsChimeraActivity0 = this.a;
            arr_account = new Account[0];
            arr_account = new adgg(settingsChimeraActivity0).e(settingsChimeraActivity0);
        }
        catch(RemoteException | azqj | azqi exception0) {
            a.ae(SettingsChimeraActivity.j.j(), "Can\'t get Google accounts.", exception0);
        }
        Object object0 = null;
        if(arr_account.length > 0) {
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(object0 == null && settingsChimeraActivity0.m.d(account0, gqus.b)) {
                    object0 = account0;
                }
            }
        }
        return object0;
    }
}

