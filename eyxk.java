import android.accounts.Account;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;

public final class eyxk implements ibts {
    public final eyxp a;

    public eyxk(eyxp eyxp0) {
        this.a = eyxp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Account account0;
        ibuq.f(((fntm)object0), "deviceOwner");
        eyxp eyxp0 = this.a;
        ggtj ggtj0 = (ggtj)eyxp0.b.h();
        String s = ((fntm)object0).c;
        ggtj0.B("ExpressSignIn account has been selected: %s", s);
        Account[] arr_account = cchj.b(AppContextProvider.a()).o();
        ibuq.e(arr_account, "getAccounts(...)");
        for(int v = 0; true; ++v) {
            account0 = null;
            if(v >= arr_account.length) {
                break;
            }
            account0 = arr_account[v];
            String s1 = account0.name;
            ibuq.e(s1, "name");
            if(s1.length() != 0 && ibuq.m(account0.name, s)) {
                break;
            }
        }
        eyxn eyxn0 = new eyxn(account0);
        eyxp0.d.g(eyxn0);
        return ibom.a;
    }
}

