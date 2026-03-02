final class dlsl implements ibtw {
    final gep a;
    final dlte b;

    public dlsl(gep gep0, dlte dlte0) {
        this.a = gep0;
        this.b = dlte0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gej gej0 = fiuq.d(0L, ((goz)object0), 0x3F);
        gze gze0 = gzf.e(0xC088EB02, new dlsk(this.b), ((goz)object0));
        fiqk.a(dlrx.a, null, gze0, null, 0.0f, null, gej0, this.a, ((goz)object0), 390, 58);
        return ibom.a;
    }
}

