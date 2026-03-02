import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

public final class dlns implements Runnable {
    public final evqp a;
    public final Context b;
    public final Account c;
    public final String d;

    public dlns(evqp evqp0, Context context0, Account account0, String s) {
        this.a = evqp0;
        this.b = context0;
        this.c = account0;
        this.d = s;
    }

    @Override
    public final void run() {
        evqp evqp0;
        try {
            evqp0 = this.a;
            evqp0.b(new adgg(this.b).b(this.b, this.c, this.d));
        }
        catch(IOException | acse exception0) {
            evqp0.a(exception0);
        }
    }
}

