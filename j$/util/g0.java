package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public interface g0 extends PrimitiveIterator {
    @Override
    void forEachRemaining(Consumer arg1);

    void forEachRemaining(DoubleConsumer arg1);

    Double next();

    double nextDouble();
}

