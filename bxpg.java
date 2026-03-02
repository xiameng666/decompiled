import android.accounts.Account;
import j..lang.Iterable.-EL;
import java.util.concurrent.Callable;

public final class bxpg implements Callable {
    public final bxps a;

    public bxpg(bxps bxps0) {
        this.a = bxps0;
    }

    @Override
    public final Object call() {
        bxps bxps0 = this.a;
        bxps0.c.removeAllCookies(null);
        bxps0.c.flush();
        Iterable.-EL.forEach(bxps0.a.f, new bxpf(bxps0));
        Account account0 = bxps0.a.c;
        if(account0 != null) {
            new actb(bxps0.a()).b(account0, new String[]{bxps0.a.b});
        }
        return gfsx.m(bxrc.c);
    }
}

