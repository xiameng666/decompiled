public final class bozn implements kar {
    public final int a;
    public final int b;

    public bozn(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // kar
    public final void accept(Object object0) {
        int v = this.a;
        if(v > 0) {
            ((ayvf)object0).e("BATCHES_PER_OVER_QUOTA_OWNERS").a(((long)v), 1L, ayvf.b);
        }
        ((ayvf)object0).e("SENT_BATCHES_PER_TARGET_OWNERS").a(((long)this.b), 1L, ayvf.b);
    }
}

