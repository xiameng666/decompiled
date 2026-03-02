final class dmvn implements ibtw {
    final gep a;
    final dmwr b;

    public dmvn(gep gep0, dmwr dmwr0) {
        this.a = gep0;
        this.b = dmwr0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gej gej0 = fiuq.d(0L, ((goz)object0), 0x3F);
        gze gze0 = gzf.e(0x5C0218C3, new dmvk(this.b), ((goz)object0));
        gze gze1 = gzf.e(-1084005958, new dmvm(this.b), ((goz)object0));
        fiqk.a(dmzo.a, null, gze0, gze1, 0.0f, null, gej0, this.a, ((goz)object0), 0xD86, 50);
        return ibom.a;
    }
}

