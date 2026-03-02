public interface OfLong extends PrimitiveIterator {
    @Override
    void forEachRemaining(Consumer arg1);

    void forEachRemaining(LongConsumer arg1);

    Long next();

    long nextLong();
}

