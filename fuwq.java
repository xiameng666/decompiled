import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fuwq implements fuwa {
    private final float[] b;
    private final int c;
    private final fuwp d;
    private final fuwp e;
    private final boolean f;

    public fuwq(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, int v, boolean z) {
        byteBuffer0.rewind();
        fuwp fuwp1;
        fuwp fuwp0 = new fuwp(byteBuffer0, hupk.e());
        this.d = fuwp0;
        int v1 = fuwp0.a - 1;
        this.b = new float[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            this.b[v2] = byteBuffer0.getFloat();
        }
        if(z && byteBuffer1 != null) {
            byteBuffer1.rewind();
            fuwp1 = new fuwp(byteBuffer1, hupk.e());
        }
        else {
            fuwp1 = null;
        }
        this.e = fuwp1;
        this.c = v;
        this.f = z;
    }

    @Override  // fuwa
    public final List a(fuwf fuwf0) {
        if(fuwf0.c >= 0.0004f && fuwf0.s >= 0.0004f) {
            float[] arr_f = fuwf0.a();
            for(int v = 0; v < 43; ++v) {
                arr_f[v] = (arr_f[v] - fuwb.b[v]) / fuwb.c[v];
            }
            float[] arr_f1 = this.d.a(arr_f);
            fuwb.l(this.c, arr_f1, this.b);
            List list0 = fuwb.e(arr_f1);
            if(this.f) {
                fuwp fuwp0 = this.e;
                if(fuwp0 != null) {
                    float f = arr_f1[3];
                    float[] arr_f2 = new float[2];
                    if(Double.compare(f, hupk.a.d().a()) > 0) {
                        float f1 = fuwp0.a(arr_f)[0] * f;
                        arr_f2[0] = f1;
                        arr_f2[1] = f - f1;
                    }
                    else {
                        arr_f2[1] = f / 2.0f;
                        arr_f2[0] = f / 2.0f;
                    }
                    fuwb.g(list0, arr_f2);
                }
            }
            return list0;
        }
        return Collections.singletonList(new fuwi(fuwh.f, 100));
    }

    @Override  // fuwa
    public final List b(float[] arr_f) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            arrayList0.add(Float.valueOf(arr_f[v]));
        }
        return this.a(fuwg.b(arrayList0));
    }
}

