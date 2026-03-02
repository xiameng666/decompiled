import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

final class aou extends CameraCaptureSession.CaptureCallback {
    final Set a;
    private final Executor b;

    public aou(Executor executor0) {
        this.a = new HashSet();
        this.b = executor0;
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, TotalCaptureResult totalCaptureResult0) {
        aot aot0 = new aot(this, totalCaptureResult0);
        this.b.execute(aot0);
    }
}

