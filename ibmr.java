import j..util.PrimitiveIterator.OfLong;

public interface ibmr extends OfLong {
    @Override  // j$.util.PrimitiveIterator$OfLong
    @Deprecated
    Long next();

    @Override  // j$.util.PrimitiveIterator$OfLong
    long nextLong();
}

