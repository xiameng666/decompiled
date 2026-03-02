public enum ajap implements hfub {
    UNKNOWN(0),
    TASK_SCHEDULED(1),
    TASK_EXECUTED(2);

    public final int d;

    private ajap(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static ajap b(int v) {
        switch(v) {
            case 0: {
                return ajap.a;
            }
            case 1: {
                return ajap.b;
            }
            case 2: {
                return ajap.c;
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

