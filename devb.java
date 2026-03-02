final class devb implements ibtx {
    final deco a;
    final ibts b;
    final dlp c;
    final hpw d;

    public devb(deco deco0, ibts ibts0, dlp dlp0, hpw hpw0) {
        this.a = deco0;
        this.b = ibts0;
        this.c = dlp0;
        this.d = hpw0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        deco deco0 = deco.a;
        ((goz)object1).M(5004770);
        ibts ibts0 = this.b;
        boolean z = ((goz)object1).X(ibts0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new deuz(ibts0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ibth ibth0 = cmig.a(((cmhw)object0), ((ibth)object3));
        gze gze0 = gzf.e(0xE3301075, new deva(this.d), ((goz)object1));
        fite.b(this.c, this.a == deco0, ibth0, gze0, null, false, degg.i, false, null, ((goz)object1), 0x180C00);
        return ibom.a;
    }
}

