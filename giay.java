public enum giay implements hfub {
    UNKNOWN_JOB(0),
    APPS(1),
    CONTACTS(2),
    FINAL_HOLD(3),
    SYSTEM_RESTORE(4),
    WEAR_SERVICES(5);

    public final int g;

    private giay(int v1) {
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

