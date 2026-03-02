final class cbl extends ibur implements ibts {
    final cbm a;
    final ibts b;

    public cbl(cbm cbm0, ibts ibts0) {
        this.a = cbm0;
        this.b = ibts0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = ((Number)object0).intValue();
        Object object1 = this.a.a.g();
        gui gui0 = (gui)this.a.f.a(object1);
        long v1 = gui0 == null ? 0L : ((jlk)gui0.a()).a;
        Integer integer0 = (int)(-jlf.b(this.a.a(((long)v) & 0xFFFFFFFFL | ((long)v) << 0x20, v1)) + ((int)(v1 & 0xFFFFFFFFL)));
        return this.b.a(integer0);
    }
}

