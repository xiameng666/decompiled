public enum gzat implements hfub {
    USE_CASE_UNKNOWN(0),
    USE_CASE_NEARBY_SHARE(1),
    USE_CASE_REMOTE_COPY_PASTE(2),
    USE_CASE_WIFI_CREDENTIAL(3),
    USE_CASE_APP_SHARE(4),
    USE_CASE_QUICK_SETTING_FILE_SHARE(5),
    USE_CASE_SETUP_WIZARD(6),
    @Deprecated
    USE_CASE_NEARBY_SHARE_WITH_QR_CODE(7),
    USE_CASE_REDIRECTED_FROM_BLUETOOTH_SHARE(8);

    public final int j;

    private gzat(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.j;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

