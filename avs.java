import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

final class avs extends avp {
    public final Object l;
    public List m;
    gmcd n;
    public final aym o;
    public final ayo p;
    private final ScheduledExecutorService q;
    private final ayd r;
    private final ayc s;
    private final AtomicBoolean t;

    public avs(blp blp0, blp blp1, atp atp0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        super(atp0, executor0, scheduledExecutorService0);
        this.l = new Object();
        boolean z = false;
        this.t = new AtomicBoolean(false);
        this.r = new ayd(blp0, blp1);
        if(blp0.c(CaptureSessionStuckQuirk.class) || blp0.c(IncorrectCaptureStateQuirk.class)) {
            z = true;
        }
        this.o = new aym(z);
        this.s = new ayc(blp1);
        this.p = new ayo(blp1);
        this.q = scheduledExecutorService0;
    }

    @Override  // avp
    public final void b(avp avp0) {
        this.v("Session onConfigured()");
        ayc ayc0 = this.s;
        atp atp0 = this.b;
        List list0 = atp0.b();
        List list1 = atp0.a();
        if(ayc0.a()) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(Object object0: list0) {
                if(((avp)object0) == avp0) {
                    break;
                }
                linkedHashSet0.add(((avp)object0));
            }
            for(Object object1: linkedHashSet0) {
                avp avp1 = (avp)object1;
                avp1.a(avp1);
            }
        }
        super.b(avp0);
        if(ayc0.a()) {
            LinkedHashSet linkedHashSet1 = new LinkedHashSet();
            for(Object object2: list1) {
                if(((avp)object2) == avp0) {
                    break;
                }
                linkedHashSet1.add(((avp)object2));
            }
            for(Object object3: linkedHashSet1) {
                avp avp2 = (avp)object3;
                avp2.g(avp2);
            }
        }
    }

    @Override  // avp
    public final void g(avp avp0) {
        synchronized(this.l) {
            this.r.a(this.m);
        }
        this.v("onClosed()");
        super.g(avp0);
    }

    @Override  // avp
    public final gmcd k() {
        gmcd gmcd0 = this.o.b();
        return bpt.c(1500L, this.q, gmcd0);
    }

    @Override  // avp
    public final void m() {
        if(!this.t.compareAndSet(false, true)) {
            this.v("close() has been called. Skip this invocation.");
            return;
        }
        if(this.p.a) {
            try {
                this.v("Call abortCaptures() before closing session.");
                kay.j(this.f, "Need to call openCaptureSession before using this API.");
                this.f.a().abortCaptures();
            }
            catch(Exception exception0) {
                this.v("Exception when calling abortCaptures()" + exception0.toString());
            }
        }
        this.v("Session call close()");
        this.o.b().hB(() -> {
            this.v("Session call super.close()");
            super.m();
        }, this.c);
    }

    @Override  // avp
    public final void o() {
        this.q();
        this.o.c();
    }

    @Override  // avp
    public final void p(int v) {
        if(v == 5) {
            Object object0 = this.l;
            synchronized(object0) {
                if(this.s() && this.m != null) {
                    this.v("Close DeferrableSurfaces for CameraDevice error.");
                    for(Object object1: this.m) {
                        ((bka)object1).d();
                    }
                }
            }
        }
    }

    @Override  // avp
    public final boolean t() {
        boolean z;
        gmcd gmcd1;
        synchronized(this.l) {
            if(this.s()) {
                this.r.a(this.m);
            }
            else {
                gmcd gmcd0 = this.n;
                if(gmcd0 != null) {
                    gmcd0.cancel(true);
                }
            }
            try {
                gmcd1 = null;
                synchronized(this.a) {
                    if(!this.k) {
                        gmcd gmcd2 = this.i;
                        if(gmcd2 != null) {
                            gmcd1 = gmcd2;
                        }
                        this.k = true;
                    }
                    z = this.s() ^ 1;
                }
            }
            catch(Throwable throwable1) {
                if(gmcd1 != null) {
                    gmcd1.cancel(true);
                }
                throw throwable1;
            }
            if(gmcd1 != null) {
                gmcd1.cancel(true);
            }
        }
        return z;
    }

    @Override  // avp
    public final void u(List list0, CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback0) {
        CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback1 = this.o.a(cameraCaptureSession$CaptureCallback0);
        kay.j(this.f, "Need to call openCaptureSession before using this API.");
        this.f.a.a.captureBurstRequests(list0, this.c, cameraCaptureSession$CaptureCallback1);
    }

    final void v(String s) {
        bcs.h("SyncCaptureSessionImpl");
    }
}

