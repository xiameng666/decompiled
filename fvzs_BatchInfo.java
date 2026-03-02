final class fvzs_BatchInfo {
    public final long a_lastLocationAgeMillis;
    public final long b_lastBatchDataAgeMillis;
    public final int c_batchCondition;

    public fvzs_BatchInfo() {
        throw null;
    }

    public fvzs_BatchInfo(int v, long v1, long v2) {
        this.c_batchCondition = v;
        this.a_lastLocationAgeMillis = v1;
        this.b_lastBatchDataAgeMillis = v2;
    }

    static fvzr a() {
        fvzr fvzr0 = new fvzr();
        fvzr0.a_batchCondition = 1;
        fvzr0.c(0x7FFFFFFFFFFFFFFFL);
        fvzr0.b(0x7FFFFFFFFFFFFFFFL);
        return fvzr0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fvzs_BatchInfo)) {
            int v = this.c_batchCondition;
            int v1 = ((fvzs_BatchInfo)object0).c_batchCondition;
            if(v != 0) {
                return v == v1 && this.a_lastLocationAgeMillis == ((fvzs_BatchInfo)object0).a_lastLocationAgeMillis && this.b_lastBatchDataAgeMillis == ((fvzs_BatchInfo)object0).b_lastBatchDataAgeMillis;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.c_batchCondition;
        if(v != 0) {
            return (((int)(this.a_lastLocationAgeMillis ^ this.a_lastLocationAgeMillis >>> 0x20)) ^ (v ^ 1000003) * 1000003) * 1000003 ^ ((int)(this.b_lastBatchDataAgeMillis ^ this.b_lastBatchDataAgeMillis >>> 0x20));
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.c_batchCondition) {
            case 1: {
                return "BatchInfo{batchCondition=INSUFFICIENT, lastLocationAgeMillis=" + this.a_lastLocationAgeMillis + ", lastBatchDataAgeMillis=" + this.b_lastBatchDataAgeMillis + "}";
            }
            case 2: {
                return "BatchInfo{batchCondition=SUFFICIENT_FOR_SENSOR_FUSION, lastLocationAgeMillis=" + this.a_lastLocationAgeMillis + ", lastBatchDataAgeMillis=" + this.b_lastBatchDataAgeMillis + "}";
            }
            case 3: {
                return "BatchInfo{batchCondition=SUFFICIENT_FOR_PARTICLE_FILTER, lastLocationAgeMillis=" + this.a_lastLocationAgeMillis + ", lastBatchDataAgeMillis=" + this.b_lastBatchDataAgeMillis + "}";
            }
            default: {
                return "BatchInfo{batchCondition=null, lastLocationAgeMillis=" + this.a_lastLocationAgeMillis + ", lastBatchDataAgeMillis=" + this.b_lastBatchDataAgeMillis + "}";
            }
        }
    }
}

