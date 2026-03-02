public enum hlxi implements hfub {
    UNKNOWN_REQUEST_TYPE(0),
    @Deprecated
    ONE_OFF_SYNC(1),
    DAILY_SYNC(2),
    FREQUENT_SYNC(3),
    @Deprecated
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC(4),
    PERIODIC_FULL_DOMAIN_FILTER_SYNC(5),
    @Deprecated
    ONE_OFF_SYNC_CHARGING_UNMETERED(6),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER(7),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN(8),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA(9),
    ONE_OFF_SYNC_AT_ACCOUNT_CHANGE(10),
    ONE_OFF_SYNC_AT_BOOT_COMPLETE(11),
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE(12),
    UNRECOGNIZED(-1);

    private final int p;

    private hlxi(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hlxi.n) {
            return this.p;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

