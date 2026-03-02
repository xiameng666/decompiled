public enum gkaf implements hfub {
    UPDATE_FAILURE_UNKNOWN(0),
    UPDATE_FAILURE_UPDATE_VALUABLES_RPC_EXCEPTION(1),
    UPDATE_FAILURE_NO_VALUABLE_RETURNED(2),
    UPDATE_FAILURE_LOCAL_SAVE_FAILED(3),
    UPDATE_FAILURE_SYNC_VALUABLE_FAILED(4);

    public final int f;

    private gkaf(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

