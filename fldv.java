import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class fldv implements Callable {
    public final fleb a;
    public final AccountContext b;
    public final long c;

    public fldv(fleb fleb0, AccountContext accountContext0, long v) {
        this.a = fleb0;
        this.b = accountContext0;
        this.c = v;
    }

    @Override
    public final Object call() {
        gmcd gmcd0;
        fleb fleb0 = this.a;
        flky flky0 = fleb0.b;
        AccountContext accountContext0 = this.b;
        flla flla0 = flky0.d(accountContext0);
        fmou fmou0 = flky0.b(accountContext0);
        gfsx gfsx0 = flky0.d(accountContext0).a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
        if(gfsx0.i()) {
            flbj.a("LitBstrpCntrl", "Latest timestamp already saved previously, continue to use the existing timestamp");
            gfsx gfsx1 = flky0.d(accountContext0).a("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY");
            long v = gfsx1.i() ? glxd.c(((byte[])gfsx1.d())) : 0L;
            long v1 = glxd.c(((byte[])gfsx0.d()));
            flba.a();
            long v2 = System.currentTimeMillis();
            flbj.a("LitBstrpCntrl", a.u(v, "Got lastCheckBootstrapTimestamp "));
            flbj.a("LitBstrpCntrl", "Got latestMessageTimestamp " + gfsx0.toString());
            flbj.a("LitBstrpCntrl", a.u(v2, "Got currentTimestampMills "));
            flbj.a("LitBstrpCntrl", "Got Bootstrap threshold  " + iaea.b());
            if(v2 - v > iaea.b() && v2 - TimeUnit.MICROSECONDS.toMillis(v1) > iaea.b()) {
                gfsx gfsx2 = flla0.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
                if(gfsx2.i()) {
                    flsm.a(accountContext0, fleb0.c, 10077, 409);
                    long v3 = glxd.c(((byte[])gfsx2.d()));
                    flqv flqv0 = flqw.a();
                    flqv0.a = "Check bootstrap necessary";
                    flqv0.b(flra.c);
                    flqw flqw0 = flqv0.a();
                    flbj.a("LitBstrpCntrl", "Start verifying if bootstrap needed with server");
                    UUID uUID0 = UUID.randomUUID();
                    flxy flxy0 = new flxy(v3, accountContext0);
                    gmcd gmcd1 = fleb0.f.a.d.c();
                    accountContext0 = accountContext0;
                    gmcd gmcd2 = fleb0.f.a.b(uUID0, flxy0, gmcd1, accountContext0, flqw0, true);
                    flsm.a(accountContext0, fleb0.c, 10088, 396);
                    gmcd0 = glzd.g(gmcd2, new fldy(fleb0, flla0, accountContext0, fmou0), gmap.a);
                }
                else {
                    flsm.a(accountContext0, fleb0.c, 10102, 394);
                    fltg fltg0 = new fltg();
                    fltg0.c(false);
                    fltg0.b(0);
                    gmcd0 = gmbu.i(fltg0.a());
                    accountContext0 = accountContext0;
                }
            }
            else {
                accountContext0 = accountContext0;
            label_45:
                flsm.a(accountContext0, fleb0.c, 10077, 395);
                flbj.a("LitBstrpCntrl", "Local check bootstrap not necessary, finish checking deleting latest message timestamp from kv store.");
                flla0.b();
                gmcd0 = fleb0.a(accountContext0);
            }
        }
        else {
            flbj.f("LitBstrpCntrl", "No latest message timestamp found in key value store.");
            goto label_45;
        }
        gmbu.t(gmcd0, new flea(fleb0, accountContext0, this.c), fleb0.d);
        return null;
    }
}

