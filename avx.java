import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

public final class avx implements aov {
    public final avy a;

    public avx(avy avy0) {
        this.a = avy0;
    }

    @Override  // aov
    public final boolean a(TotalCaptureResult totalCaptureResult0) {
        avy avy0 = this.a;
        if(avy0.e != null) {
            Integer integer0 = (Integer)totalCaptureResult0.getRequest().get(CaptureRequest.FLASH_MODE);
            if((integer0 != null && ((int)integer0) == 2) == avy0.f) {
                avy0.e.b(null);
                avy0.e = null;
            }
        }
        return false;
    }
}

