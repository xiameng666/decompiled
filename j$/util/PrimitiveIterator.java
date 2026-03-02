package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface PrimitiveIterator extends Iterator {
    public interface OfInt extends PrimitiveIterator {
        @Override
        void forEachRemaining(Consumer arg1);

        void forEachRemaining(IntConsumer arg1);

        Integer next();

        int nextInt();
    }

    public interface OfLong extends PrimitiveIterator {
        @Override
        void forEachRemaining(Consumer arg1);

        void forEachRemaining(LongConsumer arg1);

        Long next();

        long nextLong();
    }

    void forEachRemaining(Object arg1);
}

