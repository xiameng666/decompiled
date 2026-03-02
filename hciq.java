public enum hciq implements hfub {
    UNKNOWN_API_METHOD(0),
    GSP_AUTHENTICATE(1),
    DCB_GET_PROPERTIES(2),
    GSP_REDIRECT_CAPTURE(3),
    UPI_PAY(4);

    public final int f;

    private hciq(int v1) {
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

