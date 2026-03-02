import java.util.HashMap;
import java.util.Map;

public final class fvkv {
    public final fvrw a;
    public final Map b;

    public fvkv(String s, int v, int v1) {
        this.a = new fvrw(v, v1, 300, 0);
        HashMap hashMap0 = new HashMap();
        this.b = hashMap0;
        hashMap0.put(s, Integer.valueOf(v1));
    }

    public final void a() {
        int v4;
        int v = -1;
        for(Object object0: this.b.values()) {
            v = Math.max(v, ((Integer)object0).intValue());
        }
        if(v > 0) {
            fvrw fvrw0 = this.a;
            if(fvrw0.d.length != v) {
                int v1 = fvrw0.a;
                long[] arr_v = new long[v];
                float[][] arr2_f = new float[v1][v];
                int v2 = Math.max(0, fvrw0.c - v);
                for(int v3 = 0; true; ++v3) {
                    v4 = fvrw0.c;
                    if(v2 >= v4) {
                        break;
                    }
                    arr_v[v3] = fvrw0.d(v2);
                    for(int v5 = 0; v5 < v1; ++v5) {
                        float[] arr_f = arr2_f[v5];
                        arr_f[v3] = fvrw0.a(v2, v5);
                    }
                    ++v2;
                }
                fvrw0.d = arr_v;
                fvrw0.e = arr2_f;
                fvrw0.b = 0;
                fvrw0.c = Math.min(v4, v);
            }
        }
    }
}

