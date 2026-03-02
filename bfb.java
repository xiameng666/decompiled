import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import j..util.Objects;
import java.io.ByteArrayOutputStream;

public final class bfb implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bsf bsf0 = ((bfa)object0).a;
        ((Bitmap)bsf0.a).compress(Bitmap.CompressFormat.JPEG, ((bfa)object0).b, byteArrayOutputStream0);
        return new bsf(byteArrayOutputStream0.toByteArray(), ((bnr)Objects.requireNonNull(bsf0.b)), (Build.VERSION.SDK_INT < 34 || !((Bitmap)bsf0.a).hasGainmap() ? 0x100 : 0x1005), bsf0.d, bsf0.e, bsf0.f, bsf0.g, bsf0.h);
    }
}

