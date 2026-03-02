final class cbb extends ibur implements ibts {
    final cbd a;
    final long b;

    public cbb(cbd cbd0, long v) {
        this.a = cbd0;
        this.b = v;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v1;
        Object object1 = ((cld)object0).e();
        cbd cbd0 = this.a;
        long v = 0L;
        if(ibuq.m(object1, cbd0.c.e())) {
            v1 = cbd0.a(this.b);
        }
        else {
            gui gui0 = (gui)cbd0.c.f.a(((cld)object0).e());
            v1 = gui0 == null ? 0L : ((jlk)gui0.a()).a;
        }
        gui gui1 = (gui)cbd0.c.f.a(((cld)object0).f());
        if(gui1 != null) {
            v = ((jlk)gui1.a()).a;
        }
        cgq cgq0 = (cgq)cbd0.b.a();
        if(cgq0 != null) {
            jlk jlk0 = new jlk(v1);
            jlk jlk1 = new jlk(v);
            return cgq0.a.a(jlk0, jlk1);
        }
        return chm.b(0.0f, 400.0f, null, 5);
    }
}

