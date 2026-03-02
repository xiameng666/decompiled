final class dejv implements ibtw {
    final cfz a;
    final dim b;
    final cax c;

    public dejv(cfz cfz0, dim dim0, cax cax0) {
        this.a = cfz0;
        this.b = dim0;
        this.c = cax0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hpw hpw0 = ism.a(0x7F08100C, ((goz)object0), 0);  // drawable:w_quickshare_tipsbottomsheet_temporarilyvisibletoeveryone_da_dynamic
        String s = isq.c(0x7F152C3D, ((goz)object0));  // string:sharing_main_help_dialog_visibilty_content_description "Four graphic icons 
                                                       // of sharing with everyone nearby, including temporarily, sharing with your contacts, 
                                                       // and sharing with your devices"
        hfc hfc0 = this.b.a(hfc.e, hei.n);
        cft cft0 = cfq.a("illustration", ((goz)object0));
        cth.a(hpw0, s, cfp.a(this.a, hfc0, cft0, this.c), null, null, 0.0f, null, ((goz)object0), 8, 120);
        return ibom.a;
    }
}

