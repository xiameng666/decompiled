public enum gifh implements hfub {
    UNSPECIFIED(0),
    DATA_STORE_MIGRATION_SUCCESS(1),
    DATA_STORE_MIGRATION_ERROR(2),
    DATA_STORE_READ_SUCCESS(3),
    DATA_STORE_READ_ERROR(4),
    DATA_STORE_UPDATE_SUCCESS(5),
    DATA_STORE_UPDATE_ERROR(6),
    APP_STATE_UNSPECIFIED(7),
    APP_STATE_UNEXPECTED_ERROR(8),
    APP_STATE_RESTORED(9),
    APP_STATE_FIRST_OPENED(10),
    APP_STATE_CHECK_PASSED(11),
    APP_STATE_DATA_RESET_CALLED(12),
    APP_STATE_DATA_RESET_FINISHED(13),
    APP_STATE_CRASHED(14),
    APP_STATE_UNINSTALLED(15),
    APP_STATE_REINSTALLED(16),
    APP_STATE_DATA_CLEARED(17);

    public final int s;

    private gifh(int v1) {
        this.s = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.s;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}

