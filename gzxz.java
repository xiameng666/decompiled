@Deprecated
public enum gzxz implements hfub {
    UNKNOWN_EVENT_TYPE(0),
    ACTIVE_UNLOCK_UNLOCK_EVENT(1),
    ACTIVE_UNLOCK_ENROLLMENT_RESULT_EVENT(2),
    ACTIVE_UNLOCK_ENROLLMENT_FLOW_EVENT(3),
    ACTIVE_UNLOCK_UNENROLLMENT_EVENT(4),
    ACTIVE_UNLOCK_RELOCK_EVENT(5),
    ACTIVE_UNLOCK_ENTRY_POINT_EVENT(6),
    ACTIVE_UNLOCK_REENROLLMENT_EVENT(7),
    ACTIVE_UNLOCK_RPC_CONNECTION_EVENT(8),
    UNRECOGNIZED(-1);

    private final int l;

    private gzxz(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxz.j) {
            return this.l;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

