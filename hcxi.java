public enum hcxi implements hfub {
    CALLBACK_TYPE_UNKNOWN(0),
    CALLBACK_TYPE_DYNAMIC_PRICE_UPDATE(1),
    CALLBACK_TYPE_PAYMENT_AUTHORIZED(2);

    private final int e;

    private hcxi(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hcxi b(int v) {
        switch(v) {
            case 0: {
                return hcxi.a;
            }
            case 1: {
                return hcxi.b;
            }
            case 2: {
                return hcxi.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

