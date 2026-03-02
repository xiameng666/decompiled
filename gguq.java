import java.util.Set;

final class gguq extends ggus {
    public final int[] a;
    public final int b;
    private final ggub c;
    private final ggub d;

    public gguq(ggub ggub0, ggub ggub1) {
        this.c = ggub0;
        this.d = ggub1;
        int v = ggub1.b();
        int v1 = 0;
        ggwv.a(v <= 28, "metadata size too large");
        int[] arr_v = new int[v];
        this.a = arr_v;
        long v2 = 0L;
        int v3 = 0;
        while(v1 < arr_v.length) {
            ggsx ggsx0 = this.e(v1);
            long v4 = ggsx0.d | v2;
            if(v4 == v2) {
                int v5 = this.h(ggsx0, arr_v, v3);
                if(v5 != -1) {
                    arr_v[v5] = ggsx0.b ? arr_v[v5] | 1 << v1 + 4 : v1;
                    goto label_20;
                }
            }
            arr_v[v3] = v1;
            ++v3;
        label_20:
            ++v1;
            v2 = v4;
        }
        this.b = v3;
    }

    @Override  // ggus
    public final int a() {
        return this.b;
    }

    @Override  // ggus
    public final Object b(ggsx ggsx0) {
        ggwv.a(((boolean)(ggsx0.b ^ 1)), "key must be single valued");
        int v = this.h(ggsx0, this.a, this.b);
        return v < 0 ? null : ggsx0.c(this.f(this.a[v]));
    }

    @Override  // ggus
    public final Set c() {
        return new gguo(this);
    }

    @Override  // ggus
    public final void d(ggui ggui0, Object object0) {
        for(int v = 0; v < this.b; ++v) {
            int v1 = this.a[v];
            ggsx ggsx0 = this.e(v1 & 0x1F);
            if(ggsx0.b) {
                ggui0.b(ggsx0, new ggup(this, ggsx0, v1), object0);
            }
            else {
                ggui0.a(ggsx0, ggsx0.c(this.f(v1)), object0);
            }
        }
    }

    public final ggsx e(int v) {
        return v < 0 ? this.c.c(v) : this.d.c(v);
    }

    public final Object f(int v) {
        return v < 0 ? this.c.e(v) : this.d.e(v);
    }

    private final int h(ggsx ggsx0, int[] arr_v, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(ggsx0.equals(this.e(arr_v[v1] & 0x1F))) {
                return v1;
            }
        }
        return -1;
    }
}

