import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import java.util.Set;
import java.util.concurrent.Executor;

public class awx {
    final CameraManager a;

    public awx(Context context0) {
        this.a = (CameraManager)context0.getSystemService("camera");
    }

    public CameraCharacteristics a(String s) {
        throw null;
    }

    public void b(String s, Executor executor0, CameraDevice.StateCallback cameraDevice$StateCallback0) {
        throw null;
    }

    public Set c() {
        throw null;
    }

    public final String[] d() {
        try {
            return this.a.getCameraIdList();
        }
        catch(CameraAccessException cameraAccessException0) {
            throw new awl(cameraAccessException0);
        }
    }
}

