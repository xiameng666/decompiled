final class dejm implements ibtx {
    final ibth a;
    final fyx b;
    final ibth c;

    public dejm(ibth ibth0, fyx fyx0, ibth ibth1) {
        this.a = ibth0;
        this.b = fyx0;
        this.c = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dkd)object0), "$this$FlowRow");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        cmig.f(0x403A4, gzf.e(0x4AAD46BE, new dejh(this.a), ((goz)object1)), ((goz)object1), 54);
        cmig.f(0x403A2, gzf.e(0x8BFC0775, new dejl(this.b, this.c), ((goz)object1)), ((goz)object1), 54);
        return ibom.a;
    }
}

