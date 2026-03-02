import java.util.Arrays;

public final class chw {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final float h;
    public final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private float n;
    private final float[] o;
    private final float p;
    private final float q;
    private final float r;

    public chw(int v, float f, float f1, float f2, float f3, float f4, float f5) {
        int v1;
        this.a = f;
        this.b = f1;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        float f6 = f5 - f3;
        boolean z = false;
        switch(v) {
            case 1: {
                v1 = 1;
                break;
            }
            case 4: {
                if(f6 <= 0.0f) {
                    v1 = 0;
                }
                else {
                    v1 = 1;
                    break;
                }
                break;
            }
            case 5: {
                v1 = (f6 < 0.0f) ? 1 : 0;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        float f7 = f4 - f2;
        float f8 = 1 == v1 ? -1.0f : 1.0f;
        this.r = f8;
        float f9 = 1.0f / (f1 - f);
        this.p = f9;
        float[] arr_f = new float[101];
        this.o = arr_f;
        if(v != 3 && Math.abs(f7) >= 0.001f && Math.abs(f6) >= 0.001f) {
            this.e = f7 * f8;
            this.f = f6 * -f8;
            this.h = v1 == 0 ? f2 : f4;
            this.i = v1 == 0 ? f5 : f3;
            float f10 = f3 - f5;
            float[] arr_f1 = chy.a;
            float f11 = f10;
            int v2 = 1;
            float f12 = 0.0f;
            for(float f13 = 0.0f; true; f13 = f15) {
                double f14 = (double)(((float)Math.toRadians(((double)v2) * 90.0 / 90.0)));
                float f15 = ((float)Math.sin(f14)) * (f4 - f2);
                float f16 = ((float)Math.cos(f14)) * f10;
                f12 += (float)Math.hypot(f15 - f13, f16 - f11);
                arr_f1[v2] = f12;
                if(v2 == 90) {
                    break;
                }
                ++v2;
                f11 = f16;
                arr_f = arr_f;
            }
            this.n = f12;
            for(int v3 = 1; true; ++v3) {
                arr_f1[v3] /= f12;
                if(v3 == 90) {
                    break;
                }
            }
            for(int v4 = 0; v4 < 101; ++v4) {
                int v5 = Arrays.binarySearch(arr_f1, 0, 91, ((float)v4) / 100.0f);
                if(v5 >= 0) {
                    arr_f[v4] = ((float)v5) / 90.0f;
                }
                else if(v5 == -1) {
                    arr_f[v4] = 0.0f;
                }
                else {
                    float f17 = arr_f1[-v5 - 2];
                    arr_f[v4] = (((float)(-v5 - 2)) + (((float)v4) / 100.0f - f17) / (arr_f1[-v5 - 1] - f17)) / 90.0f;
                }
            }
            this.q = this.n * this.p;
        }
        else {
            float f18 = (float)Math.hypot(f6, f7);
            this.n = f18;
            this.q = f18 * f9;
            this.h = f7 * f9;
            this.i = f6 * f9;
            this.e = NaNf;
            this.f = NaNf;
            z = true;
        }
        this.g = z;
    }

    public final float a() {
        float f = this.e * this.d;
        return f * this.r * (this.q / ((float)Math.hypot(f, -this.f * this.c)));
    }

    public final float b() {
        float f = -this.f * this.c;
        return f * this.r * (this.q / ((float)Math.hypot(this.e * this.d, f)));
    }

    public final float c(float f) {
        return this.j + (f - this.a) * this.p * (this.l - this.j);
    }

    public final float d(float f) {
        return this.k + (f - this.a) * this.p * (this.m - this.k);
    }

    public final void e(float f) {
        float f1 = (this.r == -1.0f ? this.b - f : f - this.a) * this.p;
        float f2 = 0.0f;
        if(f1 > 0.0f && f1 < 1.0f) {
            float f3 = this.o[((int)(f1 * 100.0f))];
            f2 = f3 + (f1 * 100.0f - ((float)(((int)(f1 * 100.0f))))) * (this.o[((int)(f1 * 100.0f)) + 1] - f3);
        }
        this.c = (float)Math.sin(f2 * 1.570796f);
        this.d = (float)Math.cos(f2 * 1.570796f);
    }
}

