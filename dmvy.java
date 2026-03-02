final class dmvy implements ibtx {
    final ibvd a;

    public dmvy(ibvd ibvd0) {
        this.a = ibvd0;
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
        fuaz fuaz0 = new fuaz(new fryh(0x7F080B42), new frxq(fpu.a(((goz)object1)).q), null, null, 28);  // drawable:quantum_gm_ic_delete_vd_theme_24
        fuar.f(null, new fuat(new fryr(0x7F151E09), null, fuaz0, null, 0x2EF25, null, new dmvx(this.a), null, null, false, false, true, fule.a, false, 10154), ((goz)object1), 0x40, 1);  // string:pay_fops_delete_account "Remove account"
        return ibom.a;
    }
}

