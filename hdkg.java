public enum hdkg implements hfub {
    ANIMATED_IMAGE_STATE_UNKNOWN(0),
    ANIMATED_IMAGE_STATE_NOT_STARTED(1),
    ANIMATED_IMAGE_STATE_RUNNING(2),
    ANIMATED_IMAGE_STATE_COMPLETED(3);

    public final int e;

    private hdkg(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hdkg b(int v) {
        switch(v) {
            case 0: {
                return hdkg.a;
            }
            case 1: {
                return hdkg.b;
            }
            case 2: {
                return hdkg.c;
            }
            case 3: {
                return hdkg.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

