final class bdgw implements ibtw {
    final bdho a;

    public bdgw(bdho bdho0) {
        this.a = bdho0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gui gui0 = gzx.a(this.a.y().c, Boolean.valueOf(true), ((goz)object0));
        gui gui1 = gzx.a(this.a.y().e, Boolean.valueOf(false), ((goz)object0));
        gui gui2 = gzx.a(this.a.y().d, null, ((goz)object0));
        bgny.a(false, gzf.e(0x47422E25, new bdgv(this.a, gui0, gui2, gui1), ((goz)object0)), ((goz)object0), 0x30);
        return ibom.a;
    }
}

