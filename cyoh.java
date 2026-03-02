public enum cyoh {
    SASS_INITIATED_CONNECTING_A2DP(true),
    SASS_INITIATED_CONNECTING_HFP(true),
    SASS_INITIATED_CONNECTED_A2DP(true),
    SASS_INITIATED_CONNECTED_HFP(true),
    NON_SASS_INITIATED_CONNECTED(false),
    DISCONNECTED(false);

    public final boolean g;

    private cyoh(boolean z) {
        this.g = z;
    }
}

