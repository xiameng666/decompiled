import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.util.Log;
import android.view.SurfaceHolder;
import j..util.Objects;

final class gaud extends CameraCaptureSession.StateCallback {
    final SurfaceHolder a;
    final ImageReader b;
    final gaue c;

    public gaud(gaue gaue0, SurfaceHolder surfaceHolder0, ImageReader imageReader0) {
        this.a = surfaceHolder0;
        this.b = imageReader0;
        Objects.requireNonNull(gaue0);
        this.c = gaue0;
        super();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession0) {
        Log.e("CameraManagerV2Impl", "Couldn\'t start camera preview");
        gatq gatq0 = this.c.b;
        if(gatq0 != null) {
            gatq0.ng();
        }
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession0) {
        try {
            gaue gaue0 = this.c;
            gaue0.l = cameraCaptureSession0;
            CaptureRequest.Builder captureRequest$Builder0 = gaue0.k.createCaptureRequest(1);
            captureRequest$Builder0.addTarget(this.a.getSurface());
            ImageReader imageReader0 = this.b;
            if(imageReader0 != null) {
                captureRequest$Builder0.addTarget(imageReader0.getSurface());
            }
            captureRequest$Builder0.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
            if(gaue0.n == 4) {
                captureRequest$Builder0.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            }
            synchronized(gaue0) {
                gaue0.y(captureRequest$Builder0);
                gaue0.w(captureRequest$Builder0.build());
                gaue0.m = captureRequest$Builder0;
                gaue0.j = true;
            }
        }
        catch(CameraAccessException unused_ex) {
            Log.e("CameraManagerV2Impl", "Couldn\'t start camera preview");
            gatq gatq0 = this.c.b;
            if(gatq0 != null) {
                gatq0.ng();
            }
        }
    }
}

