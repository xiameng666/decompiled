import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import j..util.Objects;
import java.io.IOException;

final class bfy implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        BitmapRegionDecoder bitmapRegionDecoder0;
        byte[] arr_b = (byte[])((bsf)object0).a;
        try {
            bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(arr_b, 0, arr_b.length, false);
        }
        catch(IOException iOException0) {
            throw new bcf("Failed to decode JPEG.", iOException0);
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        Bitmap bitmap0 = bitmapRegionDecoder0.decodeRegion(((bsf)object0).e, bitmapFactory$Options0);
        bnr bnr0 = (bnr)Objects.requireNonNull(((bsf)object0).b);
        Rect rect0 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        Matrix matrix0 = bok.f(((bsf)object0).g, ((bsf)object0).e);
        return new bsf(bitmap0, bnr0, 42, new Size(bitmap0.getWidth(), bitmap0.getHeight()), rect0, ((bsf)object0).f, matrix0, ((bsf)object0).h);
    }
}

