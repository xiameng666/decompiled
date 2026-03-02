public enum gzap implements hfub {
    UNKNOWN_SERVER_RESPONSE_STATE(0),
    SERVER_RESPONSE_SUCCESS(1),
    SERVER_RESPONSE_UNKNOWN_FAILURE(2),
    SERVER_RESPONSE_STATUS_OTHER_FAILURE(3),
    SERVER_RESPONSE_STATUS_DEADLINE_EXCEEDED(4),
    SERVER_RESPONSE_STATUS_PERMISSION_DENIED(5),
    SERVER_RESPONSE_STATUS_UNAVAILABLE(6),
    SERVER_RESPONSE_STATUS_UNAUTHENTICATED(7),
    SERVER_RESPONSE_STATUS_INVALID_ARGUMENT(9),
    SERVER_RESPONSE_GOOGLE_AUTH_FAILURE(8),
    SERVER_RESPONSE_NOT_CONNECTED_TO_INTERNET(10);

    public final int l;

    private gzap(int v1) {
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

