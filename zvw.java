final class zvw implements ibtx {
    final znr a;

    public zvw(znr znr0) {
        this.a = znr0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(jkv.a(((dih)object0).d(), isn.a(0x7F0701A0, ((goz)object1))) >= 0) {  // dimen:as_expressive_card_max_width
            ((goz)object1).M(0xBC6DBA00);
            djr.e(dla.i(hfc.e, 24.0f, 0.0f, 2), dho.g(8.0f), null, null, 0, 0, gzf.e(0xF8F50B5C, new zvt(this.a), ((goz)object1)), ((goz)object1), 0x180036, 60);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0xBC714E51);
        hey hey0 = hfc.e;
        dld dld0 = dla.g(24.0f, 0.0f, 2);
        dhg dhg0 = dho.g(8.0f);
        ((goz)object1).M(5004770);
        znr znr0 = this.a;
        boolean z = ((goz)object1).Z(znr0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new zvs(znr0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        dnh.b(hey0, null, dld0, dhg0, null, null, false, null, ((ibts)object3), ((goz)object1), 0x6186, 490);
        ((goz)object1).A();
        return ibom.a;
    }
}

