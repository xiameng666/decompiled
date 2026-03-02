import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

public final class bre {
    public final boolean a;

    public bre() {
        this.a = bqz.a(SurfaceOrderQuirk.class) != null;
    }

    public static final int a(bka bka0) {
        Class class0 = bka0.n;
        if(class0 != MediaCodec.class) {
            return class0 == bdf.class || class0 == bud.class ? 0 : 1;
        }
        return 2;
    }
}

