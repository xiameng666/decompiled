public enum hcse implements hfub {
    TRIGGER_TYPE_UNKNOWN(0),
    TRIGGER_TYPE_FUNCTIONAL_DATA_EXECUTION_STATE_CHANGE(1),
    TRIGGER_TYPE_DATA_VALIDITY_STATE_CHANGE(2),
    TRIGGER_TYPE_DATA_ENABLEMENT_STATE_CHANGE(3),
    TRIGGER_TYPE_CLIENT_STATE_CHANGE(4);

    public final int f;

    private hcse(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hcse b(int v) {
        switch(v) {
            case 0: {
                return hcse.a;
            }
            case 1: {
                return hcse.b;
            }
            case 2: {
                return hcse.c;
            }
            case 3: {
                return hcse.d;
            }
            case 4: {
                return hcse.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

