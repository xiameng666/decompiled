final class dnnn implements ibtx {
    final hfc a;

    public dnnn(hfc hfc0) {
        this.a = hfc0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$OutlinedButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0xF55F1947);
        long v1 = fpu.a(((goz)object1)).a;
        ((goz)object1).A();
        hpw hpw0 = ism.a(0x7F08060D, ((goz)object1), 0);  // drawable:gs_qr_code_scanner_vd_theme_24
        float f = hll.a(((hll)((goz)object1).h(fft.a)).j);
        fiso.a(hpw0, null, dla.j(hhc.a(this.a, f), 0.0f, 0.0f, 4.0f, 0.0f, 11), hll.h(v1, hll.a(((hll)((goz)object1).h(fft.a)).j)), ((goz)object1), 56, 0);
        String s = isq.c(0x7F1520D1, ((goz)object1));  // string:pay_scan_qr_code_text "Credit or Debit QR Code"
        jbn jbn0 = fpu.d(((goz)object1)).m;
        float f1 = hll.a(((hll)((goz)object1).h(fft.a)).j);
        gdh.b(s, dla.j(hhc.a(this.a, f1), 4.0f, 0.0f, 0.0f, 0.0f, 14), v1, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFF8);
        return ibom.a;
    }
}

