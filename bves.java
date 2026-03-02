final class bves implements ibtx {
    final hfc a;
    final hmu b;
    final ibth c;
    final String d;

    public bves(hfc hfc0, hmu hmu0, ibth ibth0, String s) {
        this.a = hfc0;
        this.b = hmu0;
        this.c = ibth0;
        this.d = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cmhw cmhw0 = (cmhw)object0;
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(cmhw0, "$this$VisualElement");
        hfc hfc0 = dls.w(this.a);
        ibth ibth0 = cmig.a(cmhw0, this.c);
        gze gze0 = gzf.e(0x667498F9, new bver(this.d), goz0);
        clyd.c(hfc0, this.b, null, ibth0, 0L, gze0, goz0, 0x30000, 20);
        return ibom.a;
    }
}

