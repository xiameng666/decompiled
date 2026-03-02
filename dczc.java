public final class dczc implements dixg {
    public final ddag a;
    private final icck b;

    public dczc(ddag ddag0) {
        ibuq.f(ddag0, "settingsRepository");
        icck icck0 = iccl.b(cclw.e);
        ibuq.f(ddag0, "settingsRepository");
        super();
        this.a = ddag0;
        this.b = icck0;
    }

    @Override  // dixg
    public final iced a(dixi dixi0, ibts ibts0, Object object0) {
        ibuq.f(ibts0, "next");
        ibuq.f(object0, "event");
        if((object0 instanceof dcyy)) {
            dczb dczb0 = new dczb(object0, this, dixi0, null);
            iced iced0 = icbb.b(this.b, null, null, dczb0, 3);
            iced0.t(new dcyz(object0));
            return iced0;
        }
        return (iced)ibts0.a(object0);
    }
}

