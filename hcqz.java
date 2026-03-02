public enum hcqz implements hfub {
    CONDITION_TYPE_UNKNOWN(0),
    CONDITION_TYPE_FUNCTIONAL_DATA_EXECUTION_STATE_VALUE_MATCH(1),
    CONDITION_TYPE_FUNCTIONAL_ERROR_CODE_MATCH(2),
    CONDITION_TYPE_FUNCTIONAL_CANCEL_CODE_MATCH(3),
    CONDITION_TYPE_VALIDITY_MATCH(4),
    CONDITION_TYPE_ENABLEMENT_MATCH(5),
    CONDITION_TYPE_CLIENT_STATE_MATCH(6);

    public final int h;

    private hcqz(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static hcqz b(int v) {
        switch(v) {
            case 0: {
                return hcqz.a;
            }
            case 1: {
                return hcqz.b;
            }
            case 2: {
                return hcqz.c;
            }
            case 3: {
                return hcqz.d;
            }
            case 4: {
                return hcqz.e;
            }
            case 5: {
                return hcqz.f;
            }
            case 6: {
                return hcqz.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

