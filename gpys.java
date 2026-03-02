public final class gpys {
    public gpvr a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final double h;
    public final double i;
    public final double[] j;

    public gpys(flp18Flags_phenotype huqw0) {
        this.a = null;
        this.b = new byte[0];
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = Math.max(0, ((int)huqw0.ax()));
        this.h = Math.max(0.0, Math.min(1.0, huqw0.j()));
        this.i = Math.max(1.000000E-08, huqw0.m());
        this.j = new double[91];
        for(int v = 0; v < 91; ++v) {
            this.j[v] = AngleUtils.a(Math.min(huqw0.l() * huqw0.k(), v), huqw0.k());
        }
    }

    static double a(double f) {
        double f1 = (f % 180.0 + 180.0) % 180.0;
        return f1 > 90.0 ? f1 - 180.0 : f1;
    }

    public final int b(int v, int v1) {
        int v2 = this.c;
        if(v >= v2) {
            int v3 = this.e;
            if(v < v2 + v3) {
                return v1 < this.d || v1 >= this.f + this.d ? -1 : v - v2 + (v1 - this.d) * v3;
            }
        }
        return -1;
    }
}

