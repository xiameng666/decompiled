public final class dlmp implements fsat {
    private final vsc a;

    public dlmp(vsc vsc0) {
        this.a = vsc0;
    }

    @Override  // fsat
    public final void a() {
        vsc vsc0 = this.a;
        if(vsc0.c != 8) {
            dlmw dlmw0 = vsc0.b;
            if(dlmw0 != null) {
                dlmw0.a(vsd.b);
            }
        }
    }

    @Override  // fsat
    public final byte[] b(byte[] arr_b) {
        ibuq.f(arr_b, "apdu");
        return this.a.a(arr_b);
    }
}

