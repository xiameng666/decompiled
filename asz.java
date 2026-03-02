import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

final class asz extends CameraCaptureSession.CaptureCallback {
    private final bhl a;

    public asz(bhl bhl0) {
        if(bhl0 == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.a = bhl0;
    }

    private static final int a(CaptureRequest captureRequest0) {
        if((captureRequest0.getTag() instanceof bms)) {
            Integer integer0 = (Integer)((bms)captureRequest0.getTag()).a("CAPTURE_CONFIG_ID_KEY");
            return integer0 == null ? -1 : ((int)integer0);
        }
        return -1;
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, TotalCaptureResult totalCaptureResult0) {
        bms bms0;
        super.onCaptureCompleted(cameraCaptureSession0, captureRequest0, totalCaptureResult0);
        Object object0 = captureRequest0.getTag();
        if(object0 == null) {
            bms0 = bms.a;
        }
        else {
            kay.b(object0 instanceof bms, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            bms0 = (bms)object0;
        }
        int v = asz.a(captureRequest0);
        aoe aoe0 = new aoe(bms0, totalCaptureResult0);
        this.a.b(v, aoe0);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, CaptureFailure captureFailure0) {
        super.onCaptureFailed(cameraCaptureSession0, captureRequest0, captureFailure0);
        bhp bhp0 = new bhp();
        int v = asz.a(captureRequest0);
        this.a.c(v, bhp0);
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, long v, long v1) {
        super.onCaptureStarted(cameraCaptureSession0, captureRequest0, v, v1);
        int v2 = asz.a(captureRequest0);
        this.a.d(v2);
    }
}

