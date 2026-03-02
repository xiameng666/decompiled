import android.accounts.AccountManager;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;

public final class gaup {
    public static GoogleAccountStateSnapshot a(AccountManager accountManager0) {
        GoogleAccountStateSnapshot googleAccountStateSnapshot0 = new GoogleAccountStateSnapshot();
        googleAccountStateSnapshot0.a = accountManager0.getAccountsByType("com.google");
        return googleAccountStateSnapshot0;
    }
}

