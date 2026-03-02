public final class btgw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(((boolean)(((Boolean)object0).booleanValue() ^ 1)));
    }
}

