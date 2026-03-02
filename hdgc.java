public enum hdgc implements hfub {
    AUTHORIZATION_STATE_UNKNOWN(0),
    AUTHORIZATION_STATE_NOT_STARTED(1),
    AUTHORIZATION_STATE_RUNNING(2),
    AUTHORIZATION_STATE_COMPLETED(3),
    AUTHORIZATION_STATE_FAILED(4);

    public final int f;

    private hdgc(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdgc b(int v) {
        switch(v) {
            case 0: {
                return hdgc.a;
            }
            case 1: {
                return hdgc.b;
            }
            case 2: {
                return hdgc.c;
            }
            case 3: {
                return hdgc.d;
            }
            case 4: {
                return hdgc.e;
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

