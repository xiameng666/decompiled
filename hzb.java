public final class hzb extends ica {
    public hzb() {
        super(null);
    }

    public hzb(ibtw ibtw0) {
        super(ibtw0);
    }

    @Override  // ica
    public final float a(float f, hzk hzk0, hzk hzk1) {
        return Float.intBitsToFloat(((int)(hzk1.h(hzk0, ((long)Float.floatToRawIntBits(((float)(((int)(hzk0.g() >> 0x20)))) / 2.0f)) << 0x20 | ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL) & 0xFFFFFFFFL)));
    }
}

