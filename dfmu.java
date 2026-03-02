final class dfmu implements ibtx {
    final ibth a;
    final boolean b;
    final gui c;

    public dfmu(ibth ibth0, boolean z, gui gui0) {
        this.a = ibth0;
        this.b = z;
        this.c = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "<this>");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dfnd.d(dfnd.a(this.c), this.a, this.b, ((goz)object1), 0);
        return ibom.a;
    }
}

