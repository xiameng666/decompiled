import android.accounts.Account;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IgnoreConsentParams;
import java.util.concurrent.Callable;

public final class dcex implements Callable {
    public final dchp a;
    public final IgnoreConsentParams b;

    public dcex(dchp dchp0, IgnoreConsentParams ignoreConsentParams0) {
        this.a = dchp0;
        this.b = ignoreConsentParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        Account account0 = this.b.a;
        int v = this.b.b;
        boolean z = this.b.c;
        if(nearbySharingChimeraService0.aK(account0, v) == z) {
            return (int)35500;
        }
        ((dfsk)nearbySharingChimeraService0.d.get()).o(account0, v, z);
        return (int)0;
    }
}

