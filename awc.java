import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;

final class awc {
    public final aow a;
    public final awd b;
    public final lqi c;
    final awb d;
    public boolean e;
    private final aov f;

    public awc(aow aow0, awp awp0) {
        this.e = false;
        awa awa0 = new awa(this);
        this.f = awa0;
        this.a = aow0;
        aoc aoc0 = awc.a(awp0) == null ? new atq(awp0) : new aoc(awp0);
        this.d = aoc0;
        awd awd0 = new awd(aoc0.a(), aoc0.b());
        this.b = awd0;
        awd0.a();
        this.c = new lqi(bqk.a(awd0));
        aow0.h(awa0);
    }

    private static Range a(awp awp0) {
        try {
            return (Range)awp0.c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        }
        catch(AssertionError assertionError0) {
            bcs.e("ZoomControl", "AssertionError, fail to get camera characteristic.", assertionError0);
            return null;
        }
    }
}

