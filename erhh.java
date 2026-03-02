import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;

public final class erhh {
    public final cchj a;

    public erhh(Context context0) {
        this.a = erpb.a(context0);
    }

    public final gmcd a(Account account0, String s) {
        return jqy.a(new erhf(this, account0, s));
    }

    static void b(jqt jqt0, AccountManagerFuture accountManagerFuture0) {
        try {
            jqt0.b(((Boolean)accountManagerFuture0.getResult()));
        }
        catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
            jqt0.c(exception0);
        }
    }
}

