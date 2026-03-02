import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import j..util.Objects;
import java.util.Collections;

final class apt extends CameraDevice.StateCallback {
    final jqt a;
    final aqi b;

    public apt(aqi aqi0, jqt jqt0) {
        this.b = aqi0;
        this.a = jqt0;
        super();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onClosed(CameraDevice cameraDevice0) {
        this.b.O();
        this.a.b(null);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onDisconnected(CameraDevice cameraDevice0) {
        this.b.O();
        this.a.b(null);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onError(CameraDevice cameraDevice0, int v) {
        this.b.O();
        this.a.b(null);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onOpened(CameraDevice cameraDevice0) {
        this.b.O();
        blp blp0 = new blp(Collections.EMPTY_LIST);
        atk atk0 = new atk(this.b.y, blp0, false, null);
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(0);
        surfaceTexture0.setDefaultBufferSize(640, 480);
        Surface surface0 = new Surface(surfaceTexture0);
        bkr bkr0 = new bkr(surface0);
        bkr0.c().hB(new apg(surface0, surfaceTexture0), bol.a());
        blt blt0 = new blt();
        blt0.i(bkr0);
        blt0.q(1);
        this.b.O();
        gmcd gmcd0 = bpt.g(bpf.a(bpt.h(atk0.m(blt0.a(), cameraDevice0, this.b.v.a()))), new aph(atk0, bkr0), this.b.c);
        Objects.requireNonNull(cameraDevice0);
        gmcd0.hB(new aps(cameraDevice0), this.b.c);
    }
}

