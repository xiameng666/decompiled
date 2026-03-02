public enum bxrg implements hfub {
    DEFAULT_PASSWORD_SAVING_FLOW_STEP(0),
    MATCH_PASSWORDS(1),
    ACCOUNT_SELECTION(2),
    ACCOUNT_CONFIRMATION(3),
    SAVE_PASSWORD(4),
    PASSWORD_SAVING_ZUUL_INTRO(7),
    PASSWORD_SAVING_ZUUL_KEY_RETRIEVAL(8);

    public final int h;

    private bxrg(int v1) {
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

