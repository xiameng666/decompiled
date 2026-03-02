import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.security.SecureRandom;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class atih implements atds {
    private static final bboh a;
    private static final aqql b;
    private final Context c;
    private final ExecutorService d;
    private final atgr e;
    private final SecureRandom f;
    private final aqlk g;
    private final String h;
    private final Account i;
    private final aqys j;
    private final atnv k;
    private boolean l;
    private long m;
    private InputStream n;
    private PipedOutputStream o;
    private atii p;
    private Future q;
    private atdy r;

    static {
        atih.a = bboh.b("EncryptedFullBackupDataProcessor", bbcu.dF);
        atih.b = new aqql(new String[]{"EncryptedFullBackupDataProcessor"});
    }

    public atih(Context context0, ExecutorService executorService0, atgr atgr0, SecureRandom secureRandom0, aqlk aqlk0, String s, Account account0, aqys aqys0, atnv atnv0) {
        gftb.check(context0);
        this.c = context0;
        this.d = executorService0;
        gftb.check(atgr0);
        this.e = atgr0;
        this.f = secureRandom0;
        this.g = aqlk0;
        gftb.check(s);
        this.h = s;
        this.i = account0;
        gftb.check(aqys0);
        this.j = aqys0;
        this.k = atnv0;
    }

    @Override  // atds
    public final int a() {
        int v = 0;
        gftb.r(this.q != null, "finish() before start()");
        this.l();
        atnv atnv0 = this.k;
        gfsx gfsx0 = this.j();
        atnv0.g(this.m);
        if(gfsx0.i()) {
            Throwable throwable0 = (Throwable)gfsx0.d();
            atih.b.g("Exception during encrypted full backup", throwable0, new Object[0]);
            this.m(((Exception)gfsx0.d()));
            v = -1000;
        }
        else {
            atdy atdy0 = this.r;
            if(atdy0 != null) {
                atdy0.a();
            }
        }
        if(this.l) {
            atnv0.k();
        }
        return v;
    }

    @Override  // atds
    public final int b(int v) {
        gftb.r(this.q != null && this.n != null && this.o != null, "pushData() before start()");
        this.m += (long)v;
        if(this.q.isDone()) {
            gfsx gfsx0 = this.j();
            Throwable throwable0 = (Throwable)gfsx0.g();
            atih.b.g("Encrypted upload failed", throwable0, new Object[0]);
            if(gfsx0.i()) {
                this.m(((Exception)gfsx0.d()));
            }
            return -1000;
        }
        try {
            ghjj.b(new ghji(this.n, ((long)v)), this.o);
            return 0;
        }
        catch(IOException iOException0) {
            atih.b.g("IOException when processing backup", iOException0, new Object[0]);
            return -1000;
        }
    }

    @Override  // atds
    public final void c() {
        this.k();
        this.k.c();
    }

    @Override  // atds
    public final void d(long v) {
        this.k.f(true, v);
        this.k();
    }

    @Override  // atds
    public final void e() {
        this.l = false;
        this.k.j();
        this.k();
    }

    @Override  // atds
    public final void f() {
        this.k.f(false, 0L);
        this.k();
    }

    @Override  // atds
    public final void g() {
        gftb.r(this.p != null, "start() before initiate()");
        this.l = true;
        this.q = ((bblp)this.d).e(this.p);
        this.m = 0L;
    }

    @Override  // atds
    public final void h(atdy atdy0) {
        this.r = atdy0;
    }

    @Override  // atds
    public final boolean i(InputStream inputStream0, ProtoLiteBuilder hftp0) {
        gftb.r(this.p == null, "initiate() twice");
        this.n = inputStream0;
        this.o = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = hqlt.y() ? new PipedInputStream(this.o, ((int)hqlt.g())) : new PipedInputStream(this.o);
        atgx atgx0 = hqix.e() ? atgx.a(glwy.a(hqix.b()), hqix.d()) : null;
        atig atig0 = new atig(this.e, this.f, this.h, this.i, new atin(this.c, this.h, pipedInputStream0), this.j, this.k, hqjb.e(), atgx0);
        athm athm0 = new athm(this.c, this.f, athn.a(this.c), this.g, this.h);
        this.p = new atii(atgh.a(this.c), athm0, atig0, pipedInputStream0, this.h, hftp0, new SecureRandom(), this.j, this.g);
        return true;
    }

    private final gfsx j() {
        Future future0 = this.q;
        if(future0 != null) {
            try {
                future0.get();
                return gfqx.a;
            }
            catch(InterruptedException | ExecutionException exception0) {
                return gfsx.m(exception0);
            }
        }
        return gfqx.a;
    }

    private final void k() {
        gftb.r(this.q != null && this.p != null, "cancel() before start()");
        this.p.a.b.getAndSet(true);
        this.l();
    }

    private final void l() {
        ghjp.a(this.n);
        try {
            ghjp.b(this.o);
        }
        catch(IOException iOException0) {
            atih.b.g("Expected exception to be swallowed", iOException0, new Object[0]);
        }
    }

    private final void m(Exception exception0) {
        if((exception0.getCause() instanceof aqyc)) {
            return;
        }
        if((exception0.getCause() instanceof aqyj)) {
            this.j.g(27, 4);
            return;
        }
        long v = hqhn.c();
        aqqo.a(atih.a, exception0, v);
    }
}

