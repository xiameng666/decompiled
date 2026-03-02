import android.accounts.Account;
import android.content.Context;

public final class gaxk {
    private final Context a;
    private gaxj b;
    private Account c;

    public gaxk(Context context0) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
    }

    public final gaxj a(Account account0) {
        gaxj gaxj0;
        synchronized(this) {
            ibuq.f(account0, "account");
            if(this.c == null || !ibuq.m(this.c, account0)) {
                this.c = account0;
                this.b = new gaxj(new craf(this.a, account0));
            }
            gaxj0 = this.b;
            if(gaxj0 == null) {
                ibuq.j("encryptionClient");
                return null;
            }
        }
        return gaxj0;
    }
}

