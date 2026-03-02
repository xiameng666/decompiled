public enum gkal implements hfub {
    SAVE_FAILURE_UNKNOWN(0),
    SAVE_FAILURE_URI_MISSING(1),
    SAVE_FAILURE_SAVE_VALUABLES_RPC_EXCEPTION(2),
    SAVE_FAILURE_NO_VALUABLE_RETURNED(3),
    SAVE_FAILURE_IMAGE_SAVE_FAILED(4),
    SAVE_FAILURE_INSUFFICIENT_STORAGE(5);

    public final int g;

    private gkal(int v1) {
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

