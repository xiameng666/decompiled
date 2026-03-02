import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import j..util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class avp extends avh {
    final Object a;
    final atp b;
    final Executor c;
    public final ScheduledExecutorService d;
    avh e;
    awm f;
    gmcd g;
    jqt h;
    public gmcd i;
    public List j;
    public boolean k;
    private boolean l;
    private boolean m;

    public avp(atp atp0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = new Object();
        this.j = null;
        this.l = false;
        this.k = false;
        this.m = false;
        this.b = atp0;
        this.c = executor0;
        this.d = scheduledExecutorService0;
    }

    @Override  // avh
    public final void a(avp avp0) {
        Objects.requireNonNull(this.e);
        this.o();
        this.b.e(this);
        this.e.a(avp0);
    }

    @Override  // avh
    public void b(avp avp0) {
        Objects.requireNonNull(this.e);
        synchronized(this.b.b) {
            this.b.c.add(this);
            this.b.e.remove(this);
        }
        this.b.d(this);
        this.e.b(avp0);
    }

    @Override  // avh
    public final void c(avp avp0) {
        Objects.requireNonNull(this.e);
        this.e.c(avp0);
    }

    @Override  // avh
    public final void d(avp avp0) {
        gmcd gmcd0;
        synchronized(this.a) {
            if(this.m) {
                gmcd0 = null;
            }
            else {
                this.m = true;
                kay.j(this.g, "Need to call openCaptureSession before using this API.");
                gmcd0 = this.g;
            }
        }
        if(gmcd0 != null) {
            gmcd0.hB(new avi(this, avp0), bol.a());
        }
    }

    @Override  // avh
    public final void e(avp avp0) {
        Objects.requireNonNull(this.e);
        this.e.e(avp0);
    }

    @Override  // avh
    public final void f(avp avp0) {
        Objects.requireNonNull(this.e);
        this.e.f(avp0);
    }

    @Override  // avh
    public void g(avp avp0) {
        gmcd gmcd0;
        synchronized(this.a) {
            if(this.l) {
                gmcd0 = null;
            }
            else {
                this.l = true;
                kay.j(this.g, "Need to call openCaptureSession before using this API.");
                gmcd0 = this.g;
            }
        }
        this.o();
        if(gmcd0 != null) {
            gmcd0.hB(new avk(this, avp0), bol.a());
        }
    }

    @Override  // avh
    public final void h(avp avp0, Surface surface0) {
        Objects.requireNonNull(this.e);
        this.e.h(avp0, surface0);
    }

    public final CameraDevice i() {
        kay.i(this.f);
        return this.f.a().getDevice();
    }

    public final awm j() {
        kay.i(this.f);
        return this.f;
    }

    public gmcd k() {
        return bpt.b(null);
    }

    public final List l(CaptureRequest captureRequest0) {
        awm awm0 = this.f;
        kay.i(awm0);
        CameraCaptureSession cameraCaptureSession0 = awm0.a();
        return (cameraCaptureSession0 instanceof CameraConstrainedHighSpeedCaptureSession) ? ((CameraConstrainedHighSpeedCaptureSession)cameraCaptureSession0).createHighSpeedRequestList(captureRequest0) : Collections.EMPTY_LIST;
    }

    public void m() {
        kay.j(this.f, "Need to call openCaptureSession before using this API.");
        synchronized(this.b.b) {
            this.b.d.add(this);
        }
        this.f.a().close();
        avj avj0 = new avj(this);
        this.c.execute(avj0);
    }

    final void n(CameraCaptureSession cameraCaptureSession0) {
        if(this.f == null) {
            this.f = new awm(cameraCaptureSession0);
        }
    }

    public void o() {
        this.q();
    }

    public void p(int v) {
    }

    final void q() {
        synchronized(this.a) {
            List list0 = this.j;
            if(list0 != null) {
                bke.a(list0);
                this.j = null;
            }
        }
    }

    public final void r() {
        kay.j(this.f, "Need to call openCaptureSession before using this API.");
        this.f.a().stopRepeating();
    }

    final boolean s() {
        synchronized(this.a) {
        }
        return this.g != null;
    }

    public boolean t() {
        throw null;
    }

    public void u(List list0, CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback0) {
        throw null;
    }
}

