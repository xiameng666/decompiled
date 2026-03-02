public enum gifo implements hfub {
    REQUEST_TYPE_UNSPECIFIED(0),
    GET_DEVICES_REQUEST(1),
    KV_BACKUP_PARTIAL_REQUEST(2),
    KV_BACKUP_FINAL_REQUEST(3),
    KV_BACKUP_ABORT_REQUEST(4),
    RESTORE_REQUEST(5),
    FULL_BACKUP_REQUEST(6),
    ENCRYPTED_BACKUP_INCREMENTAL(7),
    ENCRYPTED_BACKUP_NON_INCREMENTAL(8),
    SET_ACTIVE_SECONDARY_KEY(9),
    GET_APP_KEY_DENYLIST_INFO(10),
    UPDATE_BACKUP_TIMESTAMP(11);

    public final int m;

    private gifo(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.m;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

