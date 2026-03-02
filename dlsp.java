final class dlsp implements ibtx {
    final dlte a;

    public dlsp(dlte dlte0) {
        this.a = dlte0;
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
        hfc hfc0 = dla.j(hfc.e, 0.0f, 16.0f, 0.0f, 0.0f, 13);
        String s = this.a.getResources().getString(0x7F152044, new Object[]{"https://payments.google.com/payments/apis-secure/u/0/get_legal_document?ldo=0&ldt=buyertos&ldr=br", "https://payments.google.com/payments/apis-secure/u/0/get_legal_document?ldo=0&ldt=privacynotice&ldl=pt-BR"});  // string:pay_pix_education_bank_regulations "The <a href=%1$s>Google Payments Terms 
                                                                                                                                                                                                                                                                                                 // of Service</a> applies to your use of the service and the <a href=%2$s>Google Payments 
                                                                                                                                                                                                                                                                                                 // Privacy Notice</a> describes how your data is handled."
        ibuq.e(s, "getString(...)");
        ftwq.a(hfc0, new ftwn(new fryt(ftrm.f(s, true)), ftwo.b), ((goz)object1), 70, 0);
        return ibom.a;
    }
}

