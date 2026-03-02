import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;

public final class ayr {
    public final boolean a;
    public final boolean b;

    public ayr(blp blp0) {
        boolean z = false;
        super();
        for(Object object0: blp0.b(CaptureIntentPreviewQuirk.class)) {
            if(((CaptureIntentPreviewQuirk)object0).b()) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.b = blp0.c(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}

