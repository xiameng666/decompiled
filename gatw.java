import android.hardware.Camera.PictureCallback;
import android.hardware.Camera;

public final class gatw implements Camera.PictureCallback {
    public final boolean a;
    public final gbsf b;

    public gatw(boolean z, gbsf gbsf0) {
        this.a = z;
        this.b = gbsf0;
    }

    @Override  // android.hardware.Camera$PictureCallback
    public final void onPictureTaken(byte[] arr_b, Camera camera0) {
        if(this.a) {
            camera0.startPreview();
        }
        this.b.bq(arr_b);
    }
}

