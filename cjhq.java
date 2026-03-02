public enum cjhq {
    UNKNOWN(0),
    GPS(1),
    CELL(2),
    WIFI(3);

    public final int e;

    static {
        cjhq.f = arr_cjhq;
        ibsn.a(arr_cjhq);
    }

    private cjhq(int v1) {
        this.e = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "UNKNOWN";
            }
            case 1: {
                return "GPS";
            }
            case 2: {
                return "CELL";
            }
            case 3: {
                return "WIFI";
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

