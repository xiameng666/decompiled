public final class dcwf implements dixg {
    public final dcmf a;
    private final icck b;

    public dcwf(dcmf dcmf0) {
        ibuq.f(dcmf0, "sharingClient");
        icck icck0 = iccl.b(cclw.e);
        ibuq.f(dcmf0, "sharingClient");
        super();
        this.a = dcmf0;
        this.b = icck0;
    }

    @Override  // dixg
    public final iced a(dixi dixi0, ibts ibts0, Object object0) {
        ibuq.f(ibts0, "next");
        ibuq.f(object0, "event");
        if((object0 instanceof dcwb)) {
            dcwe dcwe0 = new dcwe(object0, this, dixi0, null);
            iced iced0 = icbb.b(this.b, null, null, dcwe0, 3);
            iced0.t(new dcwc(object0));
            return iced0;
        }
        return (iced)ibts0.a(object0);
    }
}

