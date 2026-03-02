public enum gkfq implements hfub {
    REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT(1),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION(2),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS(3),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS(4),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK(5),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS(6);

    public final int h;

    private gkfq(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

