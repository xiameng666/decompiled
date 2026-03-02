import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CaptureRequest.Key;

public final class ant extends azi {
    public static final bjr a;
    public static final bjr b;
    public static final bjr c;
    public static final bjr d;
    public static final bjr e;
    public static final bjr f;

    static {
        ant.a = new bjr("camera2.captureRequest.templateType", Integer.TYPE, null);
        ant.b = new bjr("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
        ant.c = new bjr("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        ant.d = new bjr("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        ant.e = new bjr("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        new bjr("camera2.captureRequest.tag", Object.class, null);
        ant.f = new bjr("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }

    public ant(bjt bjt0) {
        super(bjt0);
    }

    public final int a(int v) {
        return (int)(((Integer)this.g.m(ant.a, Integer.valueOf(v))));
    }

    public final CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback0) {
        return (CameraCaptureSession.CaptureCallback)this.g.m(ant.e, cameraCaptureSession$CaptureCallback0);
    }

    public final azi c() {
        return azh.a(this.g).b();
    }

    public static bjr d(CaptureRequest.Key captureRequest$Key0) {
        return new bjr("camera2.captureRequest.option." + captureRequest$Key0.getName(), Object.class, captureRequest$Key0);
    }

    public final String e() {
        return (String)this.g.m(ant.f, null);
    }
}

