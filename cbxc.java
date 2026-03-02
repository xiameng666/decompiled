import android.accounts.Account;
import android.os.LocaleList;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import java.util.ArrayList;

public final class cbxc {
    public static final int a;
    private static final bboh b;

    static {
        cbxc.b = bboh.b("DeviceUtils", bbcu.ct);
    }

    public static gfsx a(String s) {
        gfsx gfsx0 = cbxc.b();
        if(gfsx0.i()) {
            Account[] arr_account = (Account[])gfsx0.d();
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(account0.name.equals(s)) {
                    return gfsx.m(account0);
                }
            }
        }
        return gfqx.a;
    }

    public static gfsx b() {
        try {
            return gfsx.m(new adgg(AppContextProvider.a()).e(AppContextProvider.a()));
        }
        catch(Exception exception0) {
            a.ae(cbxc.b.i(), "Error while getting account names", exception0);
            return gfqx.a;
        }
    }

    public static gged_interceptors c() {
        LocaleList localeList0 = LocaleList.getDefault();
        ArrayList arrayList0 = new ArrayList(localeList0.size());
        for(int v = 0; v < localeList0.size(); ++v) {
            arrayList0.add(localeList0.get(v));
        }
        return gged_interceptors.i(arrayList0);
    }
}

