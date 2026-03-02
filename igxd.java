final class igxd extends igvx {
    private final igwt e;
    private final igwt f;

    public igxd(igvt igvt0, String s) {
        super(igvt0, s);
        igvv igvv0 = igvt0.e();
        igwh igwh0 = new igwh(igvt0);
        this.e(igwh0);
        this.f = igwh0;
        igwt igwt0 = new igwt(igvt0, "CurrencyCode", 2);
        this.e(igwt0);
        this.e = igwt0;
        igvt0.g(igvv0);
        igvt0.c(4);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final String toString() {
        String[] arr_s = {"00", "01", "10", "11"};
        return String.format("%1$s %2$s", arr_s[((short)(((Short)this.f.b())))], arr_s[((short)(((Short)this.e.b())))]);
    }
}

