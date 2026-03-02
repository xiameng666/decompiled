final class bgbo implements ibtw {
    final bgbv a;

    public bgbo(bgbv bgbv0) {
        this.a = bgbv0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gui gui0 = ltd.b(this.a.A().f, ((goz)object0));
        bgny.a(false, gzf.e(0xD703A8A4, new bgbn(this.a, gui0), ((goz)object0)), ((goz)object0), 0x30);
        return ibom.a;
    }
}

