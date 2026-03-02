public enum gyzi implements hfub {
    BUTTON_STATUS_UNKNOWN(0),
    BUTTON_STATUS_CLICK_ACCEPT(1),
    BUTTON_STATUS_CLICK_REJECT(2),
    BUTTON_STATUS_IGNORE(3);

    public final int e;

    private gyzi(int v1) {
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

