public enum hcog implements hfub {
    FUNCTIONAL_DATA_EXECUTION_STATE_UNKNOWN(0),
    FUNCTIONAL_DATA_EXECUTION_STATE_NOT_STARTED(1),
    FUNCTIONAL_DATA_EXECUTION_STATE_RUNNING(2),
    FUNCTIONAL_DATA_EXECUTION_STATE_CANCELLED(3),
    FUNCTIONAL_DATA_EXECUTION_STATE_COMPLETED(4),
    FUNCTIONAL_DATA_EXECUTION_STATE_FAILED(5);

    public final int g;

    private hcog(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hcog b(int v) {
        switch(v) {
            case 0: {
                return hcog.a;
            }
            case 1: {
                return hcog.b;
            }
            case 2: {
                return hcog.c;
            }
            case 3: {
                return hcog.d;
            }
            case 4: {
                return hcog.e;
            }
            case 5: {
                return hcog.f;
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

