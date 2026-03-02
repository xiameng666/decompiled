public enum hbzi implements hfub {
    UNKNOWN_CALLBACK_TRIGGER(0),
    INITIALIZE(1),
    OFFER(2),
    PAYMENT_METHOD(5),
    SHIPPING_ADDRESS(3),
    SHIPPING_OPTION(4);

    public final int g;

    private hbzi(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hbzi b(int v) {
        switch(v) {
            case 0: {
                return hbzi.a;
            }
            case 1: {
                return hbzi.b;
            }
            case 2: {
                return hbzi.c;
            }
            case 3: {
                return hbzi.e;
            }
            case 4: {
                return hbzi.f;
            }
            case 5: {
                return hbzi.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

