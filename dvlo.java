import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

public final class dvlo implements ibtx {
    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        Bitmap bitmap0 = (Bitmap)object0;
        Bitmap.CompressFormat bitmap$CompressFormat0 = (Bitmap.CompressFormat)object1;
        ibuq.f(bitmap0, "bitmap");
        ibuq.f(bitmap$CompressFormat0, "compressFormat");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bitmap0.compress(bitmap$CompressFormat0, ((Integer)object2).intValue(), byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

