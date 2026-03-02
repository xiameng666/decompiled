public final class aiwl {
    public final int a;
    public final gged_interceptors b;
    public final gged_interceptors c;
    public final int d;
    public final int e;
    private final int f;

    public aiwl() {
        throw null;
    }

    public aiwl(int v, int v1, int v2, gged_interceptors gged0, gged_interceptors gged1, int v3) {
        this.f = v;
        this.e = v1;
        this.a = v2;
        this.b = gged0;
        this.c = gged1;
        this.d = v3;
    }

    static aiwk a() {
        aiwk aiwk0 = new aiwk();
        aiwk0.e(iaph.a.r);
        aiwk0.a = 1;
        aiwk0.b = 1;
        aiwk0.d(0);
        return aiwk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aiwl)) {
            int v = this.f;
            int v1 = ((aiwl)object0).f;
            if(v == 0) {
                throw null;
            }
            if(v == v1) {
                int v2 = this.e;
                int v3 = ((aiwl)object0).e;
                if(v2 != 0) {
                    return v2 == v3 && this.a == ((aiwl)object0).a && ggia.i(this.b, ((aiwl)object0).b) && ggia.i(this.c, ((aiwl)object0).c) && this.d == ((aiwl)object0).d;
                }
                throw null;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.f;
        if(v == 0) {
            throw null;
        }
        int v1 = this.e;
        if(v1 != 0) {
            return this.d ^ (((((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ this.a) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        String s;
        switch(this.f) {
            case 1: {
                s = "UNKNOWN";
                break;
            }
            case 2: {
                s = "READ";
                break;
            }
            case 3: {
                s = "WRITE";
                break;
            }
            default: {
                s = "null";
            }
        }
        switch(this.e) {
            case 1: {
                return "SyncResult{requestType=" + s + ", resultType=" + "UNKNOWN" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
            case 2: {
                return "SyncResult{requestType=" + s + ", resultType=" + "SUCCESS" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
            case 3: {
                return "SyncResult{requestType=" + s + ", resultType=" + "FAILURE_AUTH_ERR" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
            case 4: {
                return "SyncResult{requestType=" + s + ", resultType=" + "FAILURE_RPC_ERR" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
            case 5: {
                return "SyncResult{requestType=" + s + ", resultType=" + "FAILURE_UNKNOWN" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
            default: {
                return "SyncResult{requestType=" + s + ", resultType=" + "null" + ", statusCode=" + this.a + ", retryFailureStatusCode=" + this.b + ", data=" + this.c + ", numSourceDevices=" + this.d + "}";
            }
        }
    }
}

