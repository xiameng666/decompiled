public enum hddb implements hfub {
    TRIGGER_TYPE_UNKNOWN(0),
    TRIGGER_TYPE_BACK_NAVIGATION(1),
    TRIGGER_TYPE_SUBMIT_REQUEST_STARTED(2),
    TRIGGER_TYPE_SUBMIT_REQUEST_FINISHED(3),
    TRIGGER_TYPE_CLIENT_RESUMED_APP(4),
    TRIGGER_TYPE_FORWARD_NAVIGATION(5);

    public final int g;

    private hddb(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hddb b(int v) {
        switch(v) {
            case 0: {
                return hddb.a;
            }
            case 1: {
                return hddb.b;
            }
            case 2: {
                return hddb.c;
            }
            case 3: {
                return hddb.d;
            }
            case 4: {
                return hddb.e;
            }
            case 5: {
                return hddb.f;
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

