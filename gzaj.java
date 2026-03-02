public enum gzaj implements hfub {
    PROCESSING_STATUS_UNKNOWN(0),
    PROCESSING_STATUS_COMPLETE_PROCESSING_ATTACHMENTS(1),
    PROCESSING_STATUS_FAILED_MOVING_FILES(2),
    PROCESSING_STATUS_FAILED_RECEIVING_APK(3),
    PROCESSING_STATUS_FAILED_RECEIVING_TEXT(4),
    PROCESSING_STATUS_FAILED_RECEIVING_WIFI_CREDENTIALS(5);

    public final int g;

    private gzaj(int v1) {
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

