public enum dciy implements hfub {
    UNKNOWN(0),
    ACCEPT(1),
    REJECT(2),
    NOT_ENOUGH_SPACE(3),
    UNSUPPORTED_ATTACHMENT_TYPE(4),
    TIMED_OUT(5);

    public final int g;

    private dciy(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static dciy b(int v) {
        switch(v) {
            case 0: {
                return dciy.a;
            }
            case 1: {
                return dciy.b;
            }
            case 2: {
                return dciy.c;
            }
            case 3: {
                return dciy.d;
            }
            case 4: {
                return dciy.e;
            }
            case 5: {
                return dciy.f;
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

