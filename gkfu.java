public enum gkfu implements hfub {
    SEND_MESSAGE_RESULT_UNKNOWN(0),
    SEND_MESSAGE_RESULT_SUCCESS(1),
    SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST(2),
    SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL(3),
    SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE(4),
    SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR(5);

    public final int g;

    private gkfu(int v1) {
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

