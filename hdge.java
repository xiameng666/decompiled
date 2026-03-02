public enum hdge implements hfub {
    LOADING_STATE_UNKNOWN(0),
    LOADING_STATE_NOT_STARTED(1),
    LOADING_STATE_RUNNING(2),
    LOADING_STATE_COMPLETED(3),
    LOADING_STATE_FAILED(4);

    public final int f;

    private hdge(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdge b(int v) {
        switch(v) {
            case 0: {
                return hdge.a;
            }
            case 1: {
                return hdge.b;
            }
            case 2: {
                return hdge.c;
            }
            case 3: {
                return hdge.d;
            }
            case 4: {
                return hdge.e;
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

