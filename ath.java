import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;

final class ath extends CameraCaptureSession.CaptureCallback {
    final atk a;

    public ath(atk atk0) {
        this.a = atk0;
        super();
    }

    @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, TotalCaptureResult totalCaptureResult0) {
        atk atk0 = this.a;
        synchronized(atk0.a) {
            bmb bmb0 = atk0.c;
            if(bmb0 == null) {
                return;
            }
            bjo bjo0 = bmb0.g;
            bcs.h("CaptureSession");
            bjm bjm0 = new bjm();
            bjm0.b = bjo0.f;
            for(Object object1: bjo0.e()) {
                bjm0.g(((bka)object1));
            }
            bjm0.f(bjo0.e);
            ans ans0 = new ans();
            ans0.d(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            bjm0.f(ans0.a());
            atk0.g(Collections.singletonList(bjm0.b()));
        }
    }
}

