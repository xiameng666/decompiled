public enum gicj implements hfub {
    BACKUP_TRANSPORT_UNSPECIFIED(0),
    UNKNOWN_TRANSPORT_SERVICE(1),
    LOCAL_TRANSPORT(2),
    GMS_BACKUP_TRANSPORT_SERVICE(3),
    D2D_TRANSPORT_SERVICE(4),
    LEGACY_BACKUP_TRANSPORT_SERVICE(5);

    public final int g;

    private gicj(int v1) {
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

