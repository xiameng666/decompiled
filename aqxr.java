import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class aqxr {
    private static aqxr a;

    public static aqxr a() {
        synchronized(aqxr.class) {
            if(aqxr.a == null) {
                aqxr.a = new aqxr();
            }
        }
        return aqxr.a;
    }

    public static final String b(Context context0, Account account0, String s, boolean z, long v) {
        Bundle bundle0 = (Bundle)cchj.b(context0).w(account0, s, z).getResult(v, TimeUnit.MILLISECONDS);
        return bundle0 == null ? null : bundle0.getString("authtoken");
    }

    public static final void c(Context context0, Account account0, String s) {
        if(account0 != null) {
            cchj cchj0 = cchj.b(context0);
            try {
                cchj0.i(account0.type, s);
                return;
            }
            catch(Exception unused_ex) {
                throw new aqxu();
            }
        }
        throw new aqyb();
    }

    public static final String d(Context context0, Account account0, String s) {
        String s1;
        batl.s(account0);
        try {
            s1 = aqxr.b(context0, account0, s, false, hqhn.b());
        }
        catch(OperationCanceledException | AuthenticatorException | IOException exception0) {
            aqxu aqxu0 = new aqxu();
            aqxu0.initCause(exception0);
            throw aqxu0;
        }
        if(s1 != null) {
            return s1;
        }
        throw new aqxu();
    }

    public static final String e(Context context0, Account account0, String s) {
        if(account0 != null) {
            return aqxr.d(context0, account0, s);
        }
        throw new aqyb();
    }
}

