final class cbc extends ibur implements ibts {
    final cbd a;
    final long b;

    public cbc(cbd cbd0, long v) {
        this.a = cbd0;
        this.b = v;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cbd cbd0 = this.a;
        if(ibuq.m(object0, cbd0.c.e())) {
            return new jlk(cbd0.a(this.b));
        }
        gui gui0 = (gui)cbd0.c.f.a(object0);
        return gui0 == null ? new jlk(0L) : new jlk(((jlk)gui0.a()).a);
    }
}

