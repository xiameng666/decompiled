import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

public final class bfu implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        throw null;
    }

    public static final void b(bsf bsf0) {
        Throwable throwable2;
        bdm bdm1;
        bcn bcn0;
        bdm bdm0 = null;
        try {
            int v = bsf0.c;
            if(v == 35) {
                bcn0 = (bcn)bsf0.a;
                boolean z = bsf0.f % 180 != 0;
                bdm1 = new bdm(bcp.a((z ? bcn0.b() : bcn0.c()), (z ? bcn0.c() : bcn0.b()), 1, 2));
                goto label_17;
            }
            else {
                if(v != 0x100 && v != 0x1005) {
                    throw new IllegalArgumentException("Invalid postview image format : " + v);
                }
                Bitmap bitmap0 = brh.a(((bcn)bsf0.a));
                ((bcn)bsf0.a).close();
                Matrix matrix0 = new Matrix();
                matrix0.postRotate(((float)bsf0.f));
                Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
            }
            goto label_37;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            throw new bcf(a.a((bsf0.c == 35 ? "YUV" : "JPEG"), "Can\'t convert ", " to bitmap"), unsupportedOperationException0);
            try {
            label_17:
                bcn bcn1 = ImageProcessingUtil.a(bcn0, bdm1, ByteBuffer.allocateDirect(bcn0.c() * bcn0.b() * 4), bsf0.f, false);
                bcn0.close();
                if(bcn1 == null) {
                    throw new bcf("Can\'t covert YUV to RGB", null);
                }
                brh.a(bcn1);
                bcn1.close();
                bdm0 = bdm1;
                goto label_37;
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
            }
            catch(Throwable throwable1) {
                goto label_32;
            }
            bdm0 = bdm1;
            try {
                throw new bcf(a.a((bsf0.c == 35 ? "YUV" : "JPEG"), "Can\'t convert ", " to bitmap"), unsupportedOperationException0);
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
                goto label_34;
            }
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_34;
        }
    label_32:
        throwable2 = throwable1;
        bdm0 = bdm1;
    label_34:
        if(bdm0 != null) {
            bdm0.i();
        }
        throw throwable2;
    label_37:
        if(bdm0 != null) {
            bdm0.i();
        }
    }
}

