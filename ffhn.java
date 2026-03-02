import android.accounts.Account;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.FastPairDeviceInfo;

public final class ffhn implements evqf {
    public final fflv a;
    public final fdiy b;
    public final String c;
    public final Account d;
    public final String e;

    public ffhn(fflv fflv0, fdiy fdiy0, String s, Account account0, String s1) {
        this.a = fflv0;
        this.b = fdiy0;
        this.c = s;
        this.d = account0;
        this.e = s1;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fdiy fdiy0 = this.b;
        if(((FastPairDeviceInfo)object0) == null) {
            try {
                Log.e("WearableService", "Empty model ID obtained from fast pair");
                fdiy0.a(new Status(0xFAB));
            }
            catch(RemoteException unused_ex) {
            }
            return;
        }
        this.a.bc(fdiy0, this.c, this.d, this.e, ((FastPairDeviceInfo)object0).a);
    }
}

