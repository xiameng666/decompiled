public final class cmr implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        int v = Math.round(((chq)object0).a);
        int v1 = 0;
        if(v < 0) {
            v = 0;
        }
        int v2 = Math.round(((chq)object0).b);
        if(v2 >= 0) {
            v1 = v2;
        }
        return new jlk(((long)v) << 0x20 | ((long)v1));
    }
}

