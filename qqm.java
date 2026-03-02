import java.util.Arrays;

public final class qqm {
    public final float[] a;
    public final int[] b;

    public qqm(float[] arr_f, int[] arr_v) {
        this.a = arr_f;
        this.b = arr_v;
    }

    public final qqm a(float[] arr_f) {
        int v2;
        int[] arr_v = new int[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            float[] arr_f1 = this.a;
            int v1 = Arrays.binarySearch(arr_f1, f);
            if(v1 >= 0) {
                v2 = this.b[v1];
            }
            else if(-(v1 + 1) == 0) {
                v2 = this.b[0];
            }
            else {
                int[] arr_v1 = this.b;
                int v3 = arr_v1.length - 1;
                if(-(v1 + 1) == v3) {
                    v2 = arr_v1[v3];
                }
                else {
                    int v4 = -(v1 + 1) - 1;
                    float f1 = arr_f1[v4];
                    v2 = qto.a((f - f1) / (arr_f1[-(v1 + 1)] - f1), arr_v1[v4], arr_v1[-(v1 + 1)]);
                }
            }
            arr_v[v] = v2;
        }
        return new qqm(arr_f, arr_v);
    }

    public final void b(qqm qqm0) {
        for(int v = 0; true; ++v) {
            int[] arr_v = qqm0.b;
            if(v >= arr_v.length) {
                break;
            }
            this.a[v] = qqm0.a[v];
            this.b[v] = arr_v[v];
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Arrays.equals(this.a, ((qqm)object0).a) && Arrays.equals(this.b, ((qqm)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) * 0x1F + Arrays.hashCode(this.b);
    }
}

