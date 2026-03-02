import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

final class ayl extends CameraCaptureSession.CaptureCallback {
    final gmcd a;
    jqt b;

    public ayl() {
        this.a = jqy.a(new ayk(this));
    }

    private final void a() {
        jqt jqt0 = this.b;
        if(jqt0 != null) {
            jqt0.b(null);
            this.b = null;
        }
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, TotalCaptureResult totalCaptureResult0) {
        this.a();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, CaptureFailure captureFailure0) {
        this.a();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession0, int v) {
        this.a();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession0, int v, long v1) {
        this.a();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, long v, long v1) {
        this.a();
    }
}

