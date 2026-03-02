import android.accounts.Account;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;

public final class bvut implements Callable {
    public final bvuv a;
    public final Account b;
    public final String c;

    public bvut(bvuv bvuv0, Account account0, String s) {
        this.a = bvuv0;
        this.b = account0;
        this.c = s;
    }

    @Override
    public final Object call() {
        bvuv bvuv0 = this.a;
        Account account0 = this.b;
        gggc gggc0 = gggc.S(bvuv0.a.b(account0, new String[]{this.c}));
        synchronized(bvuv0) {
            bvuv0.c = gggc0;
            gggc gggc1 = bvuv0.c;
            CookieManager cookieManager0 = bvuv0.b;
            ggdy ggdy0 = new ggdy();
            ggqj ggqj0 = gggc1.om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                String s = (String)object0;
                for(Object object1: bvuv.d(s, cookieManager0)) {
                    ggdy0.i(bvuv.c(s, ((bvuu)object1).a));
                }
            }
            bvuv0.d = ggdy0.h();
            bvuv0.e(account0);
        }
        return null;
    }
}

