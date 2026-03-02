package j$.util.stream;

import j..util.OptionalDouble;
import j..util.OptionalInt;
import j..util.PrimitiveIterator.OfInt;
import j..util.z;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public interface IntStream extends BaseStream {
    IntStream a(q0 arg1);

    boolean allMatch(IntPredicate arg1);

    boolean anyMatch(IntPredicate arg1);

    DoubleStream asDoubleStream();

    LongStream asLongStream();

    OptionalDouble average();

    Stream boxed();

    Object collect(Supplier arg1, ObjIntConsumer arg2, BiConsumer arg3);

    long count();

    DoubleStream d();

    IntStream distinct();

    IntStream dropWhile(IntPredicate arg1);

    IntStream filter(IntPredicate arg1);

    OptionalInt findAny();

    OptionalInt findFirst();

    void forEach(IntConsumer arg1);

    void forEachOrdered(IntConsumer arg1);

    LongStream i();

    OfInt iterator();

    IntStream limit(long arg1);

    IntStream map(IntUnaryOperator arg1);

    Stream mapToObj(IntFunction arg1);

    OptionalInt max();

    OptionalInt min();

    boolean noneMatch(IntPredicate arg1);

    IntStream parallel();

    IntStream peek(IntConsumer arg1);

    int reduce(int arg1, IntBinaryOperator arg2);

    OptionalInt reduce(IntBinaryOperator arg1);

    IntStream sequential();

    IntStream skip(long arg1);

    IntStream sorted();

    j..util.Spliterator.OfInt spliterator();

    int sum();

    z summaryStatistics();

    IntStream takeWhile(IntPredicate arg1);

    int[] toArray();
}

