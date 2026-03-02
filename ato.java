import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import java.util.LinkedHashSet;
import java.util.List;

final class ato extends CameraDevice.StateCallback {
    final atp a;
    public static final int b;

    public ato(atp atp0) {
        this.a = atp0;
        super();
    }

    private final void a() {
        synchronized(this.a.b) {
            List list0 = this.a.c();
            this.a.e.clear();
            this.a.c.clear();
            this.a.d.clear();
        }
        for(Object object0: list0) {
            ((avp)object0).o();
        }
    }

    private final void b() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        synchronized(this.a.b) {
            linkedHashSet0.addAll(this.a.e);
            linkedHashSet0.addAll(this.a.c);
        }
        atm atm0 = new atm(linkedHashSet0);
        this.a.a.execute(atm0);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onClosed(CameraDevice cameraDevice0) {
        this.b();
        this.a();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onDisconnected(CameraDevice cameraDevice0) {
        this.b();
        this.a();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onError(CameraDevice cameraDevice0, int v) {
        this.b();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        synchronized(this.a.b) {
            linkedHashSet0.addAll(this.a.e);
            linkedHashSet0.addAll(this.a.c);
        }
        atn atn0 = new atn(linkedHashSet0, v);
        this.a.a.execute(atn0);
        this.a();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onOpened(CameraDevice cameraDevice0) {
    }
}

