import java.util.List;

public final class hxp {
    public static final float a(float[] arr_f, float[] arr_f1) {
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v] * arr_f1[v];
        }
        return f;
    }

    public static final void b(hxo hxo0, hwe hwe0) {
        hxp.c(hxo0, hwe0, 0L);
    }

    public static final void c(hxo hxo0, hwe hwe0, long v) {
        hxl hxl0 = hxo0.a;
        if(hvu.d(hwe0)) {
            hxl0.b();
        }
        if(!hvu.f(hwe0)) {
            List list0 = hwe0.a();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                hvh hvh0 = (hvh)list0.get(v2);
                hxl0.a(hvh0.a, hjz.d(hvh0.c, v));
            }
            hxl0.a(hwe0.b, hjz.d(hwe0.k, v));
        }
        if(hvu.f(hwe0) && hwe0.b - hxl0.c > 40L) {
            hxl0.b();
        }
        hxl0.c = hwe0.b;
    }
}

