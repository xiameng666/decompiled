import java.util.Arrays;
import java.util.Map;

public final class futx {
    public static long[] a(long[] arr_v, long[] arr_v1) {
        boolean z = false;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(v < arr_v.length && v1 < arr_v1.length) {
            int v3 = Long.compare(arr_v[v], arr_v1[v1]);
            if(v3 >= 0) {
                ++v1;
                if(v3 > 0) {
                    continue;
                }
                ++v2;
            }
            ++v;
        }
        long[] arr_v2 = new long[v2];
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(v4 < arr_v.length && v5 < arr_v1.length) {
            long v7 = arr_v[v4];
            int v8 = Long.compare(v7, arr_v1[v5]);
            if(v8 < 0) {
                ++v4;
            }
            else {
                ++v5;
                if(v8 > 0) {
                    continue;
                }
                arr_v2[v6] = v7;
                ++v4;
                ++v6;
            }
        }
        if(v6 == v2) {
            z = true;
        }
        gftb.q(z);
        return arr_v2;
    }

    public static long[] b(hecq hecq0) {
        int v = hecq0.d();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = hecq0.l(v1);
        }
        Arrays.sort(arr_v);
        return arr_v;
    }

    public static final Double c(fuvi fuvi0, fuvi fuvi1, boolean z) {
        fvui fvui0 = futx.f(fuvi0, z);
        fvui fvui1 = futx.f(fuvi1, z);
        if(fvui0 != null && fvui1 != null) {
            return z ? ((double)Math.min(fvtx.a(fvui0, fvui1), 5000)) : ((double)Math.min(fvtx.a(fvui0, fvui1), 1000));
        }
        return null;
    }

    public static final Double d(long[] arr_v, long[] arr_v1, long[] arr_v2) {
        int v = arr_v.length + arr_v1.length - arr_v2.length;
        return v == 0 ? null : ((double)(((double)arr_v2.length) / ((double)v)));
    }

    public static final void e(Map map0, fuvg fuvg0, Double double0) {
        if(double0 != null) {
            map0.put(fuvg0, double0);
        }
    }

    private static fvui f(fuvi fuvi0, boolean z) {
        fvuc fvuc0 = fuvi0.b;
        if(fvuc0 != null) {
            if(z) {
                return fvuc0.c == null ? null : fvuc0.c.c;
            }
            return fvuc0.b == null ? null : fvuc0.b.c;
        }
        return null;
    }
}

