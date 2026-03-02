public enum gkex implements hfub {
    DISCOVERY_STOP_UNKNOWN(0),
    DISCOVERY_STOP_CRITERIA_CHANGED(1),
    DISCOVERY_STOP_NETWORK_CHANGE(2),
    DISCOVERY_STOP_SCREEN_OFF(3),
    DISCOVERY_STOP_BACKGROUND_MODE(4),
    DISCOVERY_STOP_CONFIGURATION_UPDATED(5),
    DISCOVERY_STOP_APPLICATION_FINISHED(6),
    DISCOVERY_STOP_CAST_DISABLED(7);

    public final int i;

    private gkex(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

