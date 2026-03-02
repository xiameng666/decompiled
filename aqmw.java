import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Callable;

public final class aqmw implements Callable {
    public final aqmx a;
    public final Context b;
    public final aqvd c;

    public aqmw(aqmx aqmx0, Context context0, aqvd aqvd0) {
        this.a = aqmx0;
        this.b = context0;
        this.c = aqvd0;
    }

    @Override
    public final Object call() {
        Account[] arr_account;
        try {
            arr_account = new adgg(this.b).e(this.b);
        }
        catch(RemoteException | azqj | azqi exception0) {
            aqmx.a.g("Error getting device accounts: ", exception0, new Object[0]);
            arr_account = null;
        }
        if(arr_account != null && arr_account.length != 0) {
            gged_interceptors gged0 = gged_interceptors.m(aqfx.g, aqfx.c);
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                aqfx aqfx0 = (aqfx)gged0.get(v2);
                aqni aqni0 = (aqni)this.a.b.get(aqfx0);
                if(aqni0 != null) {
                    aqft aqft0 = aqni0.b(this.c);
                    if((aqft0.b & 2) != 0) {
                        String s = aqft0.d;
                        for(int v = 0; v < arr_account.length; ++v) {
                            Account account0 = arr_account[v];
                            if(s.equals(account0.name)) {
                                return gfsx.m(account0);
                            }
                        }
                        return gfqx.a;
                    }
                }
            }
            return gfsx.m(arr_account[0]);
        }
        return gfqx.a;
    }
}

