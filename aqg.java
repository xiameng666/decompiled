import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class aqg extends CameraDevice.StateCallback {
    ScheduledFuture a;
    final aqi b;
    private final Executor c;
    private final ScheduledExecutorService d;
    private aqf e;
    private final aqd f;

    public aqg(aqi aqi0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, long v) {
        this.b = aqi0;
        super();
        this.c = executor0;
        this.d = scheduledExecutorService0;
        this.f = new aqd(this, v);
    }

    final void a() {
        this.f.d();
    }

    final void b() {
        boolean z = true;
        kay.c(this.e == null);
        if(this.a != null) {
            z = false;
        }
        kay.c(z);
        aqd aqd0 = this.f;
        if(aqd0.c() >= ((long)aqd0.b())) {
            aqd0.d();
            bcs.a("Camera2CameraImpl", "Camera reopening attempted for " + aqd0.b() + "ms without success.");
            this.b.L(4, null, false);
            return;
        }
        this.e = new aqf(this, this.c);
        aqd0.a();
        Objects.toString(this.e);
        this.b.O();
        aqf aqf0 = this.e;
        long v = (long)aqd0.a();
        this.a = this.d.schedule(aqf0, v, TimeUnit.MILLISECONDS);
    }

    final boolean c() {
        if(this.a != null) {
            Objects.toString(this.e);
            this.b.O();
            this.e.a = true;
            this.e = null;
            this.a.cancel(false);
            this.a = null;
            return true;
        }
        return false;
    }

    final boolean d() {
        return this.b.x ? this.b.j == 1 || this.b.j == 2 : false;
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onClosed(CameraDevice cameraDevice0) {
        aqi aqi0 = this.b;
        aqi0.O();
        CameraDevice cameraDevice1 = aqi0.i;
        Objects.toString(cameraDevice0);
        kay.d(cameraDevice1 == null, "Unexpected onClose callback on camera device: " + cameraDevice0);
        int v = aqi0.A - 1;
        if(aqi0.A != 0) {
            switch(v) {
                case 1: 
                case 5: {
                    kay.c(aqi0.I());
                    aqi0.o();
                    return;
                }
                case 6: 
                case 7: {
                    if(aqi0.j != 0) {
                        aqi0.O();
                        this.b();
                        return;
                    }
                    aqi0.B(false);
                    return;
                }
                default: {
                    int v1 = aqi0.A;
                    Objects.toString(aqc.a(v1));
                    throw new IllegalStateException("Camera closed while in state: " + aqc.a(v1));
                }
            }
        }
        throw null;
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onDisconnected(CameraDevice cameraDevice0) {
        this.b.O();
        this.onError(cameraDevice0, 1);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onError(CameraDevice cameraDevice0, int v) {
        int v1 = 1;
        aqi aqi0 = this.b;
        aqi0.i = cameraDevice0;
        aqi0.j = v;
        aqi0.z.b.O();
        aqi0.z.a();
        int v2 = aqi0.A - 1;
        if(aqi0.A == 0) {
            throw null;
        }
        if(v2 != 1) {
            switch(v2) {
                case 5: {
                    break;
                }
                case 6: 
                case 7: 
                case 8: 
                case 9: {
                    cameraDevice0.getId();
                    if(aqi0.A == 0) {
                        throw null;
                    }
                    bcs.h("Camera2CameraImpl");
                    boolean z = false;
                    boolean z1 = aqi0.A == 7 || aqi0.A == 8 || aqi0.A == 9 || aqi0.A == 10;
                    int v4 = aqi0.A;
                    Objects.toString(aqc.a(v4));
                    kay.d(z1, "Attempt to handle open error from non open state: " + aqc.a(v4));
                    if(v != 1 && v != 2 && v != 4) {
                        bcs.a("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice0.getId() + ": " + aqi.i(v) + " closing camera.");
                        aqi0.K(6, new bac((v == 3 ? 5 : 6), null));
                        aqi0.M();
                        return;
                    }
                    cameraDevice0.getId();
                    bcs.h("Camera2CameraImpl");
                    if(aqi0.j != 0) {
                        z = true;
                    }
                    kay.d(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    switch(v) {
                        case 1: {
                            v1 = 2;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            v1 = 3;
                        }
                    }
                    aqi0.K(8, new bac(v1, null));
                    aqi0.M();
                    return;
                }
                default: {
                    int v3 = aqi0.A;
                    Objects.toString(aqc.a(v3));
                    throw new IllegalStateException("onError() should not be possible from state: " + aqc.a(v3));
                }
            }
        }
        String s = cameraDevice0.getId();
        String s1 = aqi.i(v);
        String s2 = aqc.a(aqi0.A);
        if(aqi0.A == 0) {
            throw null;
        }
        bcs.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", s, s1, s2));
        aqi0.M();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onOpened(CameraDevice cameraDevice0) {
        aqi aqi0 = this.b;
        aqi0.O();
        aqi0.i = cameraDevice0;
        aqi0.j = 0;
        this.a();
        int v = aqi0.A - 1;
        if(aqi0.A != 0) {
            switch(v) {
                case 1: 
                case 5: {
                    kay.c(aqi0.I());
                    aqi0.i.close();
                    aqi0.i = null;
                    return;
                }
                case 6: 
                case 7: 
                case 8: {
                    aqi0.J(10);
                    cameraDevice0.getId();
                    String s = aqi0.i.getId();
                    aqi0.B.c(s);
                    aqi0.q.e();
                    aqi0.w();
                    return;
                }
                default: {
                    int v1 = aqi0.A;
                    Objects.toString(aqc.a(v1));
                    throw new IllegalStateException("onOpened() should not be possible from state: " + aqc.a(v1));
                }
            }
        }
        throw null;
    }
}

