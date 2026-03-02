import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;
import java.util.List;

final class aqs implements arg {
    private final aow a;
    private boolean b;

    public aqs(aow aow0) {
        this.b = false;
        this.a = aow0;
    }

    @Override  // arg
    public final gmcd a(TotalCaptureResult totalCaptureResult0) {
        gmcd gmcd0 = bpt.b(Boolean.valueOf(true));
        if(totalCaptureResult0 != null) {
            Integer integer0 = (Integer)totalCaptureResult0.get(CaptureResult.CONTROL_AF_MODE);
            if(integer0 != null && (((int)integer0) == 1 || ((int)integer0) == 2)) {
                bcs.h("Camera2CapturePipeline");
                Integer integer1 = (Integer)totalCaptureResult0.get(CaptureResult.CONTROL_AF_STATE);
                if(integer1 != null && ((int)integer1) == 0) {
                    bcs.h("Camera2CapturePipeline");
                    this.b = true;
                    aud aud0 = this.a.c;
                    if(aud0.d) {
                        bjm bjm0 = new bjm();
                        bjm0.b = aud0.f;
                        bjm0.m();
                        ans ans0 = new ans();
                        ans0.d(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                        bjm0.f(ans0.a());
                        bjm0.d(new aub());
                        List list0 = Collections.singletonList(bjm0.b());
                        aud0.b.x(list0);
                    }
                }
            }
        }
        return gmcd0;
    }

    @Override  // arg
    public final void b() {
        if(this.b) {
            bcs.h("Camera2CapturePipeline");
            this.a.c.c(true, false);
        }
    }

    @Override  // arg
    public final boolean c() {
        return true;
    }
}

