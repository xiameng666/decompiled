public final class bdot {
    public static final void a(goz goz0, int v) {
        goz goz1 = goz0.ao(0xBA4E0735);
        if(v == 0) {
            v = 0;
            if(goz1.ac()) {
                goz1.G();
            }
            else {
                fitn.a(dls.k(hfc.e, 20.0f), fpu.a(goz1).b, 1.5f, 0L, 1, 0.0f, goz1, 390, 40);
            }
        }
        else {
            fitn.a(dls.k(hfc.e, 20.0f), fpu.a(goz1).b, 1.5f, 0L, 1, 0.0f, goz1, 390, 40);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdos(v);
        }
    }
}

