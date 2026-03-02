public enum gzxp implements hfub {
    ENABLEMENT_FAILURE_UNSPECIFIED(0),
    ENABLEMENT_SUCCESS(1),
    ENABLEMENT_FAILURE_UNKNOWN(2),
    ENABLEMENT_FAILURE_CONNECTION_UNAVAILABLE(3),
    ENABLEMENT_FAILURE_INVALID_REQUEST(4),
    ENABLEMENT_FAILURE_INVALID_RESPONSE(5),
    ENABLEMENT_FAILURE_ENABLEMENT_TIMEOUT(6),
    ENABLEMENT_FAILURE_FEATURE_NOT_SUPPORTED(7),
    UNRECOGNIZED(-1);

    private final int k;

    private gzxp(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxp.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

