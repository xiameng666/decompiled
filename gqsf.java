public enum gqsf implements hfub {
    UP_BUTTON_ACTION_UNSPECIFIED(0),
    GO_BACK_OR_CLOSE(1),
    CLOSE(2);

    public final int d;

    private gqsf(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gqsf b(int v) {
        switch(v) {
            case 0: {
                return gqsf.a;
            }
            case 1: {
                return gqsf.b;
            }
            case 2: {
                return gqsf.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

