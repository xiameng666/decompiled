import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.DeviceAccountId;
import com.google.android.gms.nearby.sharing.internal.GetDeviceAccountIdParams;

public final class dcfn implements Runnable {
    public final dchp a;
    public final GetDeviceAccountIdParams b;

    public dcfn(dchp dchp0, GetDeviceAccountIdParams getDeviceAccountIdParams0) {
        this.a = dchp0;
        this.b = getDeviceAccountIdParams0;
    }

    @Override
    public final void run() {
        try {
            Account account0 = this.a.e.v();
            String s = account0 == null ? "" : gfta.b(account0.name);
            String s1 = ((dfsk)this.a.e.d.get()).g();
            this.b.a.a(new DeviceAccountId(s1, s));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getDeviceAccountId callback.", new Object[0]);
        }
    }
}

