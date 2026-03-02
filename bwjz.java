import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

final class bwjz implements OnAccountsUpdateListener {
    public final cchj a;
    public final bwmx b;
    public static final int c;
    private final bwzn d;

    public bwjz(Context context0, bwzn bwzn0, bwmx bwmx0) {
        this.d = bwzn0;
        this.b = bwmx0;
        this.a = cchj.b(context0);
    }

    @Override  // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] arr_account) {
        bwjy bwjy0 = new bwjy(this, gltq.c, arr_account);
        this.d.h(bwjy0);
    }
}

