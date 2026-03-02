import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CameraCharacteristics;

public final class awo {
    public final CameraCharacteristics a;

    public awo(CameraCharacteristics cameraCharacteristics0) {
        this.a = cameraCharacteristics0;
    }

    public final Object a(CameraCharacteristics.Key cameraCharacteristics$Key0) {
        return this.a.get(cameraCharacteristics$Key0);
    }
}

