final class gane implements Runnable {
    private final gano a;
    private final int b;
    private final boolean c;
    private final gank d;
    private final gaoj e;

    public gane(gaoj gaoj0, gano gano0, int v, gank gank0, boolean z) {
        this.e = gaoj0;
        this.a = gano0;
        this.b = v;
        this.d = gank0;
        this.c = z;
    }

    @Override
    public final void run() {
        if(this.c) {
            String s = this.a.f().A;
            String s1 = String.valueOf(this.b);
            ibuq.f(s, "sessionResumptionId");
            ibuq.f(s1, "uniqueId");
            ibuq.f(this.d, "callback");
            evql evql0 = this.e.a.a();
            gaoh gaoh0 = new gaoh(new gaog(s, s1, this.d));
            evql0.y(gblx.a, gaoh0);
            gaoi gaoi0 = new gaoi(this.d);
            evql0.v(gblx.a, gaoi0);
            return;
        }
        String s2 = String.valueOf(this.b);
        ibuq.f(this.a, "actionRequest");
        ibuq.f(s2, "uniqueId");
        ibuq.f(this.d, "callback");
        evql evql1 = this.e.a.a();
        gaoe gaoe0 = new gaoe(new gaod(this.a, s2, this.d));
        evql1.y(gblx.a, gaoe0);
        gaof gaof0 = new gaof(this.d);
        evql1.v(gblx.a, gaof0);
    }
}

