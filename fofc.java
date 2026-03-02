import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

final class fofc {
    public boolean a;
    public final OnAccountsUpdateListener b;
    public final AccountManager c;

    public fofc(Context context0, fodv fodv0, OnAccountsUpdateListener onAccountsUpdateListener0) {
        this.a = false;
        this.b = onAccountsUpdateListener0;
        this.c = AccountManager.get(context0.getApplicationContext());
        if(jwe.a(context0, "android.permission.GET_ACCOUNTS") != 0) {
            gdtf.l(gdtf.h(new fodw(((fodz)fodv0)), ((fodz)fodv0).c), new fofb(), gmap.a);
        }
    }
}

