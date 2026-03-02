import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

public final class aww extends awv {
    public aww(Context context0) {
        super(context0);
    }

    @Override  // awx
    public final Set c() {
        try {
            return this.a.getConcurrentCameraIds();
        }
        catch(CameraAccessException cameraAccessException0) {
            throw new awl(cameraAccessException0);
        }
    }
}

