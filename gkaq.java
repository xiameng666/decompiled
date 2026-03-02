public enum gkaq implements hfub {
    FIELD_TYPE_UNKNOWN(0),
    FIELD_TYPE_TITLE(1),
    FIELD_TYPE_DESCRIPTION(2),
    FIELD_TYPE_DETAIL_FIELD(3);

    public final int e;

    private gkaq(int v1) {
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

