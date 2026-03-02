public enum gtbx implements hfub {
    DEFAULT_NONE(0),
    SCANNING_FOR_DEVICE(10),
    CONNECTING_TO_DEVICE(11),
    CONNECTING_TO_CACHED_DEVICE(12),
    RE_SCANNING_FOR_DEVICE(13),
    DEVICE_NOT_IN_RANGE(20),
    DEVICE_CONNECTION_ERROR(21),
    DEVICE_COMMUNICATION_ERROR(22),
    INCORRECT_RING_CREDENTIALS(23),
    BLUETOOTH_DISABLED(24),
    BLUETOOTH_TOO_BUSY_TO_SCAN(25),
    UNRECOGNIZED(-1);

    private final int n;

    private gtbx(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gtbx.l) {
            return this.n;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

