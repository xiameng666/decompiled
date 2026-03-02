public enum hfqt implements hfub {
    UNKNOWN_ID(0),
    @Deprecated
    DEVICE_INFO(7),
    @Deprecated
    DEVICE_INFO_DEVICE_LEVEL(9),
    LOCATION_HISTORY(2),
    LOCATION_REPORTING(15),
    VOICE_AND_AUDIO(5),
    WEB_AND_APP(1),
    SUPPL_WEB_AND_APP(8),
    SUPPL_WEB_AND_APP_DEVICE_LEVEL(10),
    YT_SEARCH_HISTORY(3),
    YT_WATCH_HISTORY(4);

    public final int l;

    private hfqt(int v1) {
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

