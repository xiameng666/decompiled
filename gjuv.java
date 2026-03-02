public enum gjuv implements hfub {
    UNKNOWN_RESULT(0),
    SUCCESS(1),
    TEAR(2),
    PAY_ON_WEAR_DISABLED(3),
    CDCVM_REQUIRED(4),
    VELOCITY_CHECK(5),
    PPSE_ONLY(6),
    APPLET_FAILURE_GPO(7),
    APPLET_FAILURE_GEN_AC(8),
    DECLINED(9),
    APPLET_FAILURE_TRANSACTION_NOT_STARTED(10);

    public final int l;

    private gjuv(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

