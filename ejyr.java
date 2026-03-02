import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;
import java.util.ArrayList;

public final class ejyr {
    private static final String[] a;
    private static final ggfp b;

    static {
        ejyr.a = new String[]{gqke.a.a};
        ejyr.b = ggfp.K(Integer.valueOf(1), Integer.valueOf(2));
    }

    public static Boolean a(Context context0, Account account0) {
        boolean z = true;
        Boolean boolean0 = Boolean.valueOf(true);
        if(context0 != null && account0 != null) {
            HasCapabilitiesRequest hasCapabilitiesRequest0 = new HasCapabilitiesRequest(account0, ejyr.a);
            try {
                int v = acso.c(context0, hasCapabilitiesRequest0);
                if(ejyr.b.contains(Integer.valueOf(v))) {
                    if(v != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                return boolean0;
            }
            catch(acse | IOException unused_ex) {
            }
        }
        return boolean0;
    }

    public static Account[] b(Context context0) {
        if(azqk.g(context0)) {
            return new Account[0];
        }
        Account[] arr_account = cchj.b(context0).p("com.google");
        ArrayList arrayList0 = new ArrayList(arr_account.length);
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(!"".equals(account0.name)) {
                arrayList0.add(account0);
            }
        }
        return (Account[])arrayList0.toArray(new Account[0]);
    }
}

