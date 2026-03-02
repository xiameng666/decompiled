final class dfqk implements ibtx {
    final ibth a;
    final dfqp b;
    final gui c;
    final ibth d;
    final ibth e;
    final boolean f;

    public dfqk(ibth ibth0, dfqp dfqp0, gui gui0, ibth ibth1, ibth ibth2, boolean z) {
        this.a = ibth0;
        this.b = dfqp0;
        this.c = gui0;
        this.d = ibth1;
        this.e = ibth2;
        this.f = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        String s = isq.c(0x7F152D40, goz0);  // string:sharing_settingsreview_visibility_title "Who can share with you"
        gze gze0 = gzf.e(-1685000994, new dfqj(this.b, this.c, this.d, this.e, this.f), goz0);
        ddzs.b(s, this.a, null, null, null, gze0, goz0, 0x180000, 60);
        return ibom.a;
    }
}

