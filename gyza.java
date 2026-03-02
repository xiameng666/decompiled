public enum gyza implements hfub {
    UNKNOWN_ACTIVITY(0),
    SHARE_SHEET_ACTIVITY(1),
    SETTINGS_ACTIVITY(2),
    RECEIVE_SURFACE_ACTIVITY(3),
    SETUP_ACTIVITY(4),
    DEVICE_VISIBILITY_ACTIVITY(5),
    CONSENTS_ACTIVITY(6),
    SET_DEVICE_NAME_DIALOG(7),
    SET_DATA_USAGE_DIALOG(8),
    QUICK_SETTINGS_ACTIVITY(9),
    REMOTE_COPY_SHARE_SHEET_ACTIVITY(10),
    SETUP_WIZARD_ACTIVITY(11),
    SETTINGS_REVIEW_ACTIVITY(12);

    public final int n;

    private gyza(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

