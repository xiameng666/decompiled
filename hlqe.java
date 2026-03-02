public enum hlqe implements hfub {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);

    public final int f;

    private hlqe(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hlqe b(int v) {
        switch(v) {
            case 0: {
                return hlqe.a;
            }
            case 1: {
                return hlqe.b;
            }
            case 2: {
                return hlqe.c;
            }
            case 3: {
                return hlqe.d;
            }
            case 4: {
                return hlqe.e;
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

