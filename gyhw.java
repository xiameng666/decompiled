public enum gyhw implements hfub {
    OPERATION_STATUS_UNKNOWN(0),
    OPERATION_STATUS_ACTIVE(1),
    OPERATION_STATUS_CANCELLED(2),
    OPERATION_STATUS_FINISHED(3),
    OPERATION_STATUS_FAILED(4),
    OPERATION_STATUS_MISSING(5),
    OPERATION_STATUS_PENDING(6),
    OPERATION_STATUS_STARTING(7),
    OPERATION_STATUS_UPDATE_FAILED(8);

    public final int j;

    private gyhw(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.j;
    }

    public static gyhw b(int v) {
        switch(v) {
            case 0: {
                return gyhw.a;
            }
            case 1: {
                return gyhw.b;
            }
            case 2: {
                return gyhw.c;
            }
            case 3: {
                return gyhw.d;
            }
            case 4: {
                return gyhw.e;
            }
            case 5: {
                return gyhw.f;
            }
            case 6: {
                return gyhw.g;
            }
            case 7: {
                return gyhw.h;
            }
            case 8: {
                return gyhw.i;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

