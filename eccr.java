import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

public final class eccr {
    public static String a(Context context0, Account account0) {
        return eccr.b(context0, account0.name);
    }

    public static String b(Context context0, String s) {
        try {
            return acso.e(context0, s);
        }
        catch(acse | IOException exception0) {
            throw new cjuh(5, null, null, exception0);
        }
    }
}

