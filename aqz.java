import android.hardware.camera2.TotalCaptureResult;

public final class aqz implements bpa {
    public final arf a;
    public final int b;

    public aqz(arf arf0, int v) {
        this.a = arf0;
        this.b = v;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        arf arf0 = this.a;
        if(asf.e(this.b, ((TotalCaptureResult)object0))) {
            arf0.h = arf.a;
        }
        return arf0.j.a(((TotalCaptureResult)object0));
    }
}

