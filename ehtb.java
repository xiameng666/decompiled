import java.text.DecimalFormat;

public final class ehtb {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    public final float[] a() {
        return new float[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n};
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ehtb)) {
            return false;
        }
        float[] arr_f = this.a();
        float[] arr_f1 = ((ehtb)object0).a();
        for(int v = 0; v < 14; ++v) {
            if(arr_f[v] != arr_f1[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        float[] arr_f = this.a();
        int v = 0;
        for(int v1 = 0; v1 < 14; ++v1) {
            v += Float.valueOf(arr_f[v1]).hashCode();
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        float[] arr_f = this.a();
        for(int v = 0; v < 14; ++v) {
            float f = arr_f[v];
            stringBuilder0.append(new DecimalFormat("0.00").format(((double)f)));
            stringBuilder0.append(",");
        }
        return stringBuilder0.toString();
    }
}

