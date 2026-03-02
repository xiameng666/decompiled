import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public final class fldy implements glzn {
    public final fleb a;
    public final AccountContext b;
    public final fmou c;
    public final flla d;

    public fldy(fleb fleb0, flla flla0, AccountContext accountContext0, fmou fmou0) {
        this.a = fleb0;
        this.d = flla0;
        this.b = accountContext0;
        this.c = fmou0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        flba.a();
        flla flla0 = this.d;
        flla0.c("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY", glxd.h(System.currentTimeMillis()));
        fleb fleb0 = this.a;
        AccountContext accountContext0 = this.b;
        if(((flkk)object0).b == 1) {
            flsm.a(accountContext0, fleb0.c, 10088, 398);
            flla0.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", "".getBytes(StandardCharsets.UTF_8));
            flla0.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
            flsm.a(accountContext0, fleb0.c, 10088, 400);
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            flba.a();
            fmai fmai0 = fmaj.a();
            fmai0.g(10088);
            fmai0.n(accountContext0.c().f());
            fmai0.f(0x18F);
            fmai0.b(new fman(gfsx.m(Integer.valueOf(this.c.a(((flkk)object0).a, timeUnit0.toMicros(System.currentTimeMillis() - iaea.a.g().d())))), gfqx.a, gfqx.a));
            fmaj fmaj0 = fmai0.a();
            fleb0.c.b(fmaj0);
            flbj.a("LitBstrpCntrl", "Server check Bootstrap necessary, finish checking deleting latest message timestamp from kv store.");
        }
        else {
            flsm.a(accountContext0, fleb0.c, 10088, 397);
        }
        flla0.b();
        flbj.a("LitBstrpCntrl", "Start downloading conversations.");
        return fleb0.a(accountContext0);
    }
}

