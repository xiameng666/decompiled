import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCaptureSession;

public final class aoa extends CameraCaptureSession.StateCallback {
    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession0) {
        ibuq.f(cameraCaptureSession0, "p0");
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession0) {
        ibuq.f(cameraCaptureSession0, "p0");
    }
}

