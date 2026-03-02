public final class bhi extends bkh {
    public final bmc a;
    public final bia b;
    private final bik c;

    public bhi(bik bik0, bia bia0) {
        super(bik0);
        this.c = bik0;
        this.b = bia0;
        this.a = bia0.b();
        Boolean boolean0 = Boolean.valueOf(false);
        Boolean boolean1 = (Boolean)blq.c(bia0, bia.d, boolean0);
        Boolean boolean2 = (Boolean)blq.c(bia0, bia.f, boolean0);
    }

    @Override  // bkh
    public final bik f() {
        return this.c;
    }
}

