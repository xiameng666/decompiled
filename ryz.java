public enum ryz implements sdk {
    UNKNOWN,
    PHENOTYPE_SYNC_COMPLETE,
    PLAY_EARLY_UPDATE_COMPLETE,
    AUTH_EARLY_UPDATE_COMPLETE,
    FIRST_ACCOUNT_ADDED,
    ACCOUNT_SETUP_COMPLETE,
    PERSONALIZATION_FLOW_STARTED,
    DEFERRED_SETUP_STARTED;

    public static final ryy a;
    private final String m;

    static {
        ryz.l = arr_ryz;
        ryz.j = ibsn.a(arr_ryz);
        ryz.a = new ryy();
    }

    private ryz() {
        this.m = this.name();
    }

    @Override  // sdk
    public final String b() {
        return this.m;
    }
}

