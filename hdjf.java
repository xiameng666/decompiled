public enum hdjf implements hfub {
    REPETITION_UNKNOWN(0),
    REPETITION_ONCE(1),
    REPETITION_CONTINUOUS(2);

    public final int d;

    private hdjf(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static hdjf b(int v) {
        switch(v) {
            case 0: {
                return hdjf.a;
            }
            case 1: {
                return hdjf.b;
            }
            case 2: {
                return hdjf.c;
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

