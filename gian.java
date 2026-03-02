public enum gian implements hfub {
    RESULT_TYPE_UNSPECIFIED(0),
    SUCCESS(1),
    ERROR_UNKNOWN(2),
    FEATURE_NOT_ENABLED(3),
    BACKUP_NOT_ENABLED(4),
    ACCOUNTS_PERMISSION_NOT_GRANTED(5);

    public final int g;

    private gian(int v1) {
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

