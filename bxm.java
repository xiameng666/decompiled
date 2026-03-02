import java.util.Arrays;

public final class bxm {
    public float[] a;
    public int b;

    public bxm() {
        this(16);
    }

    public bxm(int v) {
        this.a = v == 0 ? bxo.a : new float[v];
    }

    public final float a(int v) {
        if(v < 0 || v >= this.b) {
            cad.c("Index must be between 0 and size");
        }
        return this.a[v];
    }

    public final float b() {
        if(this.b == 0) {
            cad.d("FloatList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(float f) {
        int v = this.b + 1;
        float[] arr_f = this.a;
        if(arr_f.length < v) {
            float[] arr_f1 = Arrays.copyOf(arr_f, Math.max(v, arr_f.length * 3 / 2));
            ibuq.e(arr_f1, "copyOf(...)");
            this.a = arr_f1;
        }
        int v1 = this.b;
        this.a[v1] = f;
        this.b = v1 + 1;
    }

    public static String d(bxm bxm0, CharSequence charSequence0, CharSequence charSequence1, int v) {
        String s = 1 == (v & 1) ? ", " : null;
        ibuq.f(s, "separator");
        if((v & 2) != 0) {
            charSequence0 = "";
        }
        ibuq.f(charSequence0, "prefix");
        if((v & 4) != 0) {
            charSequence1 = "";
        }
        ibuq.f(charSequence1, "postfix");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence0);
        float[] arr_f = bxm0.a;
        int v1 = bxm0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            float f = arr_f[v2];
            if(v2 != 0) {
                stringBuilder0.append(s);
            }
            if(v2 == -1) {
                stringBuilder0.append("...");
                break;
            }
            stringBuilder0.append(f);
        }
        stringBuilder0.append(charSequence1);
        return stringBuilder0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof bxm)) {
            int v = this.b;
            if(((bxm)object0).b == v) {
                float[] arr_f = this.a;
                float[] arr_f1 = ((bxm)object0).a;
                ibwm ibwm0 = ibwt.q(0, v);
                int v1 = ibwm0.a;
                int v2 = ibwm0.b;
                if(v1 <= v2) {
                    while(arr_f[v1] == arr_f1[v1]) {
                        if(v1 == v2) {
                            return true;
                        }
                        ++v1;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        float[] arr_f = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += Float.floatToIntBits(arr_f[v1]) * 0x1F;
        }
        return v2;
    }

    @Override
    public final String toString() {
        return bxm.d(this, "[", "]", 25);
    }
}

