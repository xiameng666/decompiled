import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

public final class ayg {
    public final boolean a;
    public boolean b;

    public ayg(blp blp0) {
        boolean z = false;
        this.b = false;
        if(blp0.a(AutoFlashUnderExposedQuirk.class) != null) {
            z = true;
        }
        this.a = z;
    }
}

