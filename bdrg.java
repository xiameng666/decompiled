final class bdrg implements ibtx {
    final bdsf a;

    public bdrg(bdsf bdsf0) {
        this.a = bdsf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0xDB100111);
        if(this.a.i) {
            bdot.a(((goz)object1), 0);
            dlv.a(dls.o(hfc.e, 8.0f), ((goz)object1));
        }
        ((goz)object1).A();
        fiuk.b(isq.c(0x7F15268D, ((goz)object1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:pwm_credential_export_confirmation_button "Export"
        return ibom.a;
    }
}

