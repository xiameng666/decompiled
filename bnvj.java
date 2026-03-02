public enum bnvj {
    UNKNOWN(0, 2),
    CANNOT_GENERATE_KEY_UNSUPPORTED_FRAMEWORK(1, 2),
    CANNOT_GENERATE_MISSING_LSKF(2, 2),
    WAITING_FOR_KEY_GENERATION(3, 3),
    WAITING_FOR_KEY_SNAPSHOT(4, 3),
    WAITING_FOR_CONSENT(5, 1),
    SYNC_IN_PROGRESS(6, 4),
    SYNCED(7, 4),
    PERMANENT_FAILURE(8, 2);

    public static final bboh j;
    public static final ggeo k;
    public final int l;
    private final int n;

    static {
        bnvj.j = bboh.b("ScreenLockSyncStatus", bbcu.eD);
        ggek ggek0 = new ggek();
        bnvj[] arr_bnvj = bnvj.values();
        for(int v = 0; v < arr_bnvj.length; ++v) {
            bnvj bnvj0 = arr_bnvj[v];
            ggek0.i(Integer.valueOf(bnvj0.n), bnvj0);
        }
        bnvj.k = ggek0.b();
    }

    private bnvj(int v1, int v2) {
        this.n = v1;
        this.l = v2;
    }
}

