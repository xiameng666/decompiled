final class ctoe implements icih {
    final icck a;
    final ctoq b;

    public ctoe(icck icck0, ctoq ctoq0) {
        this.a = icck0;
        this.b = ctoq0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(ibuq.m(((ctow)object0), ctot.a) || ibuq.m(((ctow)object0), ctov.a)) {
            icck icck0 = this.a;
            ctoq ctoq0 = this.b;
            synchronized(icck0) {
                iced iced0 = ctoq0.e;
                if(iced0 != null) {
                    iceb.a(iced0);
                }
                ctoq0.e = null;
                iccs iccs0 = ctoq0.d;
                if(iccs0 != null) {
                    iceb.a(iccs0);
                }
                ctoq0.d = null;
            }
        }
        return ibom.a;
    }
}

