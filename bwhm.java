public enum bwhm implements hfub {
    RUNTIME_STATE_UNKNOWN(0),
    READY(1),
    REQUIRE_RUNTIME_DOWNLOAD(2),
    REQUIRE_RUNTIME_UPDATE(3),
    REQUIRE_HIGH_POWER_MODE(4),
    REQUIRE_OOBE_SETUP(5),
    REQUIRE_REAUTHENTICATION(6),
    UNRECOGNIZED(-1);

    private final int j;

    private bwhm(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != bwhm.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

