public final class dwev implements evqc {
    public final dwfb a;

    public dwev(dwfb dwfb0) {
        this.a = dwfb0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dwfb.a.i(), "Failed to acknowledge user notice.", exception0);
        dweg dweg0 = dweg.a(this.a.a(), null, null, null, null, null, new frzf(8), 0x1F);
        this.a.j(dweg0);
        icck icck0 = lsc.a(this.a);
        frxf[] arr_frxf = {new frxh(new fryr(0x7F1508E3))};  // string:common_something_went_wrong "Something went wrong"
        this.a.i(icck0, arr_frxf);
    }
}

