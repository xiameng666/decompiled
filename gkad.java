public enum gkad implements hfub {
    PAGE_ENDING_STATE_UNKNOWN(0),
    PAGE_ENDING_STATE_UPDATE_SUCCESS(1),
    PAGE_ENDING_STATE_UPDATE_CANCELED(2),
    PAGE_ENDING_STATE_UPDATE_FAILED(3);

    public final int e;

    private gkad(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

