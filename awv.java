import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice.StateCallback;
import java.util.concurrent.Executor;

class awv extends awu {
    public awv(Context context0) {
        super(context0);
    }

    @Override  // awx
    public final CameraCharacteristics a(String s) {
        try {
            return this.a.getCameraCharacteristics(s);
        }
        catch(CameraAccessException cameraAccessException0) {
            throw new awl(cameraAccessException0);
        }
    }

    @Override  // awx
    public final void b(String s, Executor executor0, CameraDevice.StateCallback cameraDevice$StateCallback0) {
        try {
            this.a.openCamera(s, executor0, cameraDevice$StateCallback0);
        }
        catch(CameraAccessException cameraAccessException0) {
            throw new awl(cameraAccessException0);
        }
    }
}

