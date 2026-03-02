public enum ghzu implements hfub {
    PHOTOS_OPT_IN_SHOWN_IN_SUW_UNSPECIFIED(0),
    SHOWN(1),
    NOT_SHOWN(2),
    ERROR_FETCHING_OPT_IN_TYPE(3);

    public final int e;

    private ghzu(int v1) {
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

