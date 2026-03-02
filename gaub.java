import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import j..util.Objects;

final class gaub extends CameraDevice.StateCallback {
    final gatq a;
    final gaue b;

    public gaub(gaue gaue0, gatq gatq0) {
        this.a = gatq0;
        Objects.requireNonNull(gaue0);
        this.b = gaue0;
        super();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onClosed(CameraDevice cameraDevice0) {
        this.b.k = null;
        this.b.j = false;
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onDisconnected(CameraDevice cameraDevice0) {
        cameraDevice0.close();
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onError(CameraDevice cameraDevice0, int v) {
        Log.e("CameraManagerV2Impl", "Couldn\'t open camera");
        this.b.i(this.a, false);
    }

    @Override  // android.hardware.camera2.CameraDevice$StateCallback
    public final void onOpened(CameraDevice cameraDevice0) {
        this.b.k = cameraDevice0;
        this.b.i(this.a, true);
    }
}

