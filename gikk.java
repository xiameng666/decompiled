public enum gikk implements hfub {
    UNKNOWN(0),
    SUCCESS(1),
    GENERIC_SERVER_ERROR(100),
    RATE_LIMIT_EXCEEDED_ERROR(101),
    LOCAL_STORAGE_ERROR(102),
    INVALID_DATA_ERROR(103),
    NETWORK_ERROR(104),
    USER_RECOVERABLE_AUTH_ERROR(105),
    AUTH_ERROR(106),
    INTERNAL_ERROR(107),
    STALE_METADATA(108);

    public final int l;

    private gikk(int v1) {
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

