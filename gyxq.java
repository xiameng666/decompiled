public enum gyxq implements hfub {
    UNKNOWN_PAYLOAD_STATUS(0),
    SUCCESS(1),
    LOCAL_ERROR(2),
    REMOTE_ERROR(3),
    ENDPOINT_IO_ERROR(4),
    MOVED_TO_NEW_MEDIUM(5),
    CONNECTION_CLOSED(6),
    LOCAL_CANCELLATION(7),
    REMOTE_CANCELLATION(8),
    ENDPOINT_UNENCRYPTED(9),
    LOCAL_CLIENT_DISCONNECTION(10),
    REMOTE_CLIENT_DISCONNECTION(11);

    public final int m;

    private gyxq(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.m;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

