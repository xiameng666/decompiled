import android.accounts.Account;
import java.util.concurrent.Callable;

public final class bvsb implements Callable {
    public final bvsd a;
    public final gqpk b;
    public final String c;

    public bvsb(bvsd bvsd0, gqpk gqpk0, String s) {
        this.a = bvsd0;
        this.b = gqpk0;
        this.c = s;
    }

    @Override
    public final Object call() {
        Account[] arr_account = cchj.b(this.a.a).p("com.google.android.apps.tachyon");
        for(int v = 0; v < arr_account.length; ++v) {
            if("Duo".equals(arr_account[v].name)) {
                return this.b.b ? bvsc.c() : bvsc.a(this.c);
            }
        }
        return this.b.b ? bvsc.a(this.c) : bvsc.c();
    }
}

