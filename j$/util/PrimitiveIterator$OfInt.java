public interface OfInt extends PrimitiveIterator {
    @Override
    void forEachRemaining(Consumer arg1);

    void forEachRemaining(IntConsumer arg1);

    Integer next();

    int nextInt();
}

