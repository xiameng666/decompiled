import java.util.Arrays;

public final class HeadingHistogram {
    public static final double a;
    public static final HeadingEstimate b;
    public static final double c;
    public final double[] d;
    public final double[] e;

    static {
        HeadingHistogram.a = Math.cos(Math.toRadians(170.0) / 2.0);
        HeadingHistogram.b = new HeadingEstimate(0.0, 3.141593);
        HeadingHistogram.c = Math.toRadians(360.0) / 60.0;
    }

    public HeadingHistogram() {
        this.d = new double[60];
        this.e = new double[60];
        this.e();
    }

    public final double a(int v) {
        double f = this.b(v);
        return f == 0.0 ? 0.0 : this.d[HeadingHistogram.d(v)] / f;
    }

    public final double b(int v) {
        return this.e[HeadingHistogram.d(v)];
    }

    public static int c(double f) {
        return (int)((((long)f) + 0x400921FB54442D18L) / HeadingHistogram.c);
    }

    public static int d(int v) {
        return v % 60 >= 0 ? v % 60 : v % 60 + 60;
    }

    public final void e() {
        Arrays.fill(this.e, 0.0);
        Arrays.fill(this.d, 0.0);
    }
}

