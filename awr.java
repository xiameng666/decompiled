import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;

final class awr extends aws {
    public awr(CameraDevice cameraDevice0) {
        kay.i(cameraDevice0);
        super(cameraDevice0, null);
    }

    @Override  // aws
    public final void a(axr axr0) {
        try {
            this.a.createCaptureSession(axr0.a.a);
        }
        catch(CameraAccessException cameraAccessException0) {
            throw new awl(cameraAccessException0);
        }
    }
}

