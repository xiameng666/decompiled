public final class dcxq implements dixg {
    public final dcyu a;
    private final icck b;

    public dcxq(dcyu dcyu0) {
        icck icck0 = iccl.b(cclw.e);
        super();
        this.a = dcyu0;
        this.b = icck0;
    }

    @Override  // dixg
    public final iced a(dixi dixi0, ibts ibts0, Object object0) {
        ibuq.f(ibts0, "next");
        ibuq.f(object0, "event");
        if((object0 instanceof dcxm)) {
            dcxp dcxp0 = new dcxp(object0, this, dixi0, null);
            iced iced0 = icbb.b(this.b, null, null, dcxp0, 3);
            iced0.t(new dcxn(object0));
            return iced0;
        }
        return (iced)ibts0.a(object0);
    }
}

