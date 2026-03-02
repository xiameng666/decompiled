import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class fuwv {
    public static final fuwh[] a;
    private final fuwo b;

    static {
        fuwv.a = new fuwh[]{fuwh.g, fuwh.j};
    }

    public fuwv(ByteBuffer byteBuffer0, long v) {
        this.b = new fuwo(fuwv.a, byteBuffer0, v);
    }

    public final List a(fuwy fuwy0) {
        fuwo fuwo0;
        fuwy fuwy1 = fuwy0;
        int v = 0;
        int v1 = 0;
        while(true) {
            fuwo0 = this.b;
            if(v >= fuwo0.a()) {
                break;
            }
            v1 += fuwo0.b(v, new float[]{fuwy1.a, fuwy1.b, fuwy1.c, fuwy1.d, fuwy1.e, fuwy1.f, fuwy1.g, fuwy1.h, fuwy1.i, fuwy1.j, fuwy1.k, fuwy1.l, fuwy1.m, fuwy1.n, fuwy1.o, fuwy1.p, fuwy1.q, fuwy1.r, fuwy1.s, fuwy1.t, fuwy1.u, fuwy1.v, fuwy1.w, fuwy1.x, fuwy1.y, fuwy1.z, fuwy1.A, fuwy1.B, fuwy1.C, fuwy1.D, fuwy1.E, fuwy1.F, fuwy1.G, fuwy1.H, fuwy1.I}).a();
            ++v;
            fuwy1 = fuwy0;
        }
        List list0 = new ArrayList();
        list0.add(new fuwi(fuwh.j, Math.round(((float)v1) / ((float)fuwo0.a()))));
        return list0;
    }
}

