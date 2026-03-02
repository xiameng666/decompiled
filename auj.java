import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

final class auj extends aqm {
    static final auj b;

    static {
        auj.b = new auj();
    }

    @Override  // aqm
    public final void a(bnc bnc0, bjm bjm0) {
        super.a(bnc0, bjm0);
        if(!(bnc0 instanceof bkk)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        ans ans0 = new ans();
        if(blq.g(bnc0, bkk.a)) {
            int v = ((bkk)bnc0).D();
            if(((ImageCapturePixelHDRPlusQuirk)axv.a(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                switch(v) {
                    case 0: {
                        ans0.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.valueOf(true));
                        break;
                    }
                    case 1: {
                        ans0.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.valueOf(false));
                    }
                }
            }
        }
        bjm0.f(ans0.a());
    }
}

