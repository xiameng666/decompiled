import android.accounts.Account;
import android.content.Context;
import java.util.List;

public final class alfb {
    private static final baun a;

    static {
        alfb.a = new baun("ProximityAuth", new String[]{"FeatureUtils"});
    }

    public static boolean a(Context context0) {
        List list0 = bbmn.h(context0, "com.google.android.gms");
        if(list0.isEmpty()) {
            alfb.a.m("Accounts list is empty", new Object[0]);
            return false;
        }
        akws akws0 = akwr.a(context0);
        for(Object object0: list0) {
            if(akws0.d(((Account)object0), gqus.b)) {
                return true;
            }
        }
        return false;
    }
}

