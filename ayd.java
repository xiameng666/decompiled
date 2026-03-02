import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.List;

public final class ayd {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public ayd(blp blp0, blp blp1) {
        this.a = blp1.c(TextureViewIsClosedQuirk.class);
        this.b = blp0.c(PreviewOrientationIncorrectQuirk.class);
        this.c = blp0.c(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(List list0) {
        if((this.a || this.b || this.c) && list0 != null) {
            for(Object object0: list0) {
                ((bka)object0).d();
            }
            bcs.h("ForceCloseDeferrableSurface");
        }
    }
}

