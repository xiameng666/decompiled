import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

final class bgg implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        bnr bnr0;
        bcn bcn0 = ((bgr)object0).b;
        if(brh.b(bcn0.a())) {
            try {
                ByteBuffer byteBuffer0 = bcn0.g()[0].c();
                byteBuffer0.rewind();
                byte[] arr_b = new byte[byteBuffer0.capacity()];
                byteBuffer0.get(arr_b);
                bnr0 = bnr.c(new ByteArrayInputStream(arr_b));
                bcn0.g()[0].c().rewind();
            }
            catch(IOException iOException0) {
                throw new bcf("Failed to extract EXIF data.", iOException0);
            }
        }
        else {
            bnr0 = null;
        }
        bgt bgt0 = ((bgr)object0).a;
        if(bra.a() && brh.b(bcn0.a())) {
            kay.j(bnr0, "JPEG image must have exif.");
            Size size0 = new Size(bcn0.c(), bcn0.b());
            int v = bnr0.b();
            int v1 = bgt0.e - v;
            Size size1 = bok.n(bok.b(v1)) ? new Size(size0.getHeight(), size0.getWidth()) : size0;
            Matrix matrix0 = bok.d(new RectF(0.0f, 0.0f, ((float)size0.getWidth()), ((float)size0.getHeight())), new RectF(0.0f, 0.0f, ((float)size1.getWidth()), ((float)size1.getHeight())), v1);
            RectF rectF0 = new RectF(bgt0.d);
            matrix0.mapRect(rectF0);
            rectF0.sort();
            Rect rect0 = new Rect();
            rectF0.round(rect0);
            int v2 = bnr0.b();
            Matrix matrix1 = new Matrix(bgt0.g);
            matrix1.postConcat(matrix0);
            return bsf.b(bcn0, bnr0, size1, rect0, v2, matrix1, bgg.b(bcn0));
        }
        bhv bhv0 = bgg.b(bcn0);
        return bsf.a(bcn0, bnr0, bgt0.d, bgt0.e, bgt0.g, bhv0);
    }

    private static bhv b(bcn bcn0) {
        return (bcn0.e() instanceof bqd) ? ((bqd)bcn0.e()).a : new bhu();
    }
}

