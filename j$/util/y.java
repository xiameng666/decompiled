package j$.util;

import j..desugar.sun.nio.fs.g;
import java.util.function.DoubleConsumer;

public final class y implements DoubleConsumer {
    public double a;
    public double b;
    private long count;
    private double max;
    private double min;
    private double sum;

    public y() {
        this.min = Infinity;
        this.max = -Infinity;
    }

    public final void a(y y0) {
        this.count += y0.count;
        this.b += y0.b;
        this.b(y0.sum);
        this.b(y0.a);
        this.min = Math.min(this.min, y0.min);
        this.max = Math.max(this.max, y0.max);
    }

    @Override
    public final void accept(double f) {
        ++this.count;
        this.b += f;
        this.b(f);
        this.min = Math.min(this.min, f);
        this.max = Math.max(this.max, f);
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return g.a(this, doubleConsumer0);
    }

    public final void b(double f) {
        double f1 = f - this.a;
        double f2 = this.sum + f1;
        this.a = f2 - this.sum - f1;
        this.sum = f2;
    }

    @Override
    public final String toString() {
        String s = y.class.getSimpleName();
        Long long0 = (long)this.count;
        Double double0 = (double)(!Double.isNaN(this.sum + this.a) || !Double.isInfinite(this.b) ? this.sum + this.a : this.b);
        Double double1 = (double)this.min;
        return this.count <= 0L ? String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", s, long0, double0, double1, ((double)0.0), ((double)this.max)) : String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", s, long0, double0, double1, ((double)((!Double.isNaN(this.sum + this.a) || !Double.isInfinite(this.b) ? this.sum + this.a : this.b) / ((double)this.count))), ((double)this.max));
    }
}

