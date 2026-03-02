import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

public final class fvru extends fvrv implements OnAccountsUpdateListener {
    public final cchj a;
    private static fvru b;
    private final Context c;
    private Account[] d;

    static {
    }

    private fvru(Context context0) {
        this.a = cchj.b(context0);
        this.c = context0;
    }

    public static fvru a(Context context0) {
        synchronized(fvru.class) {
            if(fvru.b == null) {
                fvru.b = new fvru(context0.getApplicationContext());
            }
        }
        return fvru.b;
    }

    @Override  // fvrv
    public final Account[] b() {
        synchronized(this) {
            if(this.d == null) {
                this.a.g(this, null, false);
                try {
                    this.d = acso.m(this.c);
                }
                catch(RemoteException | azqj | azqi unused_ex) {
                    this.d = new Account[0];
                }
            }
        }
        return this.d;
    }

    @Override  // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] arr_account) {
        if(arr_account != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if("com.google".equals(account0.type)) {
                    arrayList0.add(account0);
                }
            }
            Account[] arr_account1 = (Account[])arrayList0.toArray(new Account[0]);
            Arrays.sort(arr_account1, new fvrt());
            synchronized(this) {
                this.d = arr_account1;
            }
        }
    }
}

