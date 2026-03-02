public final class cgt implements cil {
    private final ceu a;

    public cgt(jks jks0) {
        this.a = new ceu(cgu.a, jks0);
    }

    @Override  // cil
    public final float a() {
        return 0.0f;
    }

    @Override  // cil
    public final float b(float f, float f1) {
        double f2 = this.a.a(f1);
        double f3 = (double)cev.a;
        return f + ((float)(((double)(this.a.a * this.a.b)) * Math.exp(f3 / (-1.0 + f3) * f2))) * Math.signum(f1);
    }

    @Override  // cil
    public final float c(long v, float f, float f1) {
        cet cet0 = this.a.b(f1);
        float f2 = cag.a((cet0.c <= 0L ? 1.0f : ((float)(v / 1000000L)) / ((float)cet0.c))).a;
        return f + cet0.b * Math.signum(cet0.a) * f2;
    }

    @Override  // cil
    public final long d(float f) {
        return ((long)(Math.exp(this.a.a(f) / (((double)cev.a) - 1.0)) * 1000.0)) * 1000000L;
    }

    @Override  // cil
    public final float e(long v, float f) {
        cet cet0 = this.a.b(f);
        float f1 = (float)cet0.c;
        return Long.compare(cet0.c, 0L) <= 0 ? cag.a(1.0f).b * Math.signum(cet0.a) * cet0.b / f1 * 1000.0f : cag.a(((float)(v / 1000000L)) / f1).b * Math.signum(cet0.a) * cet0.b / f1 * 1000.0f;
    }
}

