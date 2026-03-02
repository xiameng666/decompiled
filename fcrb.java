import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.provider.Settings.Secure;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

public final class fcrb {
    public static final baun a;
    public final Context b;
    public final fcom c;
    public final fcrt d;
    public final feur e;
    public final fcvh f;
    public final fcrl g;
    public final gmcg h;
    public final ScheduledExecutorService i;
    public final fcok j;
    private final aqee k;
    private final fcvj l;

    static {
        fcrb.a = new fcgf(new String[]{"RestoreController"});
    }

    public fcrb(Context context0, fcom fcom0, aqee aqee0, fcvj fcvj0, fcrt fcrt0, feur feur0, fcvh fcvh0, fcrl fcrl0, gmcg gmcg0, ScheduledExecutorService scheduledExecutorService0, fcok fcok0) {
        this.b = context0;
        this.c = fcom0;
        this.k = aqee0;
        this.l = fcvj0;
        this.d = fcrt0;
        this.e = feur0;
        this.f = fcvh0;
        this.g = fcrl0;
        this.h = gmcg0;
        this.i = scheduledExecutorService0;
        this.j = fcok0;
    }

    public final void a(String s) {
        fcrb.a.j("Watch restore finished", new Object[0]);
        fcvj fcvj0 = this.l;
        if(fcvj0.c != null) {
            fcvj.a.j("Releasing wi-fi network", new Object[0]);
            ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = fcvj0.c;
            gftb.check(connectivityManager$NetworkCallback0);
            fcvj0.b.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
            fcvj0.c = null;
        }
        fcrl.a.j("sending restore_finished request", new Object[0]);
        fcrh fcrh0 = new fcrh(this.g, s);
        this.g.b("sendRestoreFinished", fcrh0);
        synchronized(fcrc.a) {
            fcrc.a.b = false;
        }
    }

    public final void b(String s, long v, Account account0, int v1) {
        AtomicLong atomicLong0 = new AtomicLong(System.currentTimeMillis());
        Settings.Secure.putLong(this.b.getContentResolver(), "cloud_restore_trigger_time_ms", atomicLong0.get());
        gibd gibd0 = gibd.a;
        ProtoLiteBuilder hftp0 = fcok.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gibd0.getClass();
        ghys0.x = gibd0;
        ghys0.b |= 0x400000;
        this.j.g(hftp0, ghyr.r);
        this.k.c(account0);
        fcrb.a.j("Backup account set", new Object[0]);
        gmbt gmbt0 = gmbt.h(jqy.a(new fcvi(this.l)));
        fcqi fcqi0 = new fcqi();
        gmcd gmcd0 = glzd.g(glyi.f(gmbt0, Throwable.class, fcqi0, this.h), new fcqj(this), this.h);
        fcqk fcqk0 = new fcqk();
        gmcd gmcd1 = glzd.g(glyi.f(gmcd0, Throwable.class, fcqk0, this.h), new fcqg(this, new fcql(this, v), giay.e), this.h);
        fcqm fcqm0 = new fcqm();
        gmcd gmcd2 = glyi.f(gmcd1, Throwable.class, fcqm0, this.h);
        gmcd gmcd3 = glzd.g(glzd.g(gmcd2, new fcqf(this, v1), this.h), new fcqg(this, new fcqq(this, account0, v, v1), giay.b), this.h);
        fcqr fcqr0 = new fcqr();
        gmcd gmcd4 = glzd.g(glyi.f(gmcd3, Throwable.class, fcqr0, this.h), new fcqg(this, new fcqs(this), giay.d), this.h);
        fcqt fcqt0 = new fcqt();
        gmcd gmcd5 = glyi.f(gmcd4, Throwable.class, fcqt0, this.h);
        gmcd gmcd6 = glzd.g(gmcd5, new fcqg(this, new fcqn(this), giay.f), this.h);
        fcqo fcqo0 = new fcqo();
        gmcd gmcd7 = glyi.f(gmcd6, Throwable.class, fcqo0, this.h);
        gmcd7.hB(new fcqp(this, s, atomicLong0, ((gmbt)gmcd2), ((gmbt)gmcd5), gmcd7), this.h);
    }
}

