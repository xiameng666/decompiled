import java.util.List;

public final class fuwg extends fuwf {
    public float A;
    public float B;
    public float w;
    public float x;
    public float y;
    public float z;

    @Override  // fuwf
    public final float[] a() {
        return new float[]{this.b, this.w, this.x, this.y, this.n[0], this.n[1], this.n[2], this.n[3], this.q[0], this.q[1], this.q[2], this.q[3], this.r, this.m[0], this.m[1], this.m[2], this.m[3], this.p[0], this.p[1], this.p[2], this.p[3], this.o[0], this.o[1], this.o[2], this.o[3], this.z, this.A, this.B, this.a, this.v, this.u, this.t, this.l, this.s, this.k, this.e, this.g, this.i, this.d, this.j, this.h, this.f, this.c};
    }

    public static fuwg b(List list0) {
        fuwg fuwg0 = new fuwg();
        fuwg0.b = (float)(((Float)list0.get(0)));
        fuwg0.w = (float)(((Float)list0.get(1)));
        fuwg0.x = (float)(((Float)list0.get(2)));
        fuwg0.y = (float)(((Float)list0.get(3)));
        float[] arr_f = fuwg0.n;
        arr_f[0] = (float)(((Float)list0.get(4)));
        arr_f[1] = (float)(((Float)list0.get(5)));
        arr_f[2] = (float)(((Float)list0.get(6)));
        arr_f[3] = (float)(((Float)list0.get(7)));
        float[] arr_f1 = fuwg0.q;
        arr_f1[0] = (float)(((Float)list0.get(8)));
        arr_f1[1] = (float)(((Float)list0.get(9)));
        arr_f1[2] = (float)(((Float)list0.get(10)));
        arr_f1[3] = (float)(((Float)list0.get(11)));
        fuwg0.r = (float)(((Float)list0.get(12)));
        float[] arr_f2 = fuwg0.m;
        arr_f2[0] = (float)(((Float)list0.get(13)));
        arr_f2[1] = (float)(((Float)list0.get(14)));
        arr_f2[2] = (float)(((Float)list0.get(15)));
        arr_f2[3] = (float)(((Float)list0.get(16)));
        float[] arr_f3 = fuwg0.p;
        arr_f3[0] = (float)(((Float)list0.get(17)));
        arr_f3[1] = (float)(((Float)list0.get(18)));
        arr_f3[2] = (float)(((Float)list0.get(19)));
        arr_f3[3] = (float)(((Float)list0.get(20)));
        float[] arr_f4 = fuwg0.o;
        arr_f4[0] = (float)(((Float)list0.get(21)));
        arr_f4[1] = (float)(((Float)list0.get(22)));
        arr_f4[2] = (float)(((Float)list0.get(23)));
        arr_f4[3] = (float)(((Float)list0.get(24)));
        fuwg0.z = (float)(((Float)list0.get(25)));
        fuwg0.A = (float)(((Float)list0.get(26)));
        fuwg0.B = (float)(((Float)list0.get(27)));
        fuwg0.a = (float)(((Float)list0.get(28)));
        fuwg0.v = (float)(((Float)list0.get(29)));
        fuwg0.u = (float)(((Float)list0.get(30)));
        fuwg0.t = (float)(((Float)list0.get(0x1F)));
        fuwg0.l = (float)(((Float)list0.get(0x20)));
        fuwg0.s = (float)(((Float)list0.get(33)));
        fuwg0.k = (float)(((Float)list0.get(34)));
        fuwg0.e = (float)(((Float)list0.get(35)));
        fuwg0.g = (float)(((Float)list0.get(36)));
        fuwg0.i = (float)(((Float)list0.get(37)));
        fuwg0.d = (float)(((Float)list0.get(38)));
        fuwg0.j = (float)(((Float)list0.get(39)));
        fuwg0.h = (float)(((Float)list0.get(40)));
        fuwg0.f = (float)(((Float)list0.get(41)));
        fuwg0.c = (float)(((Float)list0.get(42)));
        return fuwg0;
    }
}

