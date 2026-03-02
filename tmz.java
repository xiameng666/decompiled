public final class tmz extends tau {
    public tmz() {
    }

    public tmz(byte[] arr_b) {
        super(arr_b);
    }

    @Override  // tau
    public final tdc g() {
        return this.l();
    }

    @Override  // tau
    public final tdd h() {
        return this.m();
    }

    @Override  // tau
    public final tdk i() {
        return this.n();
    }

    public final tde l() {
        byte[] arr_b = this.b(tdc.c);
        return arr_b == null ? null : new tde(arr_b);
    }

    public final tdf m() {
        byte[] arr_b = this.b(tdd.c);
        return arr_b == null ? null : new tdf(arr_b);
    }

    public final tdg n() {
        byte[] arr_b = this.b(tdk.d);
        return arr_b == null ? null : new tdg(arr_b);
    }
}

