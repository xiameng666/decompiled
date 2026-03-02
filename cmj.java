public final class cmj implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        chq chq0 = (chq)object0;
        return new jky(((long)Float.floatToRawIntBits(chq0.b)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(chq0.a)) << 0x20);
    }
}

