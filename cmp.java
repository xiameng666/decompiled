public final class cmp implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        chq chq0 = (chq)object0;
        return new jlf(((long)Math.round(chq0.b)) & 0xFFFFFFFFL | ((long)Math.round(chq0.a)) << 0x20);
    }
}

