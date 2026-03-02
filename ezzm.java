import android.content.Context;
import com.google.android.gms.update.SystemUpdateStatus;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public final class ezzm extends ezyj implements fabr {
    public static final fagu g;
    public static final fagp h;
    public final ezxs i;
    public final AtomicReference j;
    public final glzo k;
    private static final baun l;
    private static final fagl m;
    private static final fagl n;
    private static final fagg o;
    private final Context p;
    private final ezxc q;
    private final ezxl r;
    private final ezyd s;
    private final fabj t;
    private final ezxw u;
    private final fabz v;

    static {
        ezzm.l = fabk.e("NonStreamingDownloadAction");
        ezzm.g = new fagu("file_path", "");
        ezzm.h = new fagp("downloaded_bytes", ((long)0L));
        Integer integer0 = (int)0;
        ezzm.m = new fagl("network_error_attempts", integer0);
        ezzm.n = new fagl("user_canceled_attempts", integer0);
        ezzm.o = new fagg("progress", ((double)-1.0));
    }

    public ezzm(Context context0, fagj fagj0) {
        super("non-streaming-download", fagj0);
        this.p = context0;
        this.q = (ezxc)ezxc.c.b();
        this.r = (ezxl)ezxl.h.b();
        this.i = (ezxs)ezxs.l.b();
        this.s = (ezyd)ezyd.b.b();
        this.t = new fabj(context0);
        this.u = (ezxw)ezxw.c.b();
        if(hwdj.c()) {
            facc facc0 = (facc)facc.a.b();
            Objects.requireNonNull(this);
            this.v = facc.a(context0);
        }
        else {
            facd facd0 = ezwd.g() ? new facd(context0, ezwd.b(), ezwi.a().booleanValue(), hvzt.e(), ((long)ezwi.e())) : new faca(context0, hvzt.e());
            this.v = facd0;
        }
        this.j = new AtomicReference(gfqx.a);
        this.k = new glzo(((double)(((Double)this.c(ezzm.o)))));
    }

    @Override  // ezyj
    public final ezyi a() {
        Object object0;
        int v1;
        ezyi ezyi0;
        ezxs ezxs0 = this.i;
        long v = ezxs0.b().H;
        fagj fagj0 = this.b();
        fagu fagu0 = ezzm.g;
        if(!((String)fagj0.c(fagu0)).isEmpty() && v > 0L && v == ((long)(((Long)this.b().c(ezzm.h))))) {
            ezzm.l.h("Package fully downloaded. Skip download attempt.", new Object[0]);
            fagi fagi0 = new fagi();
            String s = (String)this.b().c(fagu0);
            fagi0.e(ezzn.g, s);
            return new ezyi("non-streaming-process-package", fagi0.a());
        }
        this.q.e();
        this.q.f();
        this.u.d();
        if(hwcb.f()) {
            this.r.l();
        }
        ezxs0.v(false);
        gfsx gfsx0 = this.h();
        if(ezxs0.b().c == 0x60B && ezxs0.C()) {
            ezxs0.r();
        }
        else if(gfsx0.i()) {
            return (ezyi)gfsx0.d();
        }
        try {
            try {
                this.v.h();
                goto label_36;
            }
            catch(IOException iOException0) {
            }
            ezzm.l.g("Failed to acquire network.", iOException0, new Object[0]);
            double f = this.k.a();
            this.i.u(0x106, f);
            ezyi0 = this.f();
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        gihd gihd0 = ezzg.a(this.p, this.v);
        this.t.d(gihd0);
        return ezyi0;
    label_33:
        gihd gihd1 = ezzg.a(this.p, this.v);
        this.t.d(gihd1);
        throw throwable0;
    label_36:
        Context context0 = this.p;
        fabz fabz0 = this.v;
        gihd gihd2 = ezzg.a(context0, fabz0);
        this.t.d(gihd2);
        try {
            this.q.a();
            this.u.a();
            if(hwcb.f() && ((long)ezwj.j()) == 4L) {
                this.r.i();
            }
            v1 = FIN.finallyOpen$NT();
            gfsx gfsx1 = this.h();
            if(gfsx1.i()) {
                object0 = gfsx1.d();
            }
            else {
                ezxs ezxs1 = this.i;
                ezxs1.j();
                ezzy ezzy0 = new ezzy(context0, (ezwj.d().booleanValue() ? "update_s.zip" : "update.zip"), ((String)this.c(fagu0)), ezwd.c());
                try {
                    fabv fabv0 = (fabv)fabz0.a().g();
                    if(fabv0 == null) {
                        throw new fabo("No network available");
                    }
                    int v2 = (int)(((Integer)((fagt)fagt.a.b()).a(ezyq.f).b));
                    String s1 = ezxs1.b().a;
                    long v3 = (long)(((Long)this.c(ezzm.h)));
                    ezzz ezzz0 = new ezzz();
                    fabt fabt0 = fabl.a(context0, s1, ezzy0, v3, 0L, -1L, faaa.b(context0), v2, ezzz0, fabv0);
                    synchronized(fabt0.g) {
                        fabt0.j = this;
                    }
                    gfsx gfsx2 = gfsx.m(fabt0);
                    this.j.set(gfsx2);
                    double f1 = this.k.a();
                    this.i.u(2, f1);
                    fabt0.d();
                }
                catch(fabp fabp0) {
                    ezzm.l.g("Unable to create the file.", fabp0, new Object[0]);
                    double f2 = this.k.a();
                    this.i.u(0x206, f2);
                    ezze ezze0 = new ezze();
                    ezze0.f(hvzt.c());
                    ezze0.d("non-streaming-download", this.g().a());
                    ezze0.g(false);
                    ezze0.e(gfsx.m(ezyy.g()));
                    object0 = ezze0.a();
                    goto label_110;
                }
                catch(fabo fabo0) {
                    ezzm.l.g("Failed to download: %s", fabo0, new Object[]{gfta.b(fabo0.getMessage())});
                    double f3 = this.k.a();
                    this.i.u(0x106, f3);
                    object0 = this.f();
                    goto label_110;
                }
                catch(fabn fabn0) {
                    ezzm.l.g("Download cancelled.", fabn0, new Object[0]);
                    ezxs ezxs2 = this.i;
                    if(ezxs2.C()) {
                        ezxs2.u(0x60B, this.k.a());
                        fagi fagi1 = this.g();
                        Integer integer0 = ezxs2.b().B ? ((int)(((int)(((Integer)this.c(ezzm.n)))) + 1)) : ((Integer)this.c(ezzm.n));
                        fagi1.e(ezzm.n, integer0);
                        fagj fagj1 = fagi1.a();
                        ezyz ezyz0 = new ezyz();
                        ezyz0.f(hwcs.c(), hwcs.d());
                        ezyz0.g(hwcs.b());
                        ezyz0.h(((Integer)this.c(ezzm.n)).intValue());
                        ezyz0.d("non-streaming-download", fagj1);
                        ezyz0.c(true);
                        ezyz0.e(gfsx.m(ezyy.g()));
                        object0 = ezyz0.a();
                    }
                    else {
                        object0 = new ezyi("non-streaming-download", this.g().a());
                    }
                    goto label_110;
                }
                fagi fagi2 = new fagi();
                String s2 = ezzy0.b();
                fagi2.e(ezzn.g, s2);
                object0 = new ezyi("non-streaming-process-package", fagi2.a());
            }
        label_110:
            FIN.finallyCodeBegin$NT(v1);
            this.q.d();
            this.u.c();
            if(hwcb.f()) {
                this.r.k();
            }
        }
        catch(Throwable throwable1) {
            gfsx gfsx3 = gfsx.m("non-streaming-download Finished Execution");
            this.v.b(gfsx3);
            throw throwable1;
        }
        FIN.finallyCodeEnd$NT(v1);
        gfsx gfsx4 = gfsx.m("non-streaming-download Finished Execution");
        this.v.b(gfsx4);
        return (ezyi)object0;
    }

    @Override  // ezyj
    public final void d() {
        super.d();
        gfsx gfsx0 = (gfsx)this.j.get();
        if(gfsx0.i()) {
            ((fabt)gfsx0.d()).e();
        }
    }

    @Override  // ezyj
    public final boolean e(int v) {
        int v1;
        try {
            gfsx gfsx0 = this.v.a();
            SystemUpdateStatus systemUpdateStatus0 = this.i.b();
            v1 = ezwd.a(this.p, gfsx0, systemUpdateStatus0).a;
            if(v1 != 2) {
                goto label_4;
            }
        }
        catch(ezwa unused_ex) {
        }
        return v != 103;
    label_4:
        ezzm.l.h("Stopping download for delay status: 0x%03X", new Object[]{v1});
        this.d();
        return v != 103;
    }

    private final ezyi f() {
        fagi fagi0 = this.g();
        Integer integer0 = (int)(((int)(((Integer)this.c(ezzm.m)))) + 1);
        fagi0.e(ezzm.m, integer0);
        fagj fagj0 = fagi0.a();
        ezzb ezzb0 = new ezzb();
        ezzb0.f(hvzt.d(), ezwi.d().longValue());
        ezzb0.g(hvzt.b());
        ezzb0.h(((Integer)this.c(ezzm.m)).intValue());
        ezzb0.d("non-streaming-download", fagj0);
        ezzb0.e(gfsx.m(ezyy.g()));
        return ezzb0.a();
    }

    private final fagi g() {
        gfsx gfsx0 = (gfsx)this.j.get();
        fagi fagi0 = this.b().a();
        Double double0 = this.k.a();
        fagi0.e(ezzm.o, double0);
        if(gfsx0.i()) {
            Long long0 = ((fabt)gfsx0.d()).c();
            fagi0.e(ezzm.h, long0);
            String s = ((ezzy)((fabt)gfsx0.d()).b).b();
            fagi0.e(ezzm.g, s);
        }
        return fagi0;
    }

    private final gfsx h() {
        int v;
        ezwb ezwb0;
        ezxs ezxs0 = this.i;
        if(gfta.c(ezxs0.b().a)) {
            ezxs0.u(0, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        try {
            gfsx gfsx0 = this.v.a();
            ezwb0 = ezwd.a(this.p, gfsx0, systemUpdateStatus0);
            v = ezwb0.a;
        }
        catch(ezwa ezwa0) {
            ezzm.l.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
            this.i.u(0x306, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        if(v != 2) {
            ezxs ezxs1 = this.i;
            ezxs1.u(v, this.k.a());
            if(v == 0x80B || v == 0xC0B) {
                this.u.b();
            }
            if(v == 0x90B) {
                ezxc ezxc0 = this.q;
                ezxc0.b();
                if(hvxt.c() && ezwc.k(this.p)) {
                    ezxc0.c();
                }
            }
            if(v == 0xB0B) {
                this.r.j();
            }
            SystemUpdateStatus systemUpdateStatus1 = ezxs1.b();
            this.s.a(systemUpdateStatus1, Long.valueOf(ezwb0.b));
            ezze ezze0 = new ezze();
            ezze0.f(ezwb0.b);
            ezze0.d("non-streaming-download", this.b());
            ezze0.g(ezwb0.c);
            gfsx gfsx1 = ezwb0.c ? gfqx.a : gfsx.m(ezyy.g());
            ezze0.e(gfsx1);
            return gfsx.m(ezze0.a());
        }
        return gfqx.a;
    }
}

