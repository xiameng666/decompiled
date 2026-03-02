import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutionException;

public final class aqpj {
    public static final baun a;
    public final aqpi b;
    public final aqji c;
    private final Context d;

    static {
        aqpj.a = aqql.a(aqpj.class.getName());
    }

    public aqpj(Context context0) {
        this.d = context0;
        this.b = new aqpi(context0);
        this.c = new aqji(context0);
    }

    public final boolean a() {
        if(!hqil.a.j().Q()) {
            gmcd gmcd0 = this.b.a();
            String s = null;
            try {
                String s1 = (String)((glyq)gmcd0).u();
            }
            catch(InterruptedException | ExecutionException exception0) {
                aqpj.a.g("Failed to get device status from the data store", exception0, new Object[0]);
                s1 = null;
            }
            if(s1 != null && !s1.isEmpty()) {
                aqpj.a.j("Sticky flag is on and device was ETU due to account : " + s1, new Object[0]);
                return true;
            }
            try {
                gged_interceptors gged0 = gged_interceptors.k(new adgg(this.d).e(this.d));
            }
            catch(RemoteException | azqj | azqi exception1) {
                aqpj.a.g("Error getting device accounts: ", exception1, new Object[0]);
                gged0 = ggna.a;
            }
            int v = 0;
            while(v < ((ggna)gged0).c) {
                Account account0 = (Account)gged0.get(v);
                gmcd gmcd1 = glzd.f(this.c.a.a(), new aqjg(account0), gmap.a);
                try {
                    if(((Boolean)((glyq)gmcd1).u()).booleanValue()) {
                        s = account0.name;
                    }
                    else {
                        goto label_27;
                    }
                    break;
                }
                catch(InterruptedException | ExecutionException exception2) {
                    aqpj.a.g("Failed to get ETU account status for account: " + account0.name, exception2, new Object[0]);
                    ++v;
                    continue;
                }
            label_27:
                ++v;
            }
            if(s != null) {
                gmcd gmcd2 = this.b.b(s);
                try {
                    ((glyq)gmcd2).u();
                }
                catch(InterruptedException | ExecutionException exception3) {
                    aqpj.a.g("Failed to save device ETU account", exception3, new Object[0]);
                }
                aqpj.a.j("Sticky flag is off and device was ETU due to account : " + s, new Object[0]);
                return true;
            }
            return false;
        }
        return true;
    }
}

