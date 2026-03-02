import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

public final class ejtg implements OnAccountsUpdateListener {
    public static final int a;
    private final Context b;

    static {
        bboh.b("RemindersAccount", bbcu.s);
    }

    public ejtg(Context context0) {
        this.b = context0;
    }

    @Override  // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] arr_account) {
        new ejtf(this, this.b, arr_account).execute(new Void[0]);
    }
}

