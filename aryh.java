import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.nio.charset.StandardCharsets;

public final class aryh {
    private static final ghfz a;
    private static final aqql b;

    static {
        aryh.a = ghfs.a;
        aryh.b = new aqql(new String[]{aryh.class.getName()});
    }

    public static gfsx a(long v, Context context0) {
        gged_interceptors gged0;
        int v1 = 0;
        try {
            gged0 = gged_interceptors.k(new adgg(context0).e(context0));
        }
        catch(RemoteException | azqj | azqi exception0) {
            aryh.b.g("Error getting device accounts: ", exception0, new Object[0]);
            gged0 = ggna.a;
        }
        while(v1 < ((ggna)gged0).c) {
            Account account0 = (Account)gged0.get(v1);
            ++v1;
            if(aryh.a.c(account0.name, StandardCharsets.UTF_8).c() == v) {
                return gfsx.m(account0);
            }
        }
        return gfqx.a;
    }
}

