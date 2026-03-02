import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

final class axe implements axb {
    static final axc a;
    private static final Set b;

    static {
        axe.a = new axc(new axe());
        axe.b = Collections.singleton(bat.b);
    }

    @Override  // axb
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override  // axb
    public final Set b(bat bat0) {
        boolean z = bat.b.equals(bat0);
        Objects.toString(bat0);
        kay.b(z, "DynamicRange is not supported: " + bat0);
        return axe.b;
    }

    @Override  // axb
    public final Set c() {
        return axe.b;
    }
}

