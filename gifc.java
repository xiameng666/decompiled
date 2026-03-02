public enum gifc implements hfub {
    NOTIFICATION_NOT_SHOWN_REASON_UNKNOWN(0),
    PHOTOS_APP_NOT_MISSING_PERMISSION(1),
    PHOTOS_BACKUP_NOT_ON(2),
    PHOTOS_BACKUP_OPT_IN_NOT_SHOWN_IN_SUW(3),
    NOTIFICATION_SHOWN_RECENTLY(4),
    PHOTOS_NOTIFICATION_INTENT_MISSING(5);

    public final int g;

    private gifc(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

