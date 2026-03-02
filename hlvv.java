public enum hlvv implements hfub {
    START_MILLIS(1),
    REPORT_LENGTH_HOURS(2);

    private final int d;

    private hlvv(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static hlvv b(int v) {
        switch(v) {
            case 1: {
                return hlvv.a;
            }
            case 2: {
                return hlvv.b;
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

