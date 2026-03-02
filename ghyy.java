public enum ghyy implements hfub {
    BACKUP_OBSERVER_RESULT_UNSPECIFIED(0),
    SUCCESS(1),
    ERROR_BACKUP_NOT_ALLOWED(2),
    ERROR_PACKAGE_NOT_FOUND(3),
    ERROR_BACKUP_CANCELLED(4),
    ERROR_TRANSPORT_ABORTED(5),
    ERROR_TRANSPORT_PACKAGE_REJECTED(6),
    ERROR_AGENT_FAILURE(7),
    ERROR_TRANSPORT_QUOTA_EXCEEDED(8);

    public final int j;

    private ghyy(int v1) {
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

