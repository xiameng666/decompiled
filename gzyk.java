public enum gzyk implements hfub {
    UNKNOWN_RELOCK_EVENT(0),
    RELOCK_REQUESTED_FROM_AD(1),
    RELOCK_INVOKED_FROM_AD(2),
    RELOCK_DISCONNECTED_FROM_AD(3),
    RELOCK_NOTIFICATION_SHOWN_SUCCESSFULLY_ON_AD(4),
    RELOCK_NOTIFICATION_CONNECTION_LOST_SHOWN_ON_AD(5),
    RELOCK_HEARTBEAT_DELAYED_ON_AD(6),
    RELOCK_BLUETOOTH_TURNED_OFF_ON_PD(7),
    RELOCK_DISTANCE_BASED_RELOCK_CROSSED_THRESHOLD(8),
    RELOCK_DISTANCE_BASED_DISTANCE_MONITOR_FAILURE(9),
    UNRECOGNIZED(-1);

    private final int m;

    private gzyk(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyk.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

