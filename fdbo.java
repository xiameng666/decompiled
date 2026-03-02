import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.util.Log;

public final class fdbo implements OnAccountsUpdateListener {
    public final fdch a;

    public fdbo(fdch fdch0) {
        this.a = fdch0;
    }

    @Override  // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] arr_account) {
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "Accounts updated. There are " + arr_account.length + " accounts");
        }
        fdch fdch0 = this.a;
        fdch0.p();
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(account0.type.equals("com.google")) {
                ggdy0.i(account0);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        for(Object object0: fdch0.k) {
            ((fdnd)object0).c(gged0);
        }
    }
}

