final class dlrb implements ibtw {
    final gep a;
    final dlrl b;

    public dlrb(gep gep0, dlrl dlrl0) {
        this.a = gep0;
        this.b = dlrl0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gej gej0 = fiuq.d(0L, ((goz)object0), 0x3F);
        gze gze0 = gzf.e(0xD61EC60B, new dlra(this.b), ((goz)object0));
        fiqk.a(dlqk.a, null, gze0, null, 0.0f, null, gej0, this.a, ((goz)object0), 390, 58);
        return ibom.a;
    }
}

