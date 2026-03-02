import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class fxsk {
    public final fxts a;
    public final fxtt b;
    public final fxtr c;
    private final Context d;
    private final fxqn e;
    private final fxur f;
    private ScheduledExecutorService g;

    public fxsk(Context context0, fxts fxts0, fxtt fxtt0, fxqn fxqn0, fxtr fxtr0) {
        fxur fxur0 = new fxur(context0);
        super();
        this.d = context0;
        this.a = fxts0;
        this.b = fxtt0;
        this.e = fxqn0;
        this.c = fxtr0;
        this.f = fxur0;
        fxva.g(context0);
    }

    public final fxug a() {
        return this.f(false, true, false);
    }

    public final fxuv b(Location location0) {
        Location location1 = this.a.e();
        int v = this.a.f;
        float f = fxuw.a(location0, location1);
        boolean z = true;
        if(Float.compare(f, 0.0f) <= 0) {
            return new fxuv(((boolean)(v ^ 1)), 1);
        }
        float f1 = location1.distanceTo(location0);
        float f2 = (float)hzek.b();
        if((f1 > f) && (f1 > f2)) {
            return new fxuv(true, 2);
        }
        if((f > f2)) {
            return new fxuv(((boolean)(v ^ 1)), 3);
        }
        if(f1 <= f2) {
            z = false;
        }
        return new fxuv(z, 4);
    }

    public final void c() {
        if(!hzek.v()) {
            ScheduledExecutorService scheduledExecutorService0 = this.g;
            if(scheduledExecutorService0 == null) {
                return;
            }
            scheduledExecutorService0.shutdownNow();
            this.g = null;
            return;
        }
        cljp.a(this.d).d("ULR", "com.google.android.location.reporting.service.UploadGcmTaskService");
    }

    public final void d(ReportingConfig reportingConfig0, Location location0) {
        this.e(reportingConfig0, this.b(location0), location0, false);
    }

    public final void e(ReportingConfig reportingConfig0, fxuv fxuv0, Location location0, boolean z) {
        synchronized(this) {
            this.c();
            fxts fxts0 = this.a;
            long v1 = SystemClock.elapsedRealtime();
            long v2 = fxts0.a();
            boolean z1 = fxuv0.a;
            fxug fxug0 = this.f(Long.compare(v2, 0L) <= 0, z1, z);
            long v3 = fxug0.c(z1) - (v1 - v2);
            if(fxts0.c() <= 1L) {
                fxqw.c("GCoreUlr", "Not uploading first location since start (in case we\'re in restart loop)");
            }
            else if(v3 <= 0L) {
                long v4 = System.currentTimeMillis();
                long v5 = fxug0.c(z1);
                int v6 = fxug0.d(z1);
                int v7 = fxug0.e();
                String s = fxug0.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzuh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gzuh)hftv0).b |= 1;
                ((gzuh)hftv0).c = v4;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gzuh)hftv1).b |= 16;
                ((gzuh)hftv1).g = v5;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gzuh)hftv2).h = v6 - 1;
                ((gzuh)hftv2).b |= 0x20;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                ((gzuh)hftv3).i = v7 - 1;
                ((gzuh)hftv3).b |= 0x40;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzuh gzuh0 = (gzuh)hftp0.b_message;
                gzuh0.b |= 0x100;
                gzuh0.k = s;
                gzuh gzuh1 = (gzuh)hftp0.N_build();
                gzty gzty0 = fxvb.c(gzuh1);
                List list0 = reportingConfig0.c();
                this.e.n(list0, gzty0, gzuh1.k);
                if(location0 != null) {
                    fxts0.u(location0);
                }
                fxts0.v(v1);
                fxtk.f(this.d);
                return;
            }
            if(v3 <= 0L) {
                return;
            }
            if(!hzek.v() && (this.g != null && !((bbll)this.g).d)) {
                fxqw.c("GCoreUlr", "Potential dangling upload identified");
            }
            this.c();
            if(hzek.v()) {
                cljp cljp0 = cljp.a(this.d);
                clkn clkn0 = new clkn();
                clkn0.e(v3 / 1000L, 10L + v3 / 1000L);
                clkn0.j = "com.google.android.location.reporting.service.UploadGcmTaskService";
                clkn0.p = false;
                clkn0.g(0);
                clkn0.x(0, 1);
                clkn0.t = cllc.a;
                clkn0.t("ULR");
                clkn0.v(1);
                cljp0.f(clkn0.a());
                return;
            }
            this.g = new bbll(1, 10);
            fxsi fxsi0 = new fxsi(this);
            ((bbll)this.g).g(fxsi0, v3, TimeUnit.MILLISECONDS);
        }
    }

    private final fxug f(boolean z, boolean z1, boolean z2) {
        if(z) {
            return fxsj.a;
        }
        fxug fxug0 = z1 ? fxsj.c : fxsj.d;
        fxts fxts0 = this.a;
        if(!fxts0.h && (fxts0.i || fxts0.j)) {
            return fxsj.d;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(this.b.e());
        if(fxts0.f() != null && fxts0.f().d().a() == 0) {
            fxro fxro0 = fxur.a(this.f.b);
            if(fxro0 != null && (fxro0.b & 1) != 0 && (fxrn.a(fxro0.c) != 0 && fxrn.a(fxro0.c) != 1)) {
                arrayList0.add(fxsj.b);
            }
        }
        if(z2) {
            arrayList0.add(fxsj.e);
        }
        for(Object object0: arrayList0) {
            fxug fxug1 = (fxug)object0;
            if(fxug1.c(z1) < fxug0.c(z1)) {
                fxug0 = fxug1;
            }
        }
        return fxug0;
    }
}

