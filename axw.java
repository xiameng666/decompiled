import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

public final class axw {
    public final boolean a;
    public final boolean b;

    public axw(blp blp0) {
        this.a = blp0.c(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = axv.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}

