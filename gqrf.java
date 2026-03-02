public enum gqrf implements hfub {
    UNKNOWN(0),
    USER_CANCEL(1),
    FAILED(2),
    SUCCESS(3),
    NO_OP(4);

    public final int f;

    private gqrf(int v1) {
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

