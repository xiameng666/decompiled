import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class ejzd extends ejzc {
    public Set a;
    private static final bboh b;
    private final cchj c;

    static {
        ejzd.b = bboh.b("ROM_DasherLookupImpl", bbcu.bN);
    }

    public ejzd(cchj cchj0) {
        this.a = null;
        this.c = cchj0;
        try {
            Account[] arr_account = (Account[])cchj0.v("com.google", new String[]{"service_HOSTED"}).getResult();
            HashSet hashSet0 = new HashSet();
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(!account0.name.endsWith("@google.com")) {
                    hashSet0.add(account0.name);
                }
            }
            this.a = hashSet0;
        }
        catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
            a.ae(ejzd.b.i(), "Cannot query dasher account from GmsAccountmanager, fall back to legacy dasher lookup.", exception0);
        }
    }
}

