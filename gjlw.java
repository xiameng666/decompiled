public enum gjlw implements hfub {
    PHASE_UNSPECIFIED(0),
    PHASE_INITIAL_CALL(1),
    PHASE_CARD_TAP_DATA_AVAILABLE(2),
    PHASE_INTERNAL_DATA_FETCHED(3),
    PHASE_UI_RENDERED(4);

    public final int f;

    private gjlw(int v1) {
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

