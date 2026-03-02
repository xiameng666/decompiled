public enum gkbb implements hfub {
    UNKNOWN_RESOURCE_TYPE(0),
    IMAGE(1),
    BARCODE(2);

    public final int d;

    private gkbb(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

