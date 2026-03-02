public final class blmc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return ((byte[])object0) == null ? new bluw(0, null, 0) : new bluw(0, ByteString.copyFrom(((byte[])object0)), 0);
    }
}

