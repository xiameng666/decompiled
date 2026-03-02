public final class un {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;
    public int o;
    public int p;

    public un() {
        this.a = -1;
        this.b = 0;
        this.c = 0;
        this.d = 1;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final int a() {
        return this.g ? this.b - this.c : this.e;
    }

    public final void b(int v) {
        if((this.d & v) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(v) + " but it is " + Integer.toBinaryString(this.d));
    }

    @Override
    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}

