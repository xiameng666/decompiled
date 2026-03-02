final class deus implements ibtx {
    final gra a;
    final ibts b;
    final icck c;
    final ibts d;
    final gei e;

    public deus(gra gra0, ibts ibts0, icck icck0, gei gei0, ibts ibts1) {
        this.a = gra0;
        this.b = ibts0;
        this.c = icck0;
        this.e = gei0;
        this.d = ibts1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ((goz)object1).M(-1224400529);
        gra gra0 = this.a;
        int v = ((goz)object1).X(gra0);
        ibts ibts0 = this.b;
        int v1 = v | ((goz)object1).X(ibts0);
        icck icck0 = this.c;
        int v2 = v1 | ((goz)object1).Z(icck0);
        gei gei0 = this.e;
        int v3 = v2 | ((goz)object1).Z(gei0);
        ibts ibts1 = this.d;
        int v4 = ((goz)object1).X(ibts1) | v3;
        Object object3 = ((goz)object1).k();
        if(v4 != 0 || object3 == gop.a) {
            deuq deuq0 = new deuq(ibts0, icck0, ibts1, gra0, gei0);
            ((goz)object1).R(deuq0);
            object3 = deuq0;
        }
        ((goz)object1).A();
        fisl.a(cmig.a(((cmhw)object0), ((ibth)object3)), null, false, null, null, degg.g, ((goz)object1), 0x180000, 62);
        return ibom.a;
    }
}

