import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera;

public final class gatu implements Camera.AutoFocusCallback {
    public final gatx a;

    public gatu(gatx gatx0) {
        this.a = gatx0;
    }

    @Override  // android.hardware.Camera$AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera0) {
        this.a.l.set(false);
    }
}

