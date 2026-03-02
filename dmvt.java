final class dmvt implements ibtx {
    final hkhr a;

    public dmvt(hkhr hkhr0) {
        this.a = hkhr0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        String s = this.a.l;
        ibuq.e(s, "getLogoFifeUrl(...)");
        fuhl.a(null, new fuhm(new fugq(new fryj(s, null, null, null, 14)), new fryu(dnpy.a(this.a)), null, 4), ((goz)object1), 0x40, 1);
        return ibom.a;
    }
}

