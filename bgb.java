import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import j..util.Objects;

public final class bgb implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        bcn bcn0;
        bdm bdm0 = new bdm(bcp.a(((bsf)object0).d.getWidth(), ((bsf)object0).d.getHeight(), 0x100, 2));
        kay.a(bdm0.b() == 0x100);
        Surface surface0 = bdm0.e();
        kay.i(surface0);
        if(ImageProcessingUtil.nativeWriteJpegToSurface(((byte[])((bsf)object0).a), surface0) == 0) {
            bcn0 = bdm0.f();
            if(bcn0 == null) {
                bcs.a("ImageProcessingUtil", "Failed to get acquire JPEG image.");
            }
        }
        else {
            bcs.a("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            bcn0 = null;
        }
        bdm0.k();
        return bsf.a(((bcn)Objects.requireNonNull(bcn0)), ((bnr)Objects.requireNonNull(((bsf)object0).b)), ((bsf)object0).e, ((bsf)object0).f, ((bsf)object0).g, ((bsf)object0).h);
    }
}

