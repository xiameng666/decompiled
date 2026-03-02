public enum gqrn implements hfub {
    FLOW_OUTCOME_DEFAULT(0),
    FLOW_OUTCOME_SUCCESS(1),
    FLOW_OUTCOME_CANCELLED(2),
    FLOW_OUTCOME_ERROR(3),
    FLOW_OUTCOME_NO_OP(4);

    public final int f;

    private gqrn(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gqrn b(int v) {
        switch(v) {
            case 0: {
                return gqrn.a;
            }
            case 1: {
                return gqrn.b;
            }
            case 2: {
                return gqrn.c;
            }
            case 3: {
                return gqrn.d;
            }
            case 4: {
                return gqrn.e;
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

