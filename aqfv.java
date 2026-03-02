public enum aqfv implements hfub {
    BACKUP_TYPE_UNKNOWN(0),
    BACKUP_TYPE_KEY_VALUE(1),
    BACKUP_TYPE_FULL(2),
    BACKUP_TYPE_CUSTOM(3);

    public final int e;

    private aqfv(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static aqfv b(int v) {
        switch(v) {
            case 0: {
                return aqfv.a;
            }
            case 1: {
                return aqfv.b;
            }
            case 2: {
                return aqfv.c;
            }
            case 3: {
                return aqfv.d;
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

