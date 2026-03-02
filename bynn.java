final class bynn implements ibtw {
    final ibth a;

    public bynn(ibth ibth0) {
        this.a = ibth0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = isq.c(0x7F1529C9, ((goz)object0));  // string:save_to "Save to"
        hqf hqf0 = evy.a();
        String s1 = isq.c(0x7F1500B5, ((goz)object0));  // string:accessibility_back_arrow_button "Go back to the previous page"
        bykp.d(s, 16.0f, this.a, hqf0, s1, ((goz)object0), 0x30);
        return ibom.a;
    }
}

