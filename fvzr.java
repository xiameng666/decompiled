final class fvzr {
    public int a_batchCondition;
    private long b_lastLocationAgeMillis;
    private long c_lastBatchDataAgeMillis;
    private byte d_mask;

    public final fvzs_BatchInfo a() {
        if(this.d_mask == 3) {
            int v = this.a_batchCondition;
            if(v != 0) {
                return new fvzs_BatchInfo(v, this.b_lastLocationAgeMillis, this.c_lastBatchDataAgeMillis);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a_batchCondition == 0) {
            stringBuilder0.append(" batchCondition");
        }
        if((this.d_mask & 1) == 0) {
            stringBuilder0.append(" lastLocationAgeMillis");
        }
        if((this.d_mask & 2) == 0) {
            stringBuilder0.append(" lastBatchDataAgeMillis");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(long v) {
        this.c_lastBatchDataAgeMillis = v;
        this.d_mask = (byte)(this.d_mask | 2);
    }

    public final void c(long v) {
        this.b_lastLocationAgeMillis = v;
        this.d_mask = (byte)(this.d_mask | 1);
    }
}

