final class ddeu implements ibtx {
    final ibts a;
    final gra b;
    final ibth c;
    final String d;

    public ddeu(ibts ibts0, gra gra0, ibth ibth0, String s) {
        this.a = ibts0;
        this.b = gra0;
        this.c = ibth0;
        this.d = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ((goz)object1).M(0x97EA02AA);
        ibts ibts0 = this.a;
        int v = ((goz)object1).X(ibts0);
        gra gra0 = this.b;
        int v1 = v | ((goz)object1).X(gra0);
        ibth ibth0 = this.c;
        int v2 = v1 | ((goz)object1).X(ibth0);
        Object object3 = ((goz)object1).k();
        if(v2 != 0 || object3 == gop.a) {
            object3 = new ddet(ibts0, ibth0, gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fcm.d(cmig.a(((cmhw)object0), ((ibth)(((ibwx)object3)))), null, !ibuq.m(ddfh.a(gra0).a(), this.d) && ddfh.a(gra0).a().length() > 0, null, null, null, ddcq.a, ((goz)object1), 0x30000000, 506);
        return ibom.a;
    }
}

