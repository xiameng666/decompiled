import java.util.BitSet;

public final class fvcl {
    public final float a;
    public final double b;
    public final double c;
    public final int d;
    public final int e;
    public final double f;
    public final fvcm g;
    private final BitSet h;
    private final BitSet i;
    private final short[] j;
    private final fvce k;
    private final fvcp l;
    private final fvcp m;

    public fvcl(fvck fvck0) {
        this.b = fvck0.c;
        this.c = fvck0.d;
        this.d = fvck0.e;
        this.e = fvck0.f;
        this.f = fvck0.g;
        this.g = fvck0.a;
        this.h = fvck0.h;
        this.i = fvck0.i;
        short[] arr_v = fvck0.j;
        this.j = arr_v;
        this.m = fvck0.l.a() == 0 ? null : fvck0.l;
        fvcc fvcc0 = fvck0.m;
        this.k = fvcc0 == null ? new fvcc(0).a() : fvcc0.a();
        this.l = fvck0.k;
        if(fvck0.k != null) {
            float f = fvcl.p(arr_v[0]);
            for(int v = 0; true; ++v) {
                short[] arr_v1 = this.j;
                if(v >= arr_v1.length) {
                    break;
                }
                f = Math.max(f, fvcl.p(arr_v1[v]) + this.d(v));
            }
            this.a = f;
            return;
        }
        gftb.checkTrue(arr_v.length > 0);
        int v2 = arr_v[0];
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            if(v3 > v2) {
                v2 = v3;
            }
        }
        this.a = fvcl.p(((short)v2));
    }

    public final double a(ggzv ggzv0) {
        return (this.g.a(ggzv0).a - this.b) / this.f;
    }

    public final double b(ggzv ggzv0) {
        return (this.g.a(ggzv0).b - this.c) / this.f;
    }

    public final float c(int v) {
        return fvcl.p(this.j[v]);
    }

    public final float d(int v) {
        fvcp fvcp0 = this.l;
        if(fvcp0 != null) {
            Byte byte0 = (Byte)fvcp0.c(v);
            return byte0 == null ? 0.0f : ((float)(((byte)byte0)));
        }
        return 0.0f;
    }

    public final int e(int v, int v1) {
        gftb.x(v, this.d);
        gftb.x(v1, this.e);
        return v1 * this.d + v;
    }

    public final int f(int v) {
        return v % this.d;
    }

    public final int g(int v) {
        return v / this.d;
    }

    public final ggzv h(double f, double f1) {
        ggxn ggxn0 = new ggxn(this.f * f + this.b, f1 * this.f + this.c);
        double f2 = ggxn0.a - 500000.0;
        double f3 = ggxn0.b;
        fvcu fvcu0 = (fvcu)this.g;
        double f4 = (f3 - fvcu0.g.d) / 0.9996 / 6367449.145945;
        double f5 = f4 + fvcu.b * Math.sin(f4 + f4) + fvcu.c * Math.sin(f4 * 4.0) + fvcu.d * Math.sin(f4 * 6.0) + fvcu.e * Math.sin(8.0 * f4);
        double f6 = Math.sin(f5);
        double f7 = Math.cos(f5);
        double f8 = f6 / f7;
        double f9 = 1.0 - f6 * f6 * 0.006694;
        double f10 = fvcu.a * f7 * f7;
        double f11 = f8 * f8;
        double f12 = f2 / (6378137.0 / Math.sqrt(f9) * 0.9996);
        double f13 = f10 * f10;
        double f14 = f12 * f12;
        double f15 = f14 * f12;
        double f16 = f15 * f12;
        double f17 = f11 * f11;
        double f18 = f13 * 3.0;
        double f19 = f16 * f12;
        return ggzv.i(Math.toDegrees(f5 - f8 / (0.993306 / f9) * (f14 / 2.0 - f16 / 24.0 * (f11 * 3.0 + 5.0 + 10.0 * f10 - 4.0 * f13 - 0.060655)) + f19 * f12 / 720.0 * (90.0 * f11 + 61.0 + 298.0 * f10 + f17 * 45.0 - 1.698353 - f18)), Math.toDegrees((f12 - f15 / 6.0 * (f11 + f11 + 1.0 + f10) + f19 / 120.0 * (5.0 - (f10 + f10) + f11 * 28.0 - f18 + 0.053916 + 24.0 * f17)) / f7) + ((double)((fvcu0.f - 1) * 6)) - 180.0 + 3.0);
    }

    public final ggzv i(int v) {
        return this.h(((double)this.f(v)), ((double)this.g(v)));
    }

    public final hirl j(int v) {
        if(!this.n(v)) {
            return hirl.a;
        }
        if(this.h.get(v)) {
            return this.m == null || this.m.c(v) == null ? hirl.c : hirl.e;
        }
        return this.d(v) > 0.0f ? hirl.d : hirl.b;
    }

    public final boolean k(int v, int v1) {
        return v >= 0 && v < this.d && v1 >= 0 && v1 < this.e;
    }

    public static boolean l(hirl hirl0) {
        return hirl0 == hirl.c || hirl0 == hirl.e || hirl0 == hirl.f;
    }

    public final boolean m(ggzv ggzv0, int v) {
        ggxn ggxn0 = this.g.a(ggzv0);
        double f = ggxn0.a - this.b;
        double f1 = (ggxn0.b - this.c) / this.f;
        double f2 = f / this.f;
        return this.k(((int)f2), ((int)f1)) && Math.min(Math.min(((double)this.d) - f2, f2) * this.f, Math.min(((double)this.e) - f1, f1) * this.f) >= ((double)v);
    }

    public final boolean n(int v) {
        return this.i.get(v);
    }

    public final fvcb o(fvcj fvcj0) {
        return new fvcb(this.k, fvcj0);
    }

    private static float p(short v) {
        return ((float)v) / 5.0f + 4715.0f;
    }
}

