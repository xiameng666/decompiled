import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import java.util.Arrays;
import java.util.List;

public final class gxwj implements OnAccountsUpdateListener {
    public final gxwp a;

    public gxwj(gxwp gxwp0) {
        this.a = gxwp0;
    }

    @Override  // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] arr_account) {
        gxwp gxwp0 = this.a;
        List list0 = Arrays.asList(gxwp0.d);
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(account0 != null && !list0.contains(account0) && account0.type.equals("com.google")) {
                gxwg gxwg0 = new gxwg(gxwp0, account0);
                gxwp0.c.execute(gxwg0);
            }
        }
        gxwp0.d = arr_account;
    }
}

