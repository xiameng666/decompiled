public enum gytp implements hfub {
    UNKNOWN_RESPONSE_CODE(0),
    CONNECTION_ACCEPTED(1),
    NOT_LISTENING(2);

    public final int d;

    private gytp(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gytp b(int v) {
        switch(v) {
            case 0: {
                return gytp.a;
            }
            case 1: {
                return gytp.b;
            }
            case 2: {
                return gytp.c;
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

