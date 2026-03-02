public final class ctlz extends ctmz {
    public final icmn a;
    final ctmk b;
    private final iced c;

    public ctlz(ctmk ctmk0, ctmn ctmn0, ctna ctna0) {
        this.b = ctmk0;
        super();
        this.a = icmu.e(0, 0, 0, 7);
        this.c = ctmk0.c == null ? null : icbb.b(ctmk0.c, null, null, new ctly(ctmn0, this, ctna0, null), 3);
    }

    @Override  // ctna
    public final void a() {
        iced iced0 = this.c;
        if(iced0 != null) {
            iceb.a(iced0);
        }
    }

    @Override  // ctna
    public final void c(byte[] arr_b) {
        ibuq.f(arr_b, "message");
        icck icck0 = this.b.c;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new ctls(this, arr_b, null), 3);
        }
    }
}

