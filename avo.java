import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

final class avo extends CameraCaptureSession.StateCallback {
    final avp a;

    public avo(avp avp0) {
        this.a = avp0;
        super();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession0) {
        this.a.n(cameraCaptureSession0);
        this.a.e(this.a);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession0) {
        this.a.n(cameraCaptureSession0);
        this.a.f(this.a);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession0) {
        this.a.n(cameraCaptureSession0);
        this.a.g(this.a);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession0) {
        jqt jqt0;
        try {
            this.a.n(cameraCaptureSession0);
            this.a.a(this.a);
        }
        finally {
            synchronized(this.a.a) {
                kay.j(this.a.h, "OpenCaptureSession completer should not null");
                jqt0 = this.a.h;
                this.a.h = null;
            }
            jqt0.c(new IllegalStateException("onConfigureFailed"));
        }
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession0) {
        jqt jqt0;
        try {
            this.a.n(cameraCaptureSession0);
            this.a.b(this.a);
        }
        finally {
            synchronized(this.a.a) {
                kay.j(this.a.h, "OpenCaptureSession completer should not null");
                jqt0 = this.a.h;
                this.a.h = null;
            }
            jqt0.b(null);
        }
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession0) {
        this.a.n(cameraCaptureSession0);
        this.a.c(this.a);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession0, Surface surface0) {
        this.a.n(cameraCaptureSession0);
        this.a.h(this.a, surface0);
    }
}

