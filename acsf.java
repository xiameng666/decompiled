import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;

public final class acsf extends acso {
    public static final String a;
    public static final String b;

    static {
        acsf.a = acso.d;
        acsf.b = acso.e;
    }

    @Deprecated
    public static String a(Context context0, Account account0, String s, Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putBoolean("handle_notification", true);
        try {
            TokenData tokenData0 = acso.n(context0, account0, s, bundle0);
            azqk.d(context0);
            return tokenData0.b;
        }
        catch(acsr acsr0) {
            azpm azpm0 = azpm.a;
            int v = acsr0.a;
            if(azqk.f(context0, v)) {
                azpm0.h(context0);
            }
            else if(v != 9) {
                azpm0.e(context0, v);
            }
            else if(!azqk.i(context0, "com.android.vending")) {
                azpm0.e(context0, 9);
            }
            else {
                azpm0.h(context0);
            }
            Log.w("GoogleAuthUtil", "Error when getting token", acsr0);
            throw new acsy(acsr0);
        }
        catch(UserRecoverableAuthException userRecoverableAuthException0) {
            azqk.d(context0);
            Log.w("GoogleAuthUtil", "Error when getting token", userRecoverableAuthException0);
            throw new acsy(userRecoverableAuthException0);
        }
    }

    @Deprecated
    public static Account[] b(Context context0, String[] arr_s) {
        acsg acsg0;
        long v = System.currentTimeMillis();
        long v1 = SystemClock.elapsedRealtime();
        acry acry0 = acry.a(context0);
        try {
            batl.s(context0);
            batl.q("com.google");
            acso.p(context0);
            String s = (context0 instanceof Activity) ? ((Activity)context0).getComponentName().getClassName() : "";
            try {
                acsg0 = new acsg(arr_s, s, acry0, v, v1);
                acry0 = acry0;
            }
            catch(Exception exception0) {
                acry0 = acry0;
                goto label_15;
            }
            return (Account[])acso.l(context0, acso.f, acsg0);
        }
        catch(Exception exception0) {
        }
    label_15:
        acry0.b(1708, 13, v, System.currentTimeMillis(), v1);
        throw exception0;
    }
}

