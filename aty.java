import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

public final class aty implements aov {
    public final aud a;
    public final long b;
    public final jqt c;

    public aty(aud aud0, long v, jqt jqt0) {
        this.a = aud0;
        this.b = v;
        this.c = jqt0;
    }

    @Override  // aov
    public final boolean a(TotalCaptureResult totalCaptureResult0) {
        boolean z = ((int)(((Integer)totalCaptureResult0.get(CaptureResult.CONTROL_AE_MODE)))) == 5;
        bcs.h("FocusMeteringControl");
        if(z == this.a.k && aow.y(totalCaptureResult0, this.b)) {
            bcs.h("FocusMeteringControl");
            this.c.b(null);
            return true;
        }
        return false;
    }
}

