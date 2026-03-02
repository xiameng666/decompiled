import android.content.Context;
import com.google.android.gms.update.SystemUpdateStatus;
import j..util.Objects;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public final class ezzu extends ezyj {
    public static final baun g;
    public final Context h;
    private static final fagl i;
    private static final fagl j;
    private static final fagl k;
    private static final ggfp l;
    private static final ggfp m;
    private final ezxc n;
    private final ezxl o;
    private final ezxs p;
    private final ezxw q;
    private final ezyd r;
    private final fabz s;
    private final AtomicReference t;

    static {
        ezzu.g = fabk.e("StreamingDownloadAction");
        Integer integer0 = (int)0;
        ezzu.i = new fagl("downloaded_files", integer0);
        ezzu.j = new fagl("network_error_attempts", integer0);
        ezzu.k = new fagl("user_canceled_attempts", integer0);
        ezzu.l = ggfp.O("apex_info.pb", "care_map.pb", "care_map.txt", "compatibility.zip", "metadata", "payload_properties.txt", new String[0]);
        ezzu.m = new ggoh("apex_info.pb");
    }

    public ezzu(Context context0, fagj fagj0) {
        super("streaming-download", fagj0);
        this.h = context0;
        this.n = (ezxc)ezxc.c.b();
        this.o = (ezxl)ezxl.h.b();
        this.p = (ezxs)ezxs.l.b();
        this.q = (ezxw)ezxw.c.b();
        this.r = (ezyd)ezyd.b.b();
        if(hwdj.c()) {
            facc facc0 = (facc)facc.a.b();
            Objects.requireNonNull(this);
            this.s = facc.a(context0);
        }
        else {
            facd facd0 = ezwd.g() ? new facd(context0, ezwd.b(), ezwi.a().booleanValue(), hvzt.e(), ((long)ezwi.e())) : new faca(context0, hvzt.e());
            this.s = facd0;
        }
        this.t = new AtomicReference(gfqx.a);
    }

    @Override  // ezyj
    public final ezyi a() {
        List list0;
        Object object0;
        int v;
        this.n.e();
        this.n.f();
        this.q.d();
        if(hwcb.f()) {
            this.o.l();
        }
        ezxs ezxs0 = this.p;
        ezxs0.v(true);
        gfsx gfsx0 = this.h();
        if(ezxs0.b().c == 0x60B && ezxs0.C()) {
            ezxs0.r();
        }
        else if(gfsx0.i()) {
            return (ezyi)gfsx0.d();
        }
        try {
            this.s.h();
        }
        catch(IOException iOException0) {
            ezzu.g.g("Failed to request for the network.", iOException0, new Object[0]);
            this.p.u(0x106, -1.0);
            return this.g(((Integer)this.c(ezzu.i)).intValue());
        }
        try {
            this.n.a();
            this.q.a();
            if(hwcb.f() && ((long)ezwj.j()) == 4L) {
                this.o.i();
            }
            v = FIN.finallyOpen$NT();
            String s = ezwj.o();
            if(gfta.c(s)) {
                ezzu.g.f("Unable to continue due to empty streamingPropertyFiles flag.", new Object[0]);
                object0 = new ezyi("non-streaming-download", fagj.b(new fagh[0]));
            }
            else {
                try {
                    list0 = ezwt.b(s);
                }
                catch(IOException iOException1) {
                    ezzu.g.g("Unable to continue due to invalid streamingPropertyFiles flag.", iOException1, new Object[0]);
                    object0 = new ezyi("non-streaming-download", fagj.b(new fagh[0]));
                    goto label_115;
                }
                gfsx gfsx1 = this.h();
                if(gfsx1.i()) {
                    object0 = gfsx1.d();
                }
                else {
                    ezxs ezxs1 = this.p;
                    ezxs1.j();
                    int v1 = list0.size();
                    int v2 = (int)(((Integer)this.c(ezzu.i)));
                    while(v2 < v1) {
                        ezws ezws0 = (ezws)list0.get(v2);
                        String s1 = ezws0.a;
                        if(!ezzu.l.contains(s1)) {
                            ezzu.g.d("%d/%d: %s is to be streamed; skipped.", new Object[]{((int)(v2 + 1)), v1, ezws0.a});
                        }
                        else if(!"apex_info.pb".equals(s1) || hwal.c()) {
                            ezzu.g.d(v2 + 1 + "/" + v1 + ": Downloading " + s1, new Object[0]);
                            Context context0 = this.h;
                            faad faad0 = new faad(context0, s1, ezwd.c());
                            try {
                                fabv fabv0 = (fabv)this.s.a().g();
                                if(fabv0 == null) {
                                    throw new fabo("No network available");
                                }
                                String s2 = ezxs1.b().a;
                                ezzz ezzz0 = new ezzz();
                                gged_interceptors gged0 = faaa.b(context0);
                                fabt fabt0 = fabl.a(context0, s2, faad0, 0L, ezws0.b, ezws0.c, gged0, 0, ezzz0, fabv0);
                                gfsx gfsx2 = gfsx.m(fabt0);
                                this.t.set(gfsx2);
                                ezxs1.u(2, -1.0);
                                fabt0.d();
                            }
                            catch(fabp fabp0) {
                                ezzu.g.n("Unable to create the file.", fabp0, new Object[0]);
                                if(!ezzu.m.contains(ezws0.a)) {
                                    this.p.u(0x206, -1.0);
                                    fagi fagi0 = this.b().a();
                                    fagi0.e(ezzu.i, Integer.valueOf(v2));
                                    fagj fagj0 = fagi0.a();
                                    ezze ezze0 = new ezze();
                                    ezze0.f(hvzt.c());
                                    ezze0.d("streaming-download", fagj0);
                                    ezze0.e(ezzu.f());
                                    object0 = ezze0.a();
                                    goto label_115;
                                }
                            }
                            catch(fabo fabo0) {
                                ezzu.g.n("Failed to download.", fabo0, new Object[0]);
                                if(!ezzu.m.contains(ezws0.a)) {
                                    this.p.u(0x106, -1.0);
                                    object0 = this.g(v2);
                                    goto label_115;
                                }
                            }
                            catch(fabn fabn0) {
                                ezzu.g.g("Download cancelled.", fabn0, new Object[0]);
                                ezxs ezxs2 = this.p;
                                if(ezxs2.C()) {
                                    ezxs2.u(0x60B, -1.0);
                                    fagi fagi1 = this.b().a();
                                    fagi1.e(ezzu.i, Integer.valueOf(v2));
                                    Integer integer0 = ezxs2.b().B ? ((int)(((int)(((Integer)this.c(ezzu.k)))) + 1)) : ((Integer)this.c(ezzu.k));
                                    fagi1.e(ezzu.k, integer0);
                                    fagj fagj1 = fagi1.a();
                                    ezyz ezyz0 = new ezyz();
                                    ezyz0.f(hwcs.c(), hwcs.d());
                                    ezyz0.g(hwcs.b());
                                    ezyz0.h(((Integer)this.c(ezzu.k)).intValue());
                                    ezyz0.d("streaming-download", fagj1);
                                    ezyz0.e(gfsx.m(ezyy.g()));
                                    ezyz0.c(true);
                                    object0 = ezyz0.a();
                                    goto label_115;
                                }
                                fagi fagi2 = this.b().a();
                                fagi2.e(ezzu.i, Integer.valueOf(v2));
                                object0 = new ezyi("streaming-download", fagi2.a());
                                goto label_115;
                            }
                        }
                        ++v2;
                    }
                    if(hwal.c()) {
                        new bblp(1, 9).execute(new ezzt(this));
                    }
                    fagi fagi3 = new fagi();
                    String s3 = faab.b().getAbsolutePath();
                    fagi3.e(ezzw.g, s3);
                    object0 = new ezyi("streaming-process-package", fagi3.a());
                }
            }
        label_115:
            FIN.finallyCodeBegin$NT(v);
            this.n.d();
            this.q.c();
            if(hwcb.f()) {
                this.o.k();
            }
        }
        catch(Throwable throwable0) {
            gfsx gfsx3 = gfsx.m("streaming-download Finished Execution");
            this.s.b(gfsx3);
            throw throwable0;
        }
        FIN.finallyCodeEnd$NT(v);
        gfsx gfsx4 = gfsx.m("streaming-download Finished Execution");
        this.s.b(gfsx4);
        return (ezyi)object0;
    }

    @Override  // ezyj
    public final void d() {
        super.d();
        gfsx gfsx0 = (gfsx)this.t.get();
        if(gfsx0.i()) {
            ((fabt)gfsx0.d()).e();
        }
    }

    @Override  // ezyj
    public final boolean e(int v) {
        int v1;
        try {
            gfsx gfsx0 = this.s.a();
            SystemUpdateStatus systemUpdateStatus0 = this.p.b();
            v1 = ezwd.a(this.h, gfsx0, systemUpdateStatus0).a;
            if(v1 != 2) {
                goto label_4;
            }
        }
        catch(ezwa unused_ex) {
        }
        return v != 103;
    label_4:
        ezzu.g.h("Stopping download for delay status: 0x%03X", new Object[]{v1});
        this.d();
        return v != 103;
    }

    public static final gfsx f() {
        return gfsx.m(ezyy.g());
    }

    private final ezyi g(int v) {
        fagi fagi0 = this.b().a();
        fagi0.e(ezzu.i, Integer.valueOf(v));
        Integer integer0 = (int)(((int)(((Integer)this.c(ezzu.j)))) + 1);
        fagi0.e(ezzu.j, integer0);
        fagj fagj0 = fagi0.a();
        ezzb ezzb0 = new ezzb();
        ezzb0.f(hvzt.d(), ezwi.d().longValue());
        ezzb0.g(hvzt.b());
        ezzb0.h(((Integer)this.c(ezzu.j)).intValue());
        ezzb0.d("streaming-download", fagj0);
        ezzb0.e(gfsx.m(ezyy.g()));
        return ezzb0.a();
    }

    private final gfsx h() {
        int v;
        ezwb ezwb0;
        ezxs ezxs0 = this.p;
        if(gfta.c(ezxs0.b().a)) {
            ezxs0.u(0, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        try {
            gfsx gfsx0 = this.s.a();
            ezwb0 = ezwd.a(this.h, gfsx0, systemUpdateStatus0);
            v = ezwb0.a;
        }
        catch(ezwa ezwa0) {
            ezzu.g.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
            this.p.u(0x306, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        if(v != 2) {
            ezxs ezxs1 = this.p;
            ezxs1.u(v, -1.0);
            if(v == 0x80B || v == 0xC0B) {
                this.q.b();
            }
            if(v == 0x90B) {
                ezxc ezxc0 = this.n;
                ezxc0.b();
                if(hvxt.c() && ezwc.k(this.h)) {
                    ezxc0.c();
                }
            }
            if(v == 0xB0B) {
                this.o.j();
            }
            SystemUpdateStatus systemUpdateStatus1 = ezxs1.b();
            this.r.a(systemUpdateStatus1, Long.valueOf(ezwb0.b));
            ezze ezze0 = new ezze();
            ezze0.f(ezwb0.b);
            ezze0.d("streaming-download", this.b());
            ezze0.g(ezwb0.c);
            gfsx gfsx1 = ezwb0.c ? gfqx.a : ezzu.f();
            ezze0.e(gfsx1);
            return gfsx.m(ezze0.a());
        }
        return gfqx.a;
    }
}

