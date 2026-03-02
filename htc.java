public final class htc extends ibur implements ibtw {
    final ibty a;
    final long b;

    public htc(ibty ibty0, long v) {
        this.a = ibty0;
        this.b = v;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            this.a.a(Float.valueOf(Float.intBitsToFloat(((int)(this.b >> 0x20)))), Float.valueOf(Float.intBitsToFloat(((int)(this.b & 0xFFFFFFFFL)))), ((goz)object0), Integer.valueOf(0));
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

