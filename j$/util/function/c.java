package j$.util.function;

import j..desugar.sun.nio.fs.g;
import java.util.function.DoubleConsumer;

public final class c implements DoubleConsumer {
    public final DoubleConsumer a;
    public final DoubleConsumer b;

    public c(DoubleConsumer doubleConsumer0, DoubleConsumer doubleConsumer1) {
        this.a = doubleConsumer0;
        this.b = doubleConsumer1;
    }

    @Override
    public final void accept(double f) {
        this.a.accept(f);
        this.b.accept(f);
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return g.a(this, doubleConsumer0);
    }
}

