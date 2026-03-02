import android.graphics.Bitmap;
import android.media.Image.Plane;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.nio.ByteBuffer;

public final class hbtu {
    public static final hbtu a;

    static {
        new bart("MLKitImageUtils", "");
        hbtu.a = new hbtu();
    }

    public final int a(hbtp hbtp0) {
        int v = hbtp0.g;
        if(v == -1) {
            Bitmap bitmap0 = hbtp0.a;
            batl.s(bitmap0);
            return bitmap0.getAllocationByteCount();
        }
        switch(v) {
            case 35: {
                Image.Plane[] arr_image$Plane = hbtp0.b();
                batl.s(arr_image$Plane);
                return arr_image$Plane[0].getBuffer().limit() * 3 / 2;
            }
            case 17: 
            case 842094169: {
                ByteBuffer byteBuffer0 = hbtp0.b;
                batl.s(byteBuffer0);
                return byteBuffer0.limit();
            }
            default: {
                return 0;
            }
        }
    }

    public final bjgw b(hbtp hbtp0) {
        int v = hbtp0.g;
        switch(v) {
            case -1: {
                Bitmap bitmap0 = hbtp0.a;
                batl.s(bitmap0);
                return new ObjectWrapper(bitmap0);
            }
            case 35: {
                return hbtp0.c == null ? new ObjectWrapper(null) : new ObjectWrapper(hbtp0.c.a);
            }
            case 17: 
            case 842094169: {
                ByteBuffer byteBuffer0 = hbtp0.b;
                batl.s(byteBuffer0);
                return new ObjectWrapper(byteBuffer0);
            }
            default: {
                throw new havd("Unsupported image format: " + v, 3);
            }
        }
    }
}

