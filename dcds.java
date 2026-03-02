import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;

public final class dcds implements Runnable {
    public final dchp a;
    public final GetAccountParams b;

    public dcds(dchp dchp0, GetAccountParams getAccountParams0) {
        this.a = dchp0;
        this.b = getAccountParams0;
    }

    @Override
    public final void run() {
        try {
            Account account0 = this.a.e.v();
            GetAccountParams getAccountParams0 = this.b;
            if(account0 != null) {
                getAccountParams0.a.b(account0);
                return;
            }
            getAccountParams0.a.a(35505);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getAccount callback.", new Object[0]);
        }
    }
}

