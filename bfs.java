import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;

public final class bfs implements bse {
    public final DngCreator a;

    public bfs(CameraCharacteristics cameraCharacteristics0, CaptureResult captureResult0) {
        DngCreator dngCreator0 = new DngCreator(cameraCharacteristics0, captureResult0);
        super();
        this.a = dngCreator0;
    }

    @Override  // bse
    public final Object a(Object object0) {
        throw null;
    }
}

