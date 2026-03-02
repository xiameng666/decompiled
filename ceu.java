public final class ceu {
    public final float a;
    public final float b;
    private final jks c;

    public ceu(float f, jks jks0) {
        this.a = f;
        this.c = jks0;
        this.b = jks0.dX() * 386.087799f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        return Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)(this.a * this.b)));
    }

    public final cet b(float f) {
        double f1 = this.a(f);
        double f2 = (double)cev.a;
        double f3 = -1.0 + f2;
        return new cet(f, ((float)(((double)(this.a * this.b)) * Math.exp(f2 / f3 * f1))), ((long)(Math.exp(f1 / f3) * 1000.0)));
    }
}

