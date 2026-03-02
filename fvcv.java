import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.TensorImpl;

public final class fvcv {
    public final Map a;
    public final fvcz b;
    public final fvdq c;
    public final igru d;

    public fvcv(ByteBuffer byteBuffer0, boolean z, fvdq fvdq0) {
        int v1;
        float f1;
        float f;
        this.a = new HashMap();
        igru igru0 = new igru(byteBuffer0);
        this.d = igru0;
        this.c = fvdq0;
        int v = 0;
        TensorImpl tensorImpl0 = igru0.b(0);
        TensorImpl tensorImpl1 = igru0.b(1);
        if(z) {
            TensorImpl tensorImpl2 = igru0.b(2);
            TensorImpl tensorImpl3 = igru0.b(3);
            f = tensorImpl2.c.a;
            v = tensorImpl2.c.b;
            f1 = tensorImpl3.c.a;
            v1 = tensorImpl3.c.b;
        }
        else {
            f = 0.0f;
            v1 = 0;
            f1 = 0.0f;
        }
        fvcz fvcz0 = new fvcz(z);
        fvcz0.b = (float)tensorImpl0.c.a;
        fvcz0.c = (int)tensorImpl0.c.b;
        fvcz0.d = (float)tensorImpl1.c.a;
        fvcz0.e = (int)tensorImpl1.c.b;
        fvcz0.f = f;
        fvcz0.g = v;
        fvcz0.h = f1;
        fvcz0.i = v1;
        fvcz0.j = fvdq0;
        this.b = fvcz0;
    }
}

