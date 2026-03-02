public enum bcwx implements hfub {
    NOT_SYNCED_MISSING_GCM_ID(1),
    NOT_SYNCED_BUT_READY_TO_SYNC(2),
    SYNCED(3);

    public final int d;

    private bcwx(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static bcwx b(int v) {
        switch(v) {
            case 1: {
                return bcwx.a;
            }
            case 2: {
                return bcwx.b;
            }
            case 3: {
                return bcwx.c;
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

