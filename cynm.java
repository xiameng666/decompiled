public final class cynm implements Runnable {
    public final cyoi a;
    public final int b;

    public cynm(cyoi cyoi0, int v) {
        this.a = cyoi0;
        this.b = v;
    }

    @Override
    public final void run() {
        cyoi cyoi0 = this.a;
        if(hvpg.bq()) {
            cyoi0.b.f.a();
            int v = cuul.a.nextInt();
            String s = cwfb.y.b(v);
            cyoi0.o(cwfa.a(cwfa.c(s, cxlb.k), s));
        }
        ((ggtj)cyoi0.o.d().ar(0x1F19)).B("SassDeviceConnectionHelper: [%s] Switch back to this seeker", gxyf.b(gxye.q, "START"));
        cyoi0.b.f.h(cyjt.i, cyoi0.c);
        cyoi0.a(this.b, true, false);
    }
}

