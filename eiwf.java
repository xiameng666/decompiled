public enum eiwf implements hfub {
    SYNC_STATUS_UNKNOWN(0),
    SYNC_STATUS_RECEIVED_STATUS_UPDATE_FROM_OTA(1),
    SYNC_STATUS_PHENOTYPE_SYNC_SUCCESSFUL(3),
    SYNC_STATUS_CURRENT_PLATFORM_BUILD_ID_SET(4),
    UNRECOGNIZED(-1);

    private final int g;

    private eiwf(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != eiwf.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

