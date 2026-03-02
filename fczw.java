import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;
import java.util.ArrayList;

public final class fczw implements Runnable {
    public final Context a;
    public final evqp b;

    public fczw(Context context0, evqp evqp0) {
        this.a = context0;
        this.b = evqp0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList();
        Context context0 = this.a;
        evqp evqp0 = this.b;
        try {
            Account[] arr_account = new adgg(context0).e(context0);
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(acso.c(context0, new HasCapabilitiesRequest(account0, new String[]{gqkh.a.a})) == 1) {
                    arrayList0.add(account0);
                }
            }
            evqp0.c(arrayList0);
        }
        catch(RemoteException | azqj | azqi | acse | IOException exception0) {
            Log.e("wearable.Accounts", "Failed to fetch accounts from device", exception0);
            evqp0.d(exception0);
        }
    }
}

