import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

final class awh extends CameraCaptureSession.StateCallback {
    final awj a;

    public awh(awj awj0) {
        this.a = awj0;
        super();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession0) {
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession0) {
        Surface surface0 = cameraCaptureSession0.getInputSurface();
        if(surface0 != null) {
            awj awj0 = this.a;
            ImageWriter imageWriter0 = ImageWriter.newInstance(surface0, 1);
            if(awj0.b.get()) {
                if(awj0.a != null) {
                    bcs.d("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    awj0.a.close();
                }
                awj0.a = imageWriter0;
            }
        }
    }
}

