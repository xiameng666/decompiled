public enum hfae implements hfub {
    UNKNOWN_SYNC_TYPE(0),
    DO_NOT_SYNC(1),
    SYNCABLE_TO_BACKEND(2),
    SYNCABLE_TO_BACKEND_ANONYMOUS_ACCOUNT_ONLY(3),
    SYNCABLE_TO_BACKEND_ACCOUNT_ONLY(4);

    public final int f;

    private hfae(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hfae b(int v) {
        switch(v) {
            case 0: {
                return hfae.a;
            }
            case 1: {
                return hfae.b;
            }
            case 2: {
                return hfae.c;
            }
            case 3: {
                return hfae.d;
            }
            case 4: {
                return hfae.e;
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

