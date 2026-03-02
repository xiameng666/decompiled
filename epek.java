import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

public final class epek extends bbln {
    final Context a;
    final Account b;
    final evqp c;

    public epek(Context context0, Account account0, evqp evqp0) {
        this.a = context0;
        this.b = account0;
        this.c = evqp0;
        super(9);
    }

    @Override
    public final void run() {
        try {
            String s = acso.e(this.a, this.b.name);
            this.c.b(s);
        }
        catch(acse | IOException exception0) {
            epen.a.g("Error getting account ID", exception0, new Object[0]);
            this.c.a(exception0);
        }
    }
}

