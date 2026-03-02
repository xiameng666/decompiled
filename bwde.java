import android.widget.ScrollView;

abstract class bwde implements bwdb {
    private final ibnn a;
    private final ibts b;
    private int c;
    private long d;

    public bwde(icck icck0, bwdm bwdm0) {
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(bwdm0, "uiFlowFlags");
        super();
        this.a = new ibnz(() -> ;);
        bwdd bwdd0 = new bwdd(this);
        ibuq.f(icck0, "<this>");
        this.b = new bwce(new ibvd(), icck0, bwdd0);
        this.d();
    }

    // Detected as a lambda impl.
    protected abstract ScrollView a();

    protected abstract void b(ScrollView arg1);

    @Override  // bwdb
    public final void c() {
        ScrollView scrollView0 = (ScrollView)this.a.a();
        if(scrollView0 != null) {
            int v = scrollView0.getScrollY();
            if(Math.abs(v - this.c) >= 50) {
                long v1 = System.currentTimeMillis();
                if(v1 - this.d >= 100L) {
                    this.c = v;
                    this.d = v1;
                    this.b.a(scrollView0);
                }
            }
        }
    }

    @Override  // bwdb
    public final void d() {
        this.c = 0xC0000000;
        this.d = 0xC000000000000000L;
    }
}

