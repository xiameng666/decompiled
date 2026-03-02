public final class dmat implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return (((dxev)object0).b & 2) == 0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

